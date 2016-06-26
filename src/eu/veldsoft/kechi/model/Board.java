package eu.veldsoft.kechi.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Object model of the game board.
 * 
 * @author Todor Balabanov
 */
public class Board {
	/**
	 * Number of players in the game.
	 */
	public final static int NUMBER_OF_PLAYERS = 2;

	/**
	 * Size of a square board.
	 */
	public final static int SIZE = 13;

	/**
	 * Size of a square board.
	 */
	public final static int CELLS_MOVE = 6;

	/**
	 * Count turns.
	 */
	private int turn = 0;

	/**
	 * How many cells still should be used in the move.
	 */
	private int cellsMoveLeft = CELLS_MOVE;

	/**
	 * Coordinates of the selected piece. On index 0 it is x coordinate. On
	 * index 1 it is y coordinate.
	 */
	private int selection[] = null;

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
	 * Step around.
	 * 
	 * @param x
	 * @param y
	 * @param length
	 */
	private void step(int x, int y, int length, int x2, int y2, boolean visited[][], List<Integer> solutions) {
		/*
		 * Length of the path is limited.
		 */
		if (length > CELLS_MOVE) {
			return;
		}

		/*
		 * Should be inside the board.
		 */
		if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
			return;
		}

		/*
		 * Each cell should be visited only once.
		 */
		if (visited[x][y] == true) {
			return;
		}

		/*
		 * If there is no direct path, return.
		 */
		if (cells[x][y] == Cell.EMPTY || cells[x][y] == Cell.UNAVAILABLE) {
			return;
		}

		if (x == x2 && y == y2) {
			solutions.add(length);
			return;
		}

		visited[x][y] = true;
		step(x - 1, y, length + 1, x2, y2, visited, solutions);
		step(x, y - 1, length + 1, x2, y2, visited, solutions);
		step(x + 1, y, length + 1, x2, y2, visited, solutions);
		step(x, y + 1, length + 1, x2, y2, visited, solutions);
		visited[x][y] = false;
	}

	/**
	 * Manhattan distance between cells.
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * 
	 * @return Integer number for the distance.
	 */
	private int distance(int x1, int y1, int x2, int y2) {
		boolean visited[][] = new boolean[SIZE][SIZE];
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[i].length; j++) {
				visited[i][j] = false;
			}
		}

		List<Integer> solutions = new ArrayList<Integer>();
		step(x1, y1, 0, x2, y2, visited, solutions);

		if (solutions.isEmpty() == true) {
			// TODO throw new RuntimeException("Path not found.");
			return Integer.MAX_VALUE;
		}

		Collections.sort(solutions);
		return solutions.get(0);
	}

	/**
	 * Selection coordinates getter.
	 * 
	 * @return Array with x-y coordinates.
	 */
	public int[] getSelection() {
		return selection;
	}

	/**
	 * Cells array getter.
	 * 
	 * @return Reference to cells array.
	 */
	public Cell[][] getCells() {
		return cells;
	}

	/**
	 * Put the board in its initial state.
	 */
	public void reset() {
		cellsMoveLeft = CELLS_MOVE;

		selection = null;

		turn = 0;

		cells = new Cell[][] {
				{ Cell.RED, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
						Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
						Cell.BLUE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.RED, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
						Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
						Cell.BLUE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.RED, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
						Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
						Cell.BLUE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.AVAILABLE, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.AVAILABLE },
				{ Cell.RED, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
						Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE, Cell.AVAILABLE,
						Cell.BLUE }, };
	}

	/**
	 * Check for available moves.
	 * 
	 * @param player
	 *            Who is playing.
	 * @param length
	 *            Length of the path to be found.
	 * 
	 * @return True if move is possible, false otherwise.
	 */
	public boolean canMove() {
		Cell player = Cell.getCellById(turn % NUMBER_OF_PLAYERS);
		int length = cellsMoveLeft;

		/*
		 * Searching is done only for players.
		 */
		if (player.isPlayer() == false) {
			return false;
		}

		/*
		 * Search for at least one player's piece.
		 */
		boolean found = false;
		loop: for (Cell array[] : cells) {
			for (Cell cell : array) {
				if (cell == player) {
					found = true;
					break loop;
				}
			}
		}
		if (found == false) {
			return false;
		}

		/*
		 * Search for all possible moves.
		 */
		for (int i = 0, d; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {
				if (cells[i][j] != player) {
					continue;
				}

				// TODO Use helper function.
				for (int m = i - length; m <= i + length; m++) {
					if (m < 0 || cells.length <= m) {
						continue;
					}

					for (int n = j - length; n <= j + length; n++) {
						if (n < 0 || cells[m].length <= n) {
							continue;
						}

						if (i == m && j == n) {
							continue;
						}

						d = distance(i, j, m, n);
						if (d != Integer.MAX_VALUE && d > 0) {
							return true;
						}
					}
				}
			}
		}

		return false;
	}

	/**
	 * Handle on click event in the object model.
	 * 
	 * @param x
	 *            Column.
	 * @param y
	 *            Row.
	 */
	public int click(int x, int y) {
		/*
		 * The cells in the empty space can not be part of the game moves.
		 */
		if (cells[x][y] == Cell.EMPTY) {
			return -1;
		}

		/*
		 * Cells used in the game can not participate again.
		 */
		if (cells[x][y] == Cell.UNAVAILABLE) {
			return -1;
		}

		/*
		 * It is not possible to click destination cell without selected piece
		 * to move.
		 */
		if ((cells[x][y] == Cell.AVAILABLE || cells[x][y].getId() != turn % NUMBER_OF_PLAYERS) && selection == null) {
			return -1;
		}

		/*
		 * Select piece to move.
		 */
		if (turn % NUMBER_OF_PLAYERS == cells[x][y].getId() && selection == null) {
			selection = new int[] { x, y };
			return cellsMoveLeft;
		}

		/*
		 * Valid move click. It is the end of the move.
		 */
		if (selection != null) {
			int distance = distance(selection[0], selection[1], x, y);
			if ((cells[x][y] == Cell.AVAILABLE || cells[x][y].isOpponent(cells[selection[0]][selection[1]]))
					&& distance <= cellsMoveLeft) {
				cells[x][y] = cells[selection[0]][selection[1]];
				cells[selection[0]][selection[1]] = Cell.UNAVAILABLE;
				cellsMoveLeft -= distance;
				selection = null;

				return cellsMoveLeft;
			} else {
				return -1;
			}
		}

		return -1;
	}

	/**
	 * Next turn.
	 */
	public void next() {
		turn++;
		cellsMoveLeft = CELLS_MOVE;
	}
}
