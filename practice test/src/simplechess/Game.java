package simplechess;

import simplechess.moves.*;
import simplechess.pieces.*;
import simplechess.util.Position;
import simplechess.util.Round;

/**
 * Represents a game of chess, which consists of the state of each piece on the
 * board along with a store of all the pieces which have been captured. The
 * latter is needed to handle correct pawn promotion.
 *
 * @author David J. Pearce
 *
 */
public class Game {

	/**
	 * The current state of the chess board.
	 */
	private Piece[][] pieces;

	/**
	 * Construct a new game with the starting arrangement for the chess board.
	 */
	public Game() {
		this.pieces = createStartingBoard();
	}

	/**
	 * Get the piece currently at a given position in the game.
	 *
	 * @param pos
	 * @return The piece at a given position on the board.
	 */
	public Piece getPieceAt(Position pos) {
		return pieces[pos.row()][pos.column()];
	}

	/**
	 * Apply the moves in a sequence of rounds to the game board. As soon as we
	 * encounter one invalid move, then we stop immediately and don't apply any more
	 * moves.
	 *
	 * @param rounds
	 *            The sequence of move rounds to apply
	 * @return true if rounds applied successfully, false otherwise.
	 */
	public boolean apply(Round[] rounds) {
		for (Round r : rounds) {
			// Apply white's move
			if (!apply(r.white())) {
				// failed applying white's move
				return false;
			} else if (r.black() != null && !apply(r.black())) {
				// failed applying black's move
				return false;
			}
		}
		return true;
	}

	/**
	 * Apply a given move to the board. If the move is not valid, then nothing is
	 * changed. Otherwise, the board is updated to reflect the state of the game
	 * after the move.
	 *
	 * @param move
	 * @return true if the move is valid, and false otherwise.
	 */
	public boolean apply(Move move) {
		// Check whether move valid for this game.
		if (move.isValid(this)) {
			// Move is valid, so apply it.
			move.apply(this);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Move a piece from one position to another. If there is another piece at the
	 * new position, then it will be overwritten.
	 *
	 * @param startPosition
	 *            Position piece is moving from.
	 * @param endPosition
	 *            Position piece is moving to.
	 */
	public void move(Position startPosition, Position endPosition) {
		Piece p = pieces[startPosition.row()][startPosition.column()];
		pieces[endPosition.row()][endPosition.column()] = p;
		pieces[startPosition.row()][startPosition.column()] = null;
	}

	/**
	 * The following method checks whether the given diaganol is completely clear,
	 * except for a given set of pieces. Observe that this doesn't guarantee a given
	 * diaganol move is valid, since this method does not ensure anything about the
	 * relative positions of the given pieces.
	 *
	 * @param startPosition - start of diaganol
	 * @param endPosition   - end of diaganol
	 * @param exceptions    - the list of pieces allowed on the diaganol
	 * @return true if the diagonal is clear except the given piece(s).
	 */
	public boolean clearDiaganolExcept(Position startPosition, Position endPosition, Piece... exceptions) {
		int startCol = startPosition.column();
		int endCol = endPosition.column();
		int startRow = startPosition.row();
		int endRow = endPosition.row();
		// Calculate the difference in row and column between start and end positions.
		int diffCol = Math.max(startCol, endCol) - Math.min(startCol, endCol);
		int diffRow = Math.max(startRow, endRow) - Math.min(startRow, endRow);
		// Check that difference in columns and rows is the same (i.e. is a diagonal)
		// and that start and end are not the same.
		if (diffCol != diffRow || diffCol == 0) {
			return false;
		} else {
			int row = startRow;
			int col = startCol;
			while (row != endRow && col != endCol) {
				Piece p = pieces[row][col];
				if (p != null && !contains(p, exceptions)) {
					return false;
				}
				col = col <= endCol ? col + 1 : col - 1;
				row = row <= endRow ? row + 1 : row - 1;
			}
		}
		return true;
	}

	/**
	 * The following method checks whether the given column is completely clear,
	 * except for a given set of pieces. Observe that this doesn't guarantee a given
	 * column move is valid, since this method does not ensure anything about the
	 * relative positions of the given pieces.
	 *
	 * @param startPosition
	 *            - start of column
	 * @param endPosition
	 *            - end of column
	 * @param exceptions
	 *            - the list of pieces allowed on the column
	 * @return true if the column is clear except the given piece(s).
	 */
	public boolean clearColumnExcept(Position startPosition, Position endPosition, Piece... exceptions) {
		//FIXME: need to implement this method!
		int minCol = Math.min(startPosition.column(), endPosition.column());
		int maxCol = Math.max(startPosition.column(), endPosition.column());
		int minRow = Math.min(startPosition.row(), endPosition.row());
		int maxRow = Math.max(startPosition.row(), endPosition.row());
		// Calculate the difference in row and column between start and end positions.
		int diffCol = maxCol - minCol;
		int diffRow = maxRow - minRow;
		// Check no difference in row between start and end, and that is some
		// difference in row.
		if (diffCol != 0 || diffRow == 0) {//make sure it's the same row 
			return false;
		} else {
			int row = minRow;
			while (row <= maxRow) {
				Piece p = pieces[row][minCol];
				if (p != null && !contains(p, exceptions)) {
					return false;
				}
				row++;
			}
		}
		return true;
	}

	/**
	 * The following method checks whether the given row is completely clear, except
	 * for a given set of pieces. Observe that this doesn't guarantee a given row
	 * move is valid, since this method does not ensure anything about the relative
	 * positions of the given pieces.
	 *
	 * @param startPosition
	 *            - start of row
	 * @param endPosition
	 *            - end of row
	 * @param exceptions
	 *            - the list of pieces allowed on the row
	 * @return true if the row is clear except the given piece(s).
	 */
	public boolean clearRowExcept(Position startPosition, Position endPosition, Piece... exceptions) {
		int minCol = Math.min(startPosition.column(), endPosition.column());
		int maxCol = Math.max(startPosition.column(), endPosition.column());
		int minRow = Math.min(startPosition.row(), endPosition.row());
		int maxRow = Math.max(startPosition.row(), endPosition.row());
		// Calculate the difference in row and column between start and end positions.
		int diffCol = maxCol - minCol;
		int diffRow = maxRow - minRow;
		// Check no difference in column between start and end, and that is some
		// difference in row.
		if (diffRow != 0 || diffCol == 0) {
			return false;
		} else {
			int col = minCol;
			while (col <= maxCol) {
				Piece p = pieces[minRow][col];
				if (p != null && !contains(p, exceptions)) {
					return false;
				}
				col++;
			}
		}
		return true;
	}

	/**
	 * Check whether a given piece is contained in an array of pieces.
	 *
	 * @param p1
	 *            Piece to look for
	 * @param pieces
	 *            Array of pieces to look within
	 * @return
	 */
	private static boolean contains(Piece p1, Piece... pieces) {
		for (Piece p2 : pieces) {
			if (p1 == p2) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Provides a textual representation of the Chess board.
	 */
	@Override
	public String toString() {
		String r = "";
		for (int row = 7; row != 0; row--) {
			r += row + "|";
			for (int col = 1; col <= 8; col++) {
				Piece p = pieces[row][col];
				if (p != null) {
					r += p + "|";
				} else {
					r += "_|";
				}
			}
			r += "\n";
		}
		return r + "  a b c d e f g h";
	}

	/**
	 * Parse a given game in long algebraic notation into an array of rounds. In the
	 * last round, black is permitted to be <code>null</code> to indicate he/she
	 * wasn't given a chance to play.
	 *
	 * @param text
	 * @return A non-null array consisting of zero or more Round objects.
	 */
	public static Round[] fromLongAlgebraicString(String text) {
		String[] lines = text.split(";");
		Round[] rounds = new Round[lines.length];
		for (int i = 0; i != rounds.length; ++i) {
			rounds[i] = Round.fromString(lines[i].trim());
		}
		return rounds;
	}

	/**
	 * Create the initial board according to the standard layout. Note that, for
	 * simplified chess, the board is slightly smaller than normal. The default
	 * layout looks like this:
	 *
	 * <pre>
	 * 7|r|n|b|q|k|b|n|r|
	 * 6|p|p|p|p|p|p|p|p|
	 * 5|_|_|_|_|_|_|_|_|
	 * 4|_|_|_|_|_|_|_|_|
	 * 3|_|_|_|_|_|_|_|_|
	 * 2|P|P|P|P|P|P|P|P|
	 * 1|R|N|B|Q|K|B|N|R|
	 *   a b c d e f g h
	 * </pre>
	 *
	 * @return
	 */
	private static Piece[][] createStartingBoard() {
		Piece[][] pieces = new Piece[8][9];

		// Place pawns
		for (int i = 1; i <= 8; ++i) {
			pieces[2][i] = new Pawn(true);
			pieces[6][i] = new Pawn(false);
		}
		// Place rooks
		pieces[1][1] = new Rook(true);
		pieces[1][8] = new Rook(true);
		pieces[7][1] = new Rook(false);
		pieces[7][8] = new Rook(false);
		// Place knights
		pieces[1][2] = new Knight(true);
		pieces[1][7] = new Knight(true);
		pieces[7][2] = new Knight(false);
		pieces[7][7] = new Knight(false);
		// Place bishops
		pieces[1][3] = new Bishop(true);
		pieces[1][6] = new Bishop(true);
		pieces[7][3] = new Bishop(false);
		pieces[7][6] = new Bishop(false);
		// Place king + queen
		pieces[1][4] = new Queen(true);
		pieces[1][5] = new King(true);
		pieces[7][4] = new Queen(false);
		pieces[7][5] = new King(false);
		//
		return pieces;
	}
}