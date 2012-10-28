package Game;

public class Tile {

	private int num;
	private Tile[] associatedRows;
	private Tile[] associatedCols;
	private Tile[] associatedSquare;
	
	public Tile(int num, Tile[] associatedRows, Tile[] associatedCols, Tile[] associatedSquare) {
		this.num = num;
		this.associatedRows = associatedRows;
		this.associatedCols = associatedCols;
		this.associatedSquare = associatedSquare;
	}
	
	public void setAssociatedRows(Tile[] associatedRows) {
		this.associatedRows = associatedRows;
	}


	public void setAssociatedCols(Tile[] associatedCols) {
		this.associatedCols = associatedCols;
	}


	public void setAssociatedSquare(Tile[] associatedSquare) {
		this.associatedSquare = associatedSquare;
	}


	public Tile[] getAssociatedRows() {
		return associatedRows;
	}

	public Tile[] getAssociatedCols() {
		return associatedCols;
	}

	public Tile[] getAssociatedSquare() {
		return associatedSquare;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
