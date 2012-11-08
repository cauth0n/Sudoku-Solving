package Game;

public class ColumnConstraints {
	private Tile[] columnConstraints;

	public ColumnConstraints(Tile[][] gameBoard, int i, int j) {
		getColumns(gameBoard, i, j);
	}

	public Tile[] getColumnConstraints() {
		return columnConstraints;
	}

	private void getColumns(Tile[][] gameBoard, int i, int j) {
		columnConstraints = new Tile[gameBoard.length - 1];
		for (int k = 0; k < gameBoard.length; k++) {
			if (gameBoard[i][k].getNum() == gameBoard[i][j].getNum()) {
				continue;
			}
			columnConstraints[k] = gameBoard[i][j];
		}
	}

}
