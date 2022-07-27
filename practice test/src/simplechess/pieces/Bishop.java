package simplechess.pieces;

import simplechess.*;
import simplechess.util.Position;

/**
 * Represents a bishop on the chess board. Bishops can only move in a diagonal
 * direction, but can move any number of positions.
 *
 * @author David J. Pearce
 *
 */
public class Bishop extends Piece {

	/**
	 * Construct a bishop of a given colour.
	 *
	 * @param isWhite
	 */
	public Bishop(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean isValidMove(Position startPosition, Position endPosition,
			Piece pieceToTake, Game game) {
		// Extract pieces at the start and end position (if any)
		// Calculate difference in column number between start and end
		// Extract pieces at the start and end position (if any)
		Piece pieceAtStart = game.getPieceAt(startPosition);
		Piece pieceAtEnd = game.getPieceAt(endPosition);
		// Check the rules for moving kings.
		return this.equals(pieceAtStart) && isValidTake(pieceAtEnd,pieceToTake)
				&& (game.clearDiaganolExcept(startPosition, endPosition, pieceAtStart, pieceAtEnd)
						|| game.clearDiaganolExcept(startPosition, endPosition, pieceAtStart, pieceAtEnd));
	
		
		
	}

	@Override
	public String toString() {
		if(isWhite) {
			return "B";
		} else {
			return "b";
		}
	}
}
