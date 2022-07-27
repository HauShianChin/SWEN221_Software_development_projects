package simplechess.moves;

import simplechess.*;
import simplechess.pieces.*;
import simplechess.util.Position;

/**
 * Represents the movement of a single piece on the board from one position to
 * another. For this move to be valid, the given piece must be permitted to move
 * to the new position.
 *
 * @author David J. Pearce
 *
 */
public class SinglePieceMove implements Move {
	protected Piece piece;
	protected Position startPosition;
	protected Position endPosition;

	/**
	 * Construct a move for a single piece.
	 *
	 * @param piece
	 * @param startPosition
	 * @param endPosition
	 */
	public SinglePieceMove(Piece piece, Position startPosition, Position endPosition) {
		this.piece = piece;
		this.startPosition = startPosition;
		this.endPosition = endPosition;
	}

	/**
	 * @return The piece being moved
	 */
	public Piece piece() {
		return piece;
	}

	@Override
	public boolean isWhite() {
		return piece.isWhite();
	}

	/**
	 * Get the destination position for this move.
	 *
	 * @return The end position for the piece being moved.
	 */
	public Position endPosition() {
		return endPosition;
	}

	@Override
	public boolean isValid(Game game) {
		return startPosition.isValid() && endPosition.isValid() && piece.isValidMove(startPosition, endPosition, null, game);
	}

	@Override
	public void apply(Game game) {
		game.move(startPosition, endPosition);
		
		// FIXME: This method should move the piece at the start position to the end
		// position.  The method Game.move() is helpful here.
	}

	@Override
	public String toString() {
		return pieceChar(piece) + startPosition + "-" + endPosition;
	}

	protected static String pieceChar(Piece p) {
		if(p instanceof Pawn) {
			return "";
		} else if(p instanceof Knight) {
			return "N";
		} else if(p instanceof Bishop) {
			return "B";
		} else if(p instanceof Rook) {
			return "R";
		} else if(p instanceof Queen) {
			return "Q";
		} else {
			return "K";
		}
	}
}
