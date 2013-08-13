package aufgaben;

import java.io.IOException;

public class Auf08 {

	private static final int DIMENSION = 10;

	private static final double PROBABILITY = 0.5;

	private static final boolean ALIVE = true;

	private static final boolean DEAD = false;

	private static boolean[][] world;

	private static void initializeWorld() {
		world = new boolean[DIMENSION][DIMENSION];
		for (int i = 0; i < DIMENSION; i++) {
			for (int j = 0; j < DIMENSION; j++) {
				if (Math.random() <= PROBABILITY) {
					world[i][j] = ALIVE;
				} else {
					world[i][j] = DEAD;
				}
			}
		}
	}

	private static void printWorld() {
		try {
			// This will only work with Linux, for Windows
			// change "clear" to "cls"
			Runtime.getRuntime().exec("clear");
		} catch (IOException e) {
			// Gotta catch 'em all
			e.printStackTrace();
		}
		for (int i = 0; i < DIMENSION; i++) {
			for (int j = 0; j < DIMENSION; j++) {
				if (world[i][j] == ALIVE) {
					System.out.print("X ");
				} else {
					System.out.print("O ");
				}
			}
			System.out.print("\n");
		}
		System.out.print("\n\n");
	}

	private static int countNeighbours(int x, int y) {
		// Caution, extreme ugliness!
		int numOfNeighbours = 0;
		if (0 <= x - 1 && x - 1 < DIMENSION && 0 <= y - 1 && y - 1 < DIMENSION
				&& world[x - 1][y - 1] == ALIVE)
			numOfNeighbours++;
		if (0 <= x - 1 && x - 1 < DIMENSION && 0 <= y && y < DIMENSION
				&& world[x - 1][y] == ALIVE)
			numOfNeighbours++;
		if (0 <= x - 1 && x - 1 < DIMENSION && 0 <= y + 1 && y + 1 < DIMENSION
				&& world[x - 1][y + 1] == ALIVE)
			numOfNeighbours++;
		if (0 <= x && x < DIMENSION && 0 <= y + 1 && y + 1 < DIMENSION
				&& world[x][y + 1] == ALIVE)
			numOfNeighbours++;
		if (0 <= x + 1 && x + 1 < DIMENSION && 0 <= y + 1 && y + 1 < DIMENSION
				&& world[x + 1][y + 1] == ALIVE)
			numOfNeighbours++;
		if (0 <= x + 1 && x + 1 < DIMENSION && 0 <= y && y < DIMENSION
				&& world[x + 1][y] == ALIVE)
			numOfNeighbours++;
		if (0 <= x + 1 && x + 1 < DIMENSION && 0 <= y - 1 && y - 1 < DIMENSION
				&& world[x + 1][y - 1] == ALIVE)
			numOfNeighbours++;
		if (0 <= x && x < DIMENSION && 0 <= y - 1 && y - 1 < DIMENSION
				&& world[x][y - 1] == ALIVE)
			numOfNeighbours++;
		return numOfNeighbours;
	}

	private static void applyRules(int i, int j) {
		int numOfNeighbours;
		numOfNeighbours = countNeighbours(i, j);
		if (world[i][j] == ALIVE) {
			if (numOfNeighbours < 2)
				world[i][j] = DEAD;
			if (numOfNeighbours > 3)
				world[i][j] = DEAD;
		} else {
			if (numOfNeighbours == 3)
				world[i][j] = ALIVE;
		}

	}

	private static void startGame() {
		initializeWorld();
		while (true) {
			for (int i = 0; i < DIMENSION; i++) {
				for (int j = 0; j < DIMENSION; j++) {
					printWorld();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// Gotta catch 'em all
						e.printStackTrace();
					}
					applyRules(i, j);
				}
			}
		}
	}

	public static void main(String[] args) {
		startGame();
	}
	
}
