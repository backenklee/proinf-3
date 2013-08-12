package aufgabe5;

public class Petrischale {

	private int dimension;

	private Zelle[][] feld;

	public Petrischale(int dimension, double prob) {
		this.dimension = dimension;
		this.feld = new Zelle[dimension][dimension];
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				feld[i][j] = new Zelle(prob);
			}
		}
 	}

	private int countNeighbours(int x, int y) {
		int numOfNeighbours = 0;
		if (0 <= x - 1 && x - 1 < dimension && 0 <= y - 1 && y - 1 < dimension
				&& feld[x - 1][y - 1].getZustand())
			numOfNeighbours++;
		if (0 <= x - 1 && x - 1 < dimension && 0 <= y && y < dimension
				&& feld[x - 1][y].getZustand())
			numOfNeighbours++;
		if (0 <= x - 1 && x - 1 < dimension && 0 <= y + 1 && y + 1 < dimension
				&& feld[x - 1][y + 1].getZustand())
			numOfNeighbours++;
		if (0 <= x && x < dimension && 0 <= y + 1 && y + 1 < dimension
				&& feld[x][y + 1].getZustand())
			numOfNeighbours++;
		if (0 <= x + 1 && x + 1 < dimension && 0 <= y + 1 && y + 1 < dimension
				&& feld[x + 1][y + 1].getZustand())
			numOfNeighbours++;
		if (0 <= x + 1 && x + 1 < dimension && 0 <= y && y < dimension
				&& feld[x + 1][y].getZustand())
			numOfNeighbours++;
		if (0 <= x + 1 && x + 1 < dimension && 0 <= y - 1 && y - 1 < dimension
				&& feld[x + 1][y - 1].getZustand())
			numOfNeighbours++;
		if (0 <= x && x < dimension && 0 <= y - 1 && y - 1 < dimension
				&& feld[x][y - 1].getZustand())
			numOfNeighbours++;
		return numOfNeighbours;
	}

	public void applyRules() {
		int numOfNeighbours;
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				numOfNeighbours = countNeighbours(i, j);
				if (feld[i][j].getZustand()) {
					if (numOfNeighbours < 2)
						feld[i][j].setZustand(false);
					if (numOfNeighbours > 3)
						feld[i][j].setZustand(false);
				} else {
					if (numOfNeighbours == 3)
						feld[i][j].setZustand(true);
				}

			}
		}
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				if (feld[i][j].getZustand()) {
					s += "X ";
				} else {
					s += "O ";
				}
			}
			s += "\n";
		}
		return s;
	}

}
