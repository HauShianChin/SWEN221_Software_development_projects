package simplechess.moves;

import simplechess.*;
import simplechess.pieces.Piece;
import simplechess.util.Position;

/**
 * Represents the movement of a single piece on the board from one position to
 * another and taking a piece at that position. For this move to be valid, the
 * given piece must be permitted to move to the new position. Furthermore, the
 * piece being taken must be currently at that position.
 *
 * @author David J. Pearce
 *
 */
public class SinglePieceTake extends SinglePieceMove {
	/**
	 * Construct a SinglePieceTake
	 *
	 * @param piece         The piece which is doing the take
	 * @param isTaken       The piece being taken.
	 * @param startPosition The start position for the piece doing the take.
	 * @param endPosition   The end position of the take (i.e. the position of the
	 *                      piece being taken).
	 */
	public SinglePieceTake(Piece piece, Position startPosition, Position endPosition) {
		// FIXME: should pass startPosition and endPosition to super constructor.
		
		super(piece,startPosition,endPosition);
	}

	@Override
	public boolean isValid(Game game) {
		// Extract the piece to take
		Piece pieceToTake = game.getPieceAt(endPosition);
		// Check whether move is valid
		return pieceToTake != null && piece.isValidMove(startPosition, endPosition, pieceToTake, game);
	}

	@Override
	public String toString() {
		return pieceChar(piece) + startPosition + "x" + endPosition;
	}
}
