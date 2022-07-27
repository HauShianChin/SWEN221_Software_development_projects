// This program is copyright VUW.  You are granted permission to use it to
// construct your answer to a SWEN221 assignment. You may not distribute
// it in any other way without permission.
package snakefall.events;

import java.util.Arrays;

import snakefall.Game;
import snakefall.Game.Direction;
import snakefall.io.GameError;
import snakefall.io.Parser;
import snakefall.tiles.PowerUpTile;
import snakefall.tiles.SnakeTile;
import snakefall.tiles.TargetTile;
import snakefall.tiles.Tile;
import snakefall.util.Position;

/**
 * Represents a directional move of the snake within a given .
 *
 * @author David J. Pearce
 *
 */
public class SnakeMove implements Event {
	private final Direction direction;
	private boolean eaten = false; 

	/**
	 * Construct a new snake move object for a given direction.
	 *
	 * @param direction
	 */
	public SnakeMove(Direction direction) {
		this.direction = direction;
	}
	
	public boolean getEaten() {
		return eaten; 
	}
	
	@Override
	public void apply(Game game) {
		
		//if(stop) {return;}
		// Identify all sections of the snake
		Position[] snake = findSnake(game);
		// Calculate next position of snake head
		Position next = snake[0].move(direction);
		Tile nextTile = game.getTile(next);
		//Tile t = null; 
		/*
		if(game.getTile(next) instanceof PowerUpTile) {
			 char c = game.getTile(snake[snake.length - 1]).toString().charAt(0); //current tail
		
			 c++;
			 System.out.println("our new tile: " + c);
			 t = game.createPieceFromChar(c); //creating a piece form character \
			// System.out.println(t.toString());
		}
		*/
		// Move each section along where the head moves in the direction of movement and
		// all others follow the previous section.
		if(nextTile != null && nextTile.isObstruction() ) {return; }//if next move is obsturction it shouldn't do anything
		for (int i = 0; i != snake.length; ++i) {
			// Set tile on board
					
			game.setTile(next, new SnakeTile(i));
			// Configure location for next section
			next = snake[i];
			
		}
		if(nextTile != null 
				&& nextTile instanceof TargetTile) {game.targetTileFound = true; }
		if(nextTile instanceof PowerUpTile) {game.setTile(next, new SnakeTile(snake.length)); }//if next move is obsturction it shouldn't do anything
		
		// Remove old tail section
		else{game.setTile(next, null);}
		game.applyGravity();
	}

	/**
	 * Find the positions making up the snake, returning them in order starting from
	 * the head.
	 *
	 * @param game
	 * @return Positions making up the snake in section order.
	 */
	public static Position[] findSnake(Game game) {
		int length = 0;
		// Snake has at most five sections
		Position[] sections = new Position[5];
		// Find all sections
		for (int x = 0; x < game.getWidth(); ++x) {
			for (int y = 0; y < game.getHeight(); ++y) {
				Position p = new Position(x,y);
				// Extract tile at x,y position
				Tile t = game.getTile(p);
				// Check whether is part of snake
				if(t instanceof SnakeTile) {
					SnakeTile st = (SnakeTile) t;
					sections[st.getSection()] = p;
					length = length + 1;
				}
			}
		}
		// Trim the array down to size
		sections = Arrays.copyOf(sections,length);
		// Done
		return sections;
	}
}
