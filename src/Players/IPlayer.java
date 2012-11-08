package Players;

import Game.Tile;

public interface IPlayer {
	public boolean isValidAssignment();
	public boolean isGameSolved(Tile[][] board);
	public int universalUtility(Tile[][] board);
	public int localUtility(Tile[][] board, int row, int col);
}
