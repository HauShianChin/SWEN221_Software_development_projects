package simplechess.pieces;

import simplechess.*;
import simplechess.util.Position;

/**
 * Represents a Pawn on the chess board. Pawns can only move forward one square
 * at a time. Furthermore, pawns can only take pieces in the two forward
 * diagonal squares.
 *
 * @author David J. Pearce
 *
 */
public class Pawn extends Piece {

	/**
	 * Construct a pawn of a given colour.
	 *
	 * @param isWhite
	 */
	public Pawn(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean isValidMove(Position startPosition, Position endPosition,
			Piece pieceToTake, Game game) {
		// Check whether we are moving forward or not
		boolean isForward;
		if(isWhite) {
			// White moves from lower to higher rows
			isForward = startPosition.row() < endPosition.row() && startPosition.getRowDifference(endPosition) == 1;
			
		} else {
			// Black moves from higher to lower rows
			isForward = startPosition.row() > endPosition.row() && startPosition.getRowDifference(endPosition) == 1;
		}
		// Calculate difference in column number between start and end
		int diffCol = startPosition.getColumnDifference(endPosition);
		// Extract pieces at the start and end position (if any)
		Piece pieceAtStart = game.getPieceAt(startPosition);
		Piece pieceAtEnd = game.getPieceAt(endPosition);
		// this logic is more complex than for other pieces, since there is a
		// difference between a take and non-take move for pawns.
		
		if(this.equals(pieceAtStart) && isValidTake(pieceAtEnd,pieceToTake)) {
			if(pieceToTake != null) {
				// This is take move, hence expecting diagnol 
				//need to get pieceToTake's column
				return diffCol == 1 && isForward;
			} else {
				// This is a normal move, hence expecting forwards.
				return diffCol == 0 && isForward;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		if(isWhite) {
			return "P";
		} else {
			return "p";
		}
	}
}
