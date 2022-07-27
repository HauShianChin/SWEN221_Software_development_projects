package simplechess.pieces;

import simplechess.*;
import simplechess.util.Position;

/**
 * Represents a Queen on the chess board. Queens can move in any direction and,
 * furthermore, can move any number of squares. They are the most powerful piece
 * on the board.
 *
 * @author David J. Pearce
 *
 */
public class Queen extends Piece {
	/**
	 * Construct a queen of a given colour.
	 *
	 * @param isWhite
	 */
	public Queen(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean isValidMove(Position startPosition, Position endPosition,
			Piece pieceToTake, Game game) {
		// FIXME: need to implement this method!
		// Extract pieces at the start and end position (if any)
				// Calculate difference in column number between start and end
				// Extract pieces at the start and end position (if any)
				Piece pieceAtStart = game.getPieceAt(startPosition);
				Piece pieceAtEnd = game.getPieceAt(endPosition);
				// Check the rules for moving kings.
				return this.equals(pieceAtStart) && isValidTake(pieceAtEnd,pieceToTake)
						&& (game.clearDiaganolExcept(startPosition, endPosition, pieceAtStart, pieceAtEnd)
								|| game.clearDiaganolExcept(startPosition, endPosition, pieceAtStart, pieceAtEnd)
						|| (game.clearColumnExcept(startPosition, endPosition, pieceAtStart, pieceAtEnd)
								|| game.clearRowExcept(startPosition, endPosition, pieceAtStart, pieceAtEnd)));

	}

	@Override
	public String toString() {
		if(isWhite) {
			return "Q";
		} else {
			return "q";
		}
	}
}
