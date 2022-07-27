// This program is copyright VUW.  You are granted permission to use it to
// construct your answer to a SWEN221 assignment. You may not distribute
// it in any other way without permission.
package snakefall.events;

import snakefall.Game;
import snakefall.Game.Direction;
import snakefall.io.GameError;
import snakefall.tiles.GroundTile;
import snakefall.tiles.PowerUpTile;
import snakefall.tiles.TargetTile;
import snakefall.tiles.Tile;
import snakefall.util.Position;

/**
 * Represents the end of the game as a result of either the target tile being
 * taken, or the snake falling of the board in some way.
 *
 * @author David J. Pearce
 *
 */
public class GameOver implements Event {
	/**
	 * Indicates whether the game was won (true) or lost (false).
	 */
	private boolean won;

	/**
	 * Construct a new GameOver event which indicates whether or not the game was
	 * won.
	 *
	 * @param won This is true if the game was won, or false otherwise.
	 */
	public GameOver(boolean won) {
		this.won = won;
	}
	
	public String toString() {
		if(won) {return "!";}
		else {return "?";}
	}
	
	@Override
	public void apply(Game game) {
		if(game.getState() == 0) {throw new GameError("game over");}
		else if(game.getState() == 1) {
			if(!won) {
			throw new GameError("expected win, actual lost");}
			}
		else if(game.getState() == -1) { 
			if(won) {
				throw new GameError("expected lost, actual win");}
			}
		else {throw new GameError("undefined");}
/*
		if(game.winInt == 2 && won) {
			throw new GameError("lost");
		}
		else if(game.winInt == 1 && !won) {
			throw new GameError("lost");
		}
		else if(game.winInt == 0 && won) {
			throw new GameError("lost");
		}
		else if(game.winInt == 2 && !won) {
			throw new GameError("lost");
		}
		
		//if won == true; congrats them
		//if won == false; say it's game over 
		
		
		/*
		Position[] s = SnakeMove.findSnake(game);// get the snake's location
		
		for(Position p: s) {
			
			if(game.getTile(p) == )
			
		}
		
		/*

		for (int i = 0; i != s.length; ++i) {
	        if (s[i] != null) {
	            //Position below = 
	            Tile support = game.getTile(s[i].move(Direction.DOWN)) //support tile 
	            else if (s[i].move(Direction.DOWN).getY() < 0) { return false;} 
	        }
	    }
	    return true;
		/* check if it falls off the map 
		
		for (int k = 0; k < snake.length; k++) {
        	//Tile s = game.getTile(snake[k]); //get all the snake's tiles 
        		//if(s.getY() < 0) {this.won = false;}
			if(snake[i] != null) {} 			
        	}
		*/
	}
}


