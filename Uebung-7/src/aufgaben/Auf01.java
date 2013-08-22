package aufgaben;


public class Auf01 {

	private Lebewesen[][] feld;

	public Auf01(int xsize, int ysize) {
		feld = new Lebewesen[xsize][ysize];
	}

	private boolean spawn(short x, short y, Lebewesen ding) {
		boolean res = false;
		short a, b, minx, miny, maxx, maxy;
		byte schicht = 1;
		res = feld[x][y] == null
				|| (feld[x][y] instanceof Hase && ding instanceof Wolfi);
		if (res)
			feld[x][y] = ding;
		while (!res) {
			minx = (short) Math.max(0, x - schicht);
			miny = (short) Math.max(0, y - schicht);
			maxx = (short) Math.min(x + schicht, feld.length - 1);
			maxy = (short) Math.min(y + schicht, feld[0].length - 1);
			for (a = minx; a <= maxx; a++) {
				res = (feld[a][miny] == null)
						|| (feld[a][miny] instanceof Hase && ding instanceof Wolfi);
				if (res) {
					feld[a][miny] = ding;
					break;
				}

				res = (feld[a][maxy] == null)
						|| (feld[a][maxy] instanceof Hase && ding instanceof Wolfi);
				if (res) {
					feld[a][maxy] = ding;
					break;
				}
			}
			if (!res) {
				for (b = (short) (miny + 1); b <= maxy - 1; b++) {
					res = (feld[minx][b]) == null
							|| (feld[minx][b] instanceof Hase && ding instanceof Wolfi);
					if (res) {
						feld[minx][b] = ding;
						break;
					}

					res = (feld[maxx][b] == null)
							|| (feld[maxx][b] instanceof Hase && ding instanceof Wolfi);
					if (res) {
						feld[maxx][b] = ding;
						break;
					}
				}
			}

			schicht++;
			if (schicht >= 4)
				break;
		}

		return res;
	}

	private void initialisiere(short hasi, short wolfi) {
		while (hasi > 0) {
			spawn((short) Math.floor(Math.random() * feld.length),
					(short) Math.floor(Math.random() * feld[0].length),
					new Hase());
			hasi--;
		}
		while (wolfi > 0) {
			spawn((short) Math.floor(Math.random() * feld.length),
					(short) Math.floor(Math.random() * feld[0].length),
					new Wolfi());
			wolfi--;
		}
	}

	private void iteriere() {
		byte tmp;
		for (short b, a = 0; a < feld.length; a++) {
			for (b = 0; b < feld[0].length; b++) {
				if (feld[a][b] != null && feld[a][b].lebeweiter()) {
					tmp = feld[a][b].gebaehrt();
					while (tmp-- > 0)
						try {
							spawn(a, b, feld[a][b].getClass().newInstance());
						} catch (InstantiationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}

			}
		}
	}

	private void verteile() {
		Lebewesen miau;
		for (short b, a = 0; a < feld.length; a++) {
			for (b = 0; b < feld[0].length; b++) {
				miau = feld[a][b];
				if (miau != null) {
					feld[a][b] = null;
					spawn((short) Math.floor(Math.random() * feld.length),
							(short) Math.floor(Math.random() * feld[0].length),
							miau);
				}

			}
		}
	}

	public void printFeld() {
		for (int a, b = 0; b < feld[0].length; b++) {
			for (a = 0; a < feld.length; a++) {
				if (feld[a][b] != null) {
					System.out.print(feld[a][b].print());
				} else
					System.out.print(' ');
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Auf01 bla = new Auf01(20, 20);
		bla.initialisiere((short) 1, (short) 1);
		while (true) {
			bla.printFeld();
			bla.iteriere();
			bla.verteile();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
