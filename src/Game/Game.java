package Game;

import java.util.Scanner;

import Players.ACO;
import Players.APlayer;
import Players.BJ;
import Players.CDBJ;
import Players.FC;
import Players.GA;
import Players.HC;
import Players.PSO;
import Players.Randomize;
import Players.SA;

public class Game {
	private Tile[][] gameBoard;
	private final int boardSize = 9;
	private APlayer player;

	public Game(String[] puzzle) {
		buildBoard(puzzle);
		playerSelect(chooser());
	}

	public void playerSelect(int choice) {
		switch (choice) {
		case 1:
			player = new Randomize(gameBoard);		//Randomize
			break;
		case 2:
			player = new GA(gameBoard);		//Genetic Algorithm
			break;
		case 3:
			player = new FC(gameBoard);		//Forward Checking
			break;
		case 4:
			player = new BJ(gameBoard);		//Back Jumping
			break;
		case 5:
			player = new CDBJ(gameBoard);	//Conflict-Directed Back Jumping
			break;
		case 6:
			player = new PSO(gameBoard);	//Particle Swarm Optimization
			break;
		case 7:
			player = new HC(gameBoard);		//Hill Climbing
			break;
		case 8:
			player = new SA(gameBoard);		//Simulate Annealing
			break;
		case 9:
			player = new ACO(gameBoard);	//Ant Colony Optimization
			break;
		default:
			System.out.println("Invalid choice. Try again later.");
			break;
		}
	}

	public int chooser() {
		System.out.println("Enter a value for the player selection:");
		Scanner in = new Scanner(System.in);
		printMenu();
		int choice = in.nextInt();
		return choice;
	}

	public void printMenu() {
		System.out.println("1: Random");
		System.out.println("2: Genetic Algorithm");
		System.out.println("3: Forward Checking");
		System.out.println("4: Backjumping");
		System.out.println("5: Conflich Directed Backjumping");
		System.out.println("6: Particle Swarm Optimization");
		System.out.println("7: Hill Climbing");
		System.out.println("8: Simulated Annealing");
		System.out.println("9: Ant Colony Optimization");
	}
	
	public void initializeBoard(){
		for (int i = 0; i < boardSize; i++){
			for (int j = 0 ; j < boardSize; j++){
				gameBoard[i][j] = new Tile(0);
			}
		}
	}
	public void assignNums(String[] puzzle){
		for (int i = 0; i < boardSize; i++) {
			char[] charLine = puzzle[i].toCharArray();
			for (int j = 0; j < 9; j++) {
				String c = charLine[j] + "";
				gameBoard[i][j].setNum(Integer.parseInt(c));
			}
		}
	}


	public void buildBoard(String[] puzzle) {
		gameBoard = new Tile[boardSize][boardSize];
		initializeBoard();
		assignNums(puzzle);
	}

	public void printColSeparator() {
		System.out.print("|");
	}

	public void printRowSeparator() {
		System.out.println("----------------- ");
	}

	public void printBoard() {
		int j = 1;
		for (Tile[] row : gameBoard) {
			int i = 1;
			for (Tile b : row) {
				System.out.print(b.getNum());
				if (i % 3 == 0 && i != 9) {
					printColSeparator();
				} else {
					System.out.print(" ");
				}
				i++;
			}
			System.out.println();
			if (j % 3 == 0 && j != 9) {
				printRowSeparator();
			}
			j++;
		}
	}

}
