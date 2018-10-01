import java.util.ArrayList;

public class Solver {

	private int freePositionIndex = -1;
	private ArrayList<Position> freePositions = new ArrayList<>();
	
	public Solver(Sudoku sudoku) {
		for (int i = 0; i < sudoku.sudoku.length; i++) {
			for (int j = 0; j < sudoku.sudoku.length; j++) {
				if (sudoku.sudoku[i][j] == 0) {
					Position p = new Position(i, j);
					freePositions.add(p);
				}
			}
		}
		solveSudoku(sudoku.sudoku);
	}

	private void solveSudoku(int[][] sudoku) {
		Position p = next();
		while (p != null) {
			boolean workedOut = false;
			for (int i = sudoku[p.getRow()][p.getColumn()] + 1; i <= 9; i++) {
				if (can(sudoku, p, i)) {
					sudoku[p.getRow()][p.getColumn()] = i;
					workedOut = true;
					break;
				}
			}
			if(workedOut) {
				p = next();
			}else{
				sudoku[p.getRow()][p.getColumn()] = 0;
				p =prev();
			}
		}

	}

	//go to the next position
	private Position next() {
		freePositionIndex++;
		if(freePositionIndex == freePositions.size()) {
			return null;
		}
		return freePositions.get(freePositionIndex);
	}

	//go to the previous position
	private Position prev() {
		freePositionIndex--;
		return freePositions.get(freePositionIndex);
	}

	private boolean can(int sudoku[][], Position position, int value) {
		// check row and column
		for (int i = 0; i < 9; i++) {
			if ((sudoku[i][position.getColumn()] == value && i != position.getRow())
					|| (sudoku[position.getRow()][i] == value && i != position.getColumn())) {
				return false;
			}
		}
		// check quadrant
		int quadratFirstRow = (position.getRow() / 3) * 3;
		int quadrantFirstColumn = (position.getColumn() / 3) * 3;
		for (int i = quadratFirstRow; i < quadratFirstRow + 3; i++) {
			for (int j = quadrantFirstColumn; j < quadrantFirstColumn + 3; j++) {
				if (sudoku[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}

}
