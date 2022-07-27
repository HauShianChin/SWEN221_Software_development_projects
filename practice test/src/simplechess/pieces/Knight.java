package simplechess.pieces;

import simplechess.*;
import simplechess.util.Position;

/**
 * Represents a Knight on the chess board. Knights moved in a "hooked" fashion.
 * Specifically, they can move squares in one direction and one square in
 * another direction.
 *
 * @author David J. Pearce
 *
 */
public class Knight extends Piece {

	/**
	 * Construct a knight of a given colour.
	 *
	 * @param isWhite
	 */
	public Knight(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean isValidMove(Position startPosition, Position endPosition,
			Piece pieceToTake, Game game) {
		// Calculate difference in column number between start and end
		int diffCol = startPosition.getColumnDifference(endPosition);
		// Calculate difference in row number between start and end
		int diffRow = startPosition.getRowDifference(endPosition);
		//
		Piece pieceAtStart = game.getPieceAt(startPosition);
		Piece pieceAtEnd = game.getPieceAt(endPosition);
		return this.equals(pieceAtStart)&& isValidTake(pieceAtEnd, pieceToTake) 
				&& (diffCol == 2 && diffRow == 1 || diffCol == 1 && diffRow==2);
	}

	@Override
	public String toString() {
		if(isWhite) {
			return "N";
		} else {
			return "n";
		}
	}
}
