package simplechess.pieces;

import simplechess.*;
import simplechess.util.Position;

/**
 * Provides an abstract base class which concrete pieces (e.g. Pawns, Bishops,
 * etc) can inherit. Since every piece needs to know its colour, we can factor
 * this out here.
 *
 * @author David J. Pearce
 *
 */
public abstract class Piece {
	protected boolean isWhite;

	/**
	 * Construct an abstract piece which is either White or Black.
	 *
	 * @param isWhite true indicates this piece is White; false indicates it is
	 *                Black.
	 */
	public Piece(boolean isWhite) {
		this.isWhite = isWhite;
	}

	/**
	 * Determine whether this piece is white or black.
	 *
	 * @return true (if this piece is White) or (false if it is Black).
	 */
	public boolean isWhite() {
		return isWhite;
	}

	/**
	 * Check whether or not a given move on a given board is valid. For takes, the
	 * piece being taken must be supplied.
	 *
	 * @param startPosition --- position of this piece before move.
	 * @param endPosition   --- position of this piece after move.
	 * @param pieceToTake   --- piece being taken, or null if no piece taken.
	 * @param game          --- game board on which the validity of this move is
	 *                      being checked.
	 * @return true if this is a valid move for the given game, or false if it is
	 *         not valid.
	 */
	public abstract boolean isValidMove(Position startPosition,
			Position endPosition, Piece pieceToTake, Game game);

	/**
	 * Check whether the actual piece taken matches the indicated piece to be taken.
	 * If the taken piece is <code>null</code> then no piece is supposed to be taken
	 * (i.e. the actual piece should be null);
	 *
	 * @param actualTaken   The actual piece being taken (or <code>null</code> if no
	 *                      piece is actually being taken).
	 * @param expectedTaken The expected piece being taken (or <code>null</code> if
	 *                      no piece is expected to be taken).
	 * @return true if actual and expected pieces are consistent.
	 */
	public boolean isValidTake(Piece actualTaken, Piece expectedTaken) {
		if(actualTaken == null && expectedTaken == null) {
			return true;
		} else if(actualTaken != null && actualTaken.equals(expectedTaken) && isWhite == !actualTaken.isWhite) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Piece) {
			Piece p = (Piece) o;
			return o.getClass() == getClass() && isWhite == p.isWhite;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Boolean.hashCode(isWhite);
	}

	/**
	 * Construct a concrete piece from a given character representing that piece
	 * (e.g. "B", "N", etc).
	 *
	 * @param str
	 * @param isWhite
	 * @return A piece which cannot be <code>null</code>.
	 */
	public static Piece fromString(String str, boolean isWhite) {
		switch(str.charAt(0)) {
		case 'N':
			return new Knight(isWhite);
		case 'B':
			return new Bishop(isWhite);
		case 'R':
			return new Rook(isWhite);
		case 'K':
			return new King(isWhite);
		case 'Q':
			return new Queen(isWhite);
		default:
			return new Pawn(isWhite);
		}
	}
}