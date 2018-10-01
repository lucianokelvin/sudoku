package test;
import classes.Sudoku;
import solver.Solver;

public class Main {
	
	
	public static void main(String[] args) {
		Sudoku sudoku = sample3();
		Solver solver = new Solver(sudoku);
		sudoku.printSudoku();
	}
	
	
	private static Sudoku sample1() {
		return new Sudoku(
				"1 0 2 5 7 9 4 6 8\n" + 
				"4 9 8 2 6 1 3 7 5\n" + 
				"7 5 6 3 8 4 2 1 9\n" + 
				"6 4 3 1 5 8 7 9 2\n" + 
				"5 2 1 7 9 3 8 4 6\n" + 
				"0 8 7 4 2 6 5 3 1\n" + 
				"2 1 4 9 3 5 6 8 7\n" + 
				"3 6 5 8 1 7 9 2 4\n" + 
				"8 0 9 6 4 2 1 5 0");
	}
	private static Sudoku sample2() {
		return new Sudoku(
				"0 0 0 8 0 9 0 0 0\n" + 
				"0 0 5 0 0 0 7 0 0\n" + 
				"0 2 9 0 1 0 6 4 0\n" + 
				"7 0 0 0 6 0 0 0 2\n" + 
				"0 0 6 2 0 4 3 0 0\n" + 
				"8 0 0 0 7 0 0 0 6\n" + 
				"0 3 7 0 2 0 8 1 0\n" + 
				"0 0 1 0 0 0 5 0 0\n" + 
				"0 0 0 1 0 3 0 0 0");
	}
	
	private static Sudoku sample3() {
		return new Sudoku(
				"0 6 0 0 0 0 4 0 1\n" + 
				"0 0 0 0 0 0 0 0 0\n" + 
				"0 0 9 2 5 8 0 0 0\n" + 
				"0 0 0 0 2 0 0 0 0\n" + 
				"0 5 7 0 0 0 0 0 9\n" + 
				"0 0 0 0 0 0 7 0 4\n" + 
				"6 0 0 0 0 0 9 5 0\n" + 
				"2 0 0 0 1 0 0 0 0\n" + 
				"0 0 0 9 0 3 0 0 7");
	}

}
