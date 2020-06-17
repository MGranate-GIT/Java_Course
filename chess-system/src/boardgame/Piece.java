package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		/*position = null; ------ no need*/ 
	}

	/*public --- only classes in this package can access the Board*/
	protected Board getBoard() {
		return board;
	}

	/*
	public void setBoard(Board board) {
		this.board = board;
	} ----- Board must not be changed*/
}
