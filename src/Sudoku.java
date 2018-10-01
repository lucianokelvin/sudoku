
public class Sudoku {

	int sudoku[][] = new int[9][9];
	
	public Sudoku() {
		// TODO Auto-generated constructor stub
	}
	
	public Sudoku(String values){
		values = values.replace("\n", "").replace(" ", "");
		int cont = 0;
		for(int i = 0; i < sudoku.length; i++) {
			for(int j = 0; j < sudoku.length; j++ ) {
				sudoku[i][j] = Integer.parseInt(String.valueOf(values.charAt(cont)));
				cont++;
			}
		}
	}
	
	
	public void printSudoku() {
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku.length; j++) {
				System.out.print(sudoku[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
