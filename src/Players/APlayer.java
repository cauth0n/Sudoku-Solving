package Players;

import Game.Tile;

public abstract class APlayer implements IPlayer {
	protected Tile[][] gameBoard;

	public APlayer(Tile[][] gameBoard) {
		this.gameBoard = gameBoard;
	}
	public void notImplementedYet(){
		System.out.println("This section is not implemented quite yet.");
	}
	public boolean isValidAssignment(){
		return true;
	}
	
	public boolean isGameSolved(Tile[][] board){
		boolean valid = false;
		for (int i = 0; i < board.length; i++){
			for (int j = 0; j < board[i].length; j++){
				
			}
		}
		return valid;
	}
	
	public int universalUtility(Tile[][] gameBoard){
		
		return 0;
	}
	
	public int localUtility(Tile[][] board, int row, int col){
		return 0;
	}

}
