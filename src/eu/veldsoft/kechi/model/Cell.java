package eu.veldsoft.kechi.model;

/**
 * Object model of the cells.
 * 
 * @author Todor Balabanov
 */
public enum Cell {
	RED(0), BLUE(1), EMPTY(101), AVAILABLE(102), UNAVAILABLE(103);

	private int id;

	private Cell(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public boolean isOpponent(Cell cell) {
		if (cell.id == id) {
			return false;
		} else if (cell == Cell.EMPTY) {
			return false;
		} else if (cell == Cell.AVAILABLE) {
			return false;
		} else if (cell == Cell.UNAVAILABLE) {
			return false;
		}

		return true;
	}
}
