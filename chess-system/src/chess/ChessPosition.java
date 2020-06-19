package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row >8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values range from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	/*public void setColumn(char column) {
		this.column = column;
	} must not be changed */

	public int getRow() {
		return row;
	}

	/*public void setRow(int row) {
		this.row = row;
	} must not be changed */

	/* Matrix row = 8 - chess row
	   Matrix column = chess column - 'a'
	   
	   Columns: a=0, b=1.....h=8
	   'a' - 'a' = 0
	   'b' - 'a' = 1
	   .
	   .
	   .
	   'h' - 'a' = 8*/
	protected Position toPosition() {
		return new Position(8-row, column -'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		
		// "" - forces concatenation
		
		return "" + column + row;
	}
}
