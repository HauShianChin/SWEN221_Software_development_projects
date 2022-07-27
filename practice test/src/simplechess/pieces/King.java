package simplechess.pieces;

import simplechess.*;
import simplechess.util.Position;

/**
 * Represents a King on the chess board. Kings can move in any direction, but
 * can only move one position at a time.
 *
 * @author David J. Pearce
 *
 */
public class King extends Piece {

	/**
	 * Construct a king of a given colour.
	 *
	 * @param isWhite
	 */
	public King(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean isValidMove(Position startPosition, Position endPosition,
			Piece pieceToTake, Game game) {
		// Calculate difference in column number between start and end
		int diffCol = startPosition.getColumnDifference(endPosition);
		// Calculate difference in row number between start and end
		int diffRow = startPosition.getRowDifference(endPosition);
		// Extract pieces at the start and end position (if any)
		Piece pieceAtStart = game.getPieceAt(startPosition);
		Piece pieceAtEnd = game.getPieceAt(endPosition);
		// Check the rules for moving kings.
		return this.equals(pieceAtStart) && isValidTake(pieceAtEnd, pieceToTake) &&
				(diffCol == 1 || diffRow == 1);
	}

	@Override
	public String toString() {
		if(isWhite) {
			return "K";
		} else {
			return "k";
		}
	}
}
