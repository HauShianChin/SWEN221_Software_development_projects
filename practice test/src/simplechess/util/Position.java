package simplechess.util;

/**
 * Represents a given position on the chess board which is comprised of an
 * (integer) row and column number. For example, "a4" corresponds to row 4 and
 * column 1.
 *
 * @author David J. Pearce
 *
 */
public final class Position {
	private int row; // must be between 1 and 7
	private int column; // must be between 1 and 8

	/**
	 * Construct a position with a given row and column number
	 *
	 * @param row
	 *            The row number for the position.
	 * @param column
	 *            The column number for the position.
	 */
	public Position(int row, int column) {
		if (row < 1 || row > 7) {
			throw new IllegalArgumentException("invalid row \"" + row + "\": must be between 1 and 7");
		} else if (column < 1 || column > 8) {
			throw new IllegalArgumentException("invalid column \"" + column + "\": must be between 1 and 8?");
		}
		this.row = row;
		this.column = column;
	}

	/**
	 * Get the row number for this position.
	 *
	 * @return A number between 1 and 7 representing the row number of this position
	 *         on the board.
	 */
	public int row() {
		return row;
	}

	/**
	 * Get the column number for this position.
	 *
	 * @return A number between 1 and 8 representing the column number of this
	 *         position on the board.
	 */
	public int column() {
		return column;
	}

	/**
	 * Get the absolute difference between the column of this position and the
	 * column of a given position.
	 *
	 * @param position The position being compared against.
	 *
	 * @return A non-negative integer representing the difference in column number
	 *         between this position and the given position.
	 */
	public int getColumnDifference(Position position) {
		return Math.max(column, position.column) - Math.min(column, position.column);
	}

	/**
	 * Get the absolute difference between the column of this position and the
	 * column of a given position.
	 *
	 * @param position The position being compared against.
	 *
	 * @return A non-negative integer representing the difference in row number
	 *         between this position and the given position.
	 */
	public int getRowDifference(Position position) {
		return Math.max(row, position.row) - Math.min(row, position.row);
	}

	/**
	 * Indicates whether this is a valid position on the board.
	 *
	 * @return true if this position is valid and false otherwise.
	 */
	public boolean isValid() {
		return column >= 1 && column <= 8 && row >= 1 && row <= 7;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Position) {
			Position p = (Position) o;
			return row == p.row && column == p.column;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return row ^ column;
	}

	@Override
	public String toString() {
		return ((char)('a'+(column-1))) + Integer.toString(row);
	}

	/**
	 * Construct a position from a string representation in long algebraic notation
	 * which may include a leading character to indicate the kind of piece (e.g.
	 * "e1", "Nd4", "Kd5", etc);
	 *
	 * @param pos
	 * @return An instance of position which cannot be <code>null</code>.
	 */
	public static Position fromString(String pos) {
		// Strip off piece character (if present)
		if(pos.length() > 2) {
			pos = pos.substring(1);
		}
		// Extract row and column information
		int col = (pos.charAt(0) - 'a') + 1;
		int row = Integer.parseInt(pos.substring(1,2));
		return new Position(row,col);
	}
}
