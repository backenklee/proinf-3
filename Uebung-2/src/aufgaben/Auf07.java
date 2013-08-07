package aufgaben;

public class Auf07 {


	private static int[] subVektoren(int[] d, int[] e) {
		if ((d == null || e == null) || (d.length != e.length) || (e.length== 0))
			return null;
		else {
			int[] res = new int[e.length];
			for (int i  = 0; i < res.length; i++) {
				res[i]= d[i] - e[i];
			}
			return res;
		}
	}

	private static int[] skaVektoren(int d, int[] e) {
		if ((e == null) || (0 != e.length))
			return null;
		else {
			int[] res = new int[e.length];
			for (int i  = 0; i < res.length; i++) {
				res[i]= d * e[i];
			}
			return res;
		}
	}
}
