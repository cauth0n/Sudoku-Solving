package Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public Main(String path) {
		try{
			Scanner in = new Scanner(new File(path));
			String[] puzzle = new String[9];
			int i = 0;
			while (in.hasNext()) {
				puzzle[i] = in.nextLine();
				i++;
			}
			in.close();
			new Game(puzzle);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main("G:/Code/Sudoku Solving/puzzle.txt");

	}

}
