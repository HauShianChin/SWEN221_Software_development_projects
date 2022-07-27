// This program is copyright VUW.  You are granted permission to use it to
// construct your answer to a SWEN221 assignment. You may not distribute
// it in any other way without permission.
package snakefall;

import snakefall.events.Event;
import snakefall.events.GameOver;
import snakefall.events.SnakeMove;
import snakefall.io.GameError;
import snakefall.tiles.*;
import snakefall.util.Position;

/**
 * Represents the state of a game of SnakeFall. In particular, the game holds the
 * position of each piece on the board and the list of events.
 *
 * @author David J. Pearce
 *
 */
public class Game {

	/**
	 * Represents one of the four directions in which the snake can move (Up, Down,
	 * Left and Right).
	 *
	 * @author David J. Pearce
	 *
	 */
	public enum Direction {
		UP,
		DOWN,
		LEFT,
		RIGHT
	}

	/**
	 * Stores the width of the board.
	 */
	private int width;

	/**
	 * Stores the height of the board.
	 */
	private int height;

	/**
	 * A 2-dimensional array representing the board itself.
	 */
	private Tile[][] board;

	/**
	 * The array of event which make up this game.
	 */
	private Event[] events;
	
	public int winInt = 2;// neither win nor lose  
	
	public GameOver gO = null; 
	
	public boolean targetTileFound = false; 
	
	public boolean fallen = false; 

	/**
	 * Construct a game of SnakeFall
	 * @param width
	 * @param height
	 *
	 * @param events
	 *            --- The events that make up the game
	 */
	public Game(int width, int height, Event[] events) {
		this.events = events;
		this.width = width;
		this.height = height;
		board = new Tile[height][width];
	}

	/**
	 * Get the height of the game board.
	 *
	 * @return Board height.
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Get the width of the game board.
	 * @return Board width.
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Run this game to produce the final board, whilst also checking each move
	 * against the rules of SnakeFall.
	 */
	public void run()  {
	//if(winInt != 2 ) {return;}
		for(int i=0;i!=events.length;++i) {
			//how to cancel the events 
			Event move = events[i];
			//if(move instanceof GameOver && move.toString().contentEquals("!")) {throw new GameError("you won");}
			move.apply(this);
			applyGravity();
		}
	}

	/**
	 * Get the tile at a given position on the board, or null if no tile at
	 * that position.
	 *
	 * @param position
	 *            Board position to get tile from
	 * @return Tile at given position or null
	 */
	public Tile getTile(Position position) {
		final int x = position.getX();
		final int y = position.getY();
		if(x < 0 || x >= width) {
			return null;
		} else if(y < 0 || y >= height) {
			return null;
		} else {
			return board[position.getY()][position.getX()];
		}
	}

	/**
	 * Set the tile at a given position on the board. Note, this will overwrite
	 * the record of any other tile being at that position.
	 *
	 * @param position
	 *            Board position to place piece on
	 * @param tile
	 *            The tile to put at the given position.
	 */
	public void setTile(Position position, Tile tile) {
		final int x = position.getX();
		final int y = position.getY();
		if(x < 0 || x >= width) {
			return;
		} else if(y < 0 || y >= height) {
			return;
		} else {
			board[position.getY()][position.getX()] = tile;
		}
	}

	/**
	 * Apply gravity to the snake, meaning that it moves down until such time as
	 * either leaves the board entirely or is stopped by some obstruction.
	 */
	

	Boolean gravityHelper(Position[] s) {

		if(this.targetTileFound) {gO = new GameOver(true); return false;}
		if(this.fallen) {gO = new GameOver(false); return false;} //fallen off the mapp false
		
		
	    for (int i = 0; i != s.length; ++i) {
	        if (s[i] != null) {
	            //Position below = 
	        	//if(s[i].getY() == 0) {setTile(s[i], null);}//delete it first uarhgh
	
	        	
	            Tile support = this.getTile(s[i].move(Direction.DOWN)); //support tile
	            if (support != null && support instanceof TargetTile) {
	            	this.targetTileFound = true; // one of the few conditions that is required to have a win outcome 
	            	/*
	            	this.winInt = 1;
	            	Position[] x = Position.transpose(Direction.DOWN, s);//move it down once 
	            	//break;//just incase
	            		for (int k = 0; k < s.length; k++) {
	            			setTile(s[k], null); 
	            			
                    		}//delete
	            	System.out.print("delete");

	            	 for (int j = 0; j < x.length; j++) { 
	                    	setTile(x[j], new SnakeTile(j));  //applying graivty
	                    	
	                    	}*/
	            	 //return false;//returns as soon as it eats it
	            	}
	            else if (support != null &&( support instanceof GroundTile 
	            		|| support instanceof PowerUpTile)) {
	                 return false;
	            } 
	            else if (s[i].move(Direction.DOWN).getY() < 0) { 
	            	this.fallen = true; 
	            	//
	            	//this.winInt = 0; 
	            	//return false;
	            	} 
	            
	        }
	    }
	    return true;
	}

	
	public void applyGravity() {
		//if(winInt != 2) {return;}
		
		
		
		Position[] snake = SnakeMove.findSnake(this);
		Boolean gravity = this.gravityHelper(snake);
		
		while (gravity){
	        
	            if (snake != null){
	            	//at any point in time if the snake's tile is < 0 it hsould delete
	            	
	                if (gravity){
	                    Position[] gravityAp = Position.transpose(Direction.DOWN, snake);
	                    
	                    for (int k = 0; k < snake.length; k++) {
	                    	setTile(snake[k], null); 
	                    	}
	                    for (int j = 0; j < gravityAp.length; j++) { 
	                    	setTile(gravityAp[j], new SnakeTile(j));  //applying graivty
	                    	}
	                    
	                }
	               
	            }
	            
	            snake = SnakeMove.findSnake(this);
	            
	            gravity = this.gravityHelper(snake);
	            
	        
	        //if(winInt != 3) {return;}//signal game over
	        
	    }
		
		/*
		boolean supported = false; 
		Position[] snake = SnakeMove.findSnake(this);// finding snkae position temp
		
		System.out.println(snake); 
		
		//Tile tail = this.getTile(snake[snake.length - 1]);//getting the snake's tail

		Position p = snake[snake.length - 1];//position of the snake's tail
		
		//for(Position p: snake) {
			Position support = new Position(p.getX(), p.getY() - 1); // tile below the snake's tail
			//get the 
			if(getTile(support) != null && getTile(support).providesSupport()) { supported = true; }
		//}
		//need to get tile at that speicifc position
		
		System.out.println();
		if(!supported) {
			Position[] newSnake = Position.transpose(Direction.DOWN, snake);
			
			for(int i = 0; i < snake.length; i++) {
				setTile(snake[i], null);
			}
			
			for(int i = 0; i < newSnake.length; i++) {
				setTile(newSnake[i], new SnakeTile(i));
			}
			
			applyGravity();
			
		}
		
		/*
		Tile next = getTile(p);
			
		if(this.getTile(support) != null &&!this.getTile(support).providesSupport() && this.getTile(support) instanceof GroundTile){
			//Game.setTile(support, tail); 
			//applyGravity();
			 for(Position i: snake) {
	                setTile(i, getTile(i) - 1);
	                
	                }
	            }
			
	*/
			

		//!this.getTile(support).providesSupport()
		//find the snake's tail's tile, see if the tile below the snake's tail's tile is support. 
		
		
		
		
		// NOTE: to implement this method, we need to find the snake. Then we need to
		// decide if the snake is supported. Finally, if the snake is not supported,
		// then we need to move it down.  At this point, we can repeat the process.
	}


	
	/**
	 * Provide a human-readable view of the current game board. This is
	 * particularly useful to look at when debugging your code!
	 */
	@Override
	public String toString() {
		String r = "";
		for (int i = height - 1; i >= 0; --i) {
			r += (i%10) + "|";
			for (int j = 0; j != width; ++j) {
				Tile p = board[i][j];
				if (p == null) {
					r += " ";
				} else {
					r += p.toString();
				}
			}
			r += "|\n";
		}
		r += "  ";
		// Do the X-Axis
		for (int j = 0; j != width; ++j) {
			r += (j%10);
		}
		return r;
	}

	/**
	 * Initialse the board from a given input board. This includes the placement
	 * of all terrain and pieces.
	 * @param boardString String representing board.
	 */
	public void initialiseBoard(String boardString) {
		// You don't need to understand this!
		String[] rows = boardString.split("\n");
		for(int y=0;y!=height;++y) {
			String row = rows[y];
			for(int x=0;x!=width;++x) {
				char c = row.charAt(x+2);
				board[height-(y+1)][x] = createPieceFromChar(c);
			}
		}
	}

	public Tile createPieceFromChar(char c) {
		switch(c) {
		case '_':
			return null; // blank space
		case 'O':
			return new SnakeTile(0);
		case 'A':
			return new SnakeTile(1);
		case 'B':
			return new SnakeTile(2);
		case 'C':
			return new SnakeTile(3);
		case 'D':
			return new SnakeTile(4);
		case '#':
			return new GroundTile();
		case '*':
			return new PowerUpTile();
		case '@':
			return new TargetTile();
		}
		// dummy
		return null;
	}
	
	public int getState() {
		if(this.fallen) {return -1;}//lost
		else if(this.targetTileFound) {return 1;}//won
		else {return 0;}
	}
}
