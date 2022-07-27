package simplechess.pieces;

import simplechess.*;
import simplechess.util.Position;

/**
 * Represents a Rook on the chess board. Rooks can only move in a horizontal or
 * vertical direction (i.e. not on a diagonal), but can move any number of
 * squares.
 *
 * @author David J. Pearce
 *
 */
public class Rook extends Piece {
	/**
	 * Construct a rook of a given colour.
	 *
	 * @param isWhite
	 */
	public Rook(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean isValidMove(Position startPosition, Position endPosition, Piece pieceToTake, Game game) {
		// Extract pieces at the start and end position (if any)
		Piece pieceAtStart = game.getPieceAt(startPosition);
		Piece pieceAtEnd = game.getPieceAt(endPosition);
		// Check the rules for moving rooks
		return this.equals(pieceAtStart) && isValidTake(pieceAtEnd,pieceToTake)
				&& (game.clearColumnExcept(startPosition, endPosition, pieceAtStart, pieceAtEnd)
						|| game.clearRowExcept(startPosition, endPosition, pieceAtStart, pieceAtEnd));
	}

	@Override
	public String toString() {
		if (isWhite) {
			return "R";
		} else {
			return "r";
		}
	}
}
