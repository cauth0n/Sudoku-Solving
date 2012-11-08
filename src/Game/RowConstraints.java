package Game;

public class RowConstraints {
	private Tile[] rowConstraints;

	public RowConstraints(Tile[][] gameBoard, int i, int j) {
		getRows(gameBoard, i, j);
	}

	public Tile[] getRowConstraints() {
		return rowConstraints;
	}

	private void getRows(Tile[][] gameBoard, int i, int j) {
		rowConstraints = new Tile[gameBoard.length - 1];
		for (int k = 0; k < gameBoard.length; k++){
			if (gameBoard[k][j].getNum() == gameBoard[i][j].getNum()){
				continue;
			}
			rowConstraints[k] = gameBoard[k][j];
		}
	}

}
