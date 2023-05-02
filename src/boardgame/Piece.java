package boardgame;

public class Piece { //peças

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null; // a posição da peça recem criada é nula
	}

	protected Board getBoard() { //somente classes da mesma subclasse de peça pode acessar o tabuleiro 
		return board;
	}

}
