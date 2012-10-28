package Game;

public abstract class APlayer implements IPlayer {

	public APlayer() {
		// TODO Auto-generated constructor stub 
	}
	public boolean isValudAssignment(){
		return true;
	}
	
	public boolean isGameSolved(Tile[][] board){
		boolean valid = false;
		for (Tile[] row : board){
			for (Tile t : row){
				
			}
		}
		return valid;
	}

}
