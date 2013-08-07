package aufgaben;

public class Auf06 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		// funktionierendes Beipiel
		int[] b = { 4, 5, 6 };
		zeigeVektor(a);
		zeigeVektor(b);
		int[] c = addVektoren(a, b);
		zeigeVektor(c);
		int[] d = { 1, 2 };
		// fehlerhaftes Beispiel
		int[] e = { 4, 5, 6 };
		zeigeVektor(d);
		zeigeVektor(e);
		int[] f = addVektoren(d, e);
		zeigeVektor(f);
	}

	private static int[] addVektoren(int[] d, int[] e) {
		if ((d == null || e == null) || (d.length != e.length) || (e.length== 0))
			return null;
		else {
			int[] res = new int[e.length];
			for (int i  = 0; i < res.length; i++) {
				res[i]= d[i] + e[i];
			}
			return res;
		}
	}

	private static void zeigeVektor(int[] f) {
		if (f == null || f.length == 0) {
			System.out.print("Array putt");
		} else {
			for (int i = 0; i < f.length; i++)
				System.out.print(f[i] + " ");
		}
		System.out.print("\n");
	}

}
