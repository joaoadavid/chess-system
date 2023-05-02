package boardgame;

public class Board {// tabuleiro
	
	private int rows; // linhas do tabuleiro
	private int columns; // coluna do tabuleiro
	private Piece [][] pieces; //matriz de peças
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece [rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
	
	

}
