package eu.veldsoft.kechi.model;

/**
 * Object model of the cells.
 * 
 * @author Todor Balabanov
 */
public enum Cell {
	RED(0, "Red Player"), BLUE(1, "Blue Player"), EMPTY(101, "Empty Cell"), AVAILABLE(102,
			"Available Cell"), UNAVAILABLE(103, "Unavailable Cell");

	private int id;

	private String description;

	static public Cell getCellById(int id) {
		for(Cell cell : Cell.values()) {
			if(id == cell.id) {
				return cell;
			}
		}
		
		new RuntimeException( "Cell not found." );
		return null;
	}

	private Cell(int id, String description) {
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public boolean isPlayer() {
		switch (this) {
		case RED:
		case BLUE:
			return true;
		default:
			return false;
		}
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

	public String describe() {
		return description;
	}
}
