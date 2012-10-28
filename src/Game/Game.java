package Game;

import java.util.Scanner;

public class Game {
	private Tile[][] gameBoard;
	private APlayer player;

	public Game(String[] puzzle) {
		buildBoard(puzzle);
		playerSelect(chooser());
	}

	public void playerSelect(int choice) {
		switch (choice) {
		case 1:
			player = new R(gameBoard);
			break;
		case 2:
			player = new GA(gameBoard);
			break;
		case 3:
			player = new FC(gameBoard);
			break;
		case 4:
			player = new BJ(gameBoard);
			break;
		case 5:
			player = new CDBJ(gameBoard);
			break;
		case 6:
			player = new PSO(gameBoard);
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
	}

	public void buildBoard(String[] puzzle) {
		gameBoard = new Tile[9][9];
		for (int i = 0; i < 9; i++) {
			char[] charLine = puzzle[i].toCharArray();
			for (int j = 0; j < 9; j++) {
				String c = charLine[j] + "";
				gameBoard[i][j] = new Tile(Integer.parseInt(c));
			}
		}
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
