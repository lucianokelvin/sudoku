
public class Position {
	private int row;
	private int column;
	
	public Position() {
		this.column = 0;
		this.row = 0;
	}

	public Position(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}


	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	@Override
	public String toString() {
		return "Position [row=" + row + ", column=" + column + "]";
	}
	
	
}
