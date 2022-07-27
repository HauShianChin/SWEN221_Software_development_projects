package simplechess.moves;

import simplechess.*;
import simplechess.pieces.Piece;
import simplechess.util.Position;

/**
 * A move is any move which is permitted by either the white or black player.
 * This includes simple moves (where pieces just take on new positions), take
 * moves (where a piece is taken as well), and check moves (where the opponent
 * is put into check)
 *
 * @author djp
 *
 */
public interface Move {
	/**
	 * Check whether this move is valid or not.
	 *
	 * @param game The current game being checked for validity
	 * @return true if this move in the given game, or false if it is invalid.
	 */
	public boolean isValid(Game game);

	/**
	 * Update the board to reflect the board after the move is played.
	 *
	 * @param game The current game being checked for validity.
	 */
	public void apply(Game game);

	/**
	 * Is this move for white or black?
	 *
	 * @return true (if this move is for White), or false (if it is for Black).
	 */
	public boolean isWhite();


	/**
	 * Construct a move object from a given string in long algebraic notation (e.g.
	 * "e1-d2", "Ne1xBe4", etc);
	 *
	 * @param str     The character string describing the move,
	 * @param isWhite Indicates whether this move is for White or for Black.
	 * @return An instance of Move which cannot be null.
	 */
	public static Move fromString(String str, boolean isWhite) {
		// Determine whether this is a take or a move
		boolean isTake = str.contains("x");
		// Split out both components of move
		String[] components = str.split("x|-|=");
		// Check for game over move first
		if(Character.isDigit(str.charAt(0))) {
			int white = Integer.parseInt(components[0]);
			return null;
		} else {
			// Parse both components.
			Piece piece = Piece.fromString(components[0], isWhite);
			Position start = Position.fromString(components[0]);
			Position end = Position.fromString(components[1]);
			SinglePieceMove move;
			if (isTake) {
				// Construct a take move
				move = new SinglePieceTake(piece,start,end);
			} else {
				// Construct a non-take move
				move = new SinglePieceMove(piece,start,end);
			}
			// Finally, check for promotion
			if(components.length == 3) {
				// Yes, is promotion
				return null;
			} else {
				return move;
			}
		}
	}
}
