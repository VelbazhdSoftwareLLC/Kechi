package eu.veldsoft.kechi.model;

/**
 * Object model of the game board.
 * 
 * @author Todor Balabanov
 */
public class Board {

	/**
	 * Size of a square board.
	 */
	public final static int SIZE = 13;
	
	/**
	 * Count turns.
	 */
	private int turn = 0;

	/**
	 * Cells information.
	 */
	private Cell cells[][] = {
			{ Cell.RED, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
					Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.BLUE },
			{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
					Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
			{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
					Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
			{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
					Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
			{ Cell.RED, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
					Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.BLUE },
			{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
					Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
			{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
					Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
			{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
					Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
			{ Cell.RED, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
					Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.BLUE },
			{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
					Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
			{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
					Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
			{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
					Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
			{ Cell.RED, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
					Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.BLUE }, };

	/**
	 * Cells array getter.
	 * 
	 * @return Reference to cells array.
	 */
	public Cell[][] getCells() {
		return cells;
	}

	/**
	 * Put the board in its initila state.
	 */
	public void reset() {
		turn = 0;
		
		cells = new Cell[][]{
				{ Cell.RED, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
						Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.BLUE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.RED, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
						Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.BLUE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.RED, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
						Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.BLUE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.RED, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
						Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.BLUE }, };
	}
}
