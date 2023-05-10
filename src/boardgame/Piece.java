package boardgame;

public abstract class Piece { //peças

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null; // a posição da peça recem criada é nula
	}

	protected Board getBoard() { //somente classes da mesma subclasse de peça pode acessar o tabuleiro 
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	// chama o método abstrato em um método concreto
	public boolean possibleMove(Position position){
		return possibleMoves()[position.getRow()][position.getColumn()];
		
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean [][] mat = possibleMoves();
		for(int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length;j++) {
				if(mat [i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
