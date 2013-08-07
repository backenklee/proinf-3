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
		if ((e == null) || (0 == e.length))
			return null;
		else {
			int[] res = new int[e.length];
			for (int i  = 0; i < res.length; i++) {
				res[i]= d * e[i];
			}
			return res;
		}
	}
	
	public static void main(String[] args) {
		int[] v1 = {3, 54, 6, 87, -12};
		int[] v2 = {76, 1, 4343, -76, 5};
		Auf06.zeigeVektor(subVektoren(v1, v2));
		Auf06.zeigeVektor(skaVektoren(3, v2));
	}
}
