package simplechess.util;

import simplechess.moves.Move;

/**
 * A round consists of a move by white, and an optional move by black. Note
 * that, only in the very last round of the game is it permitted for black not
 * to have a move.
 *
 * @author David J. Pearce
 *
 */
public class Round {
	/**
	 * The move for white (which cannot be null)
	 */
	private Move white;
	/**
	 * The move for black (which can be null to represent no move)
	 */
	private Move black;

	/**
	 * Create a round from a white move, and an optional black move.
	 *
	 * @param white - whites move; cannot be null;
	 * @param black - blacks move; may be null.
	 */
	public Round(Move white, Move black) {
		if(white == null) {
			throw new IllegalArgumentException("A round must always consist of a move by white");
		}
		this.white = white;
		this.black = black;
	}

	/**
	 * Get the move for white in this round. This is always a move of some kind and
	 * cannot return null.
	 *
	 * @return Returns White's move in this round (cannot be null)
	 */
	public Move white() {
		return white;
	}

	/**
	 * Get the move for black in this round. If there is no move for black, then
	 * this returns null.
	 *
	 * @return Returns black's move in this round (may be null)
	 */
	public Move black() {
		return black;
	}

	@Override
	public String toString() {
		String r = white.toString();
		if(black != null) {
			r += " " + black.toString();
		}
		return r;
	}


	/**
	 * Construct a round from a given string in long algebraic notation (e.g. "e1-e2
	 * d7-d6", etc);
	 *
	 * @param line
	 * @return An instance of Round representing the given string.
	 */
	public static Round fromString(String line) {
		String[] components = line.split(" ");
		Move white = Move.fromString(components[0], true);
		Move black = null;
		if (components.length == 2) {
			black = Move.fromString(components[1], false);
		}
		return new Round(white, black);
	}

}
