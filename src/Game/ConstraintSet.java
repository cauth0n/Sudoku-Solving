package Game;

public class ConstraintSet {

	private RowConstraints rowConstraints;
	private ColumnConstraints columnConstraints;
	private SquareConstraints squareConstraints;
	
	public ConstraintSet(Tile[][] gameBoard, int i, int j) {
		rowConstraints = new RowConstraints(gameBoard, i, j);
		columnConstraints = new ColumnConstraints(gameBoard, i, j);
		squareConstraints = new SquareConstraints(gameBoard, i, j);
	}

	public RowConstraints getRowConstraints() {
		return rowConstraints;
	}

	public ColumnConstraints getColumnConstraints() {
		return columnConstraints;
	}

	public SquareConstraints getSquareConstraints() {
		return squareConstraints;
	}
	

}
