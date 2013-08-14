package aufgabe3;

public class VektorShit {
	
	public static int[] addVektoren(int[] d, int[] e) throws VectorLengthException {
		if (d.length != e.length)
			throw new VectorLengthException("MUH");
		if ((d == null || e == null) || (e.length== 0))
			return null;
		else {
			int[] res = new int[e.length];
			for (int i  = 0; i < res.length; i++) {
				res[i]= d[i] + e[i];
			}
			return res;
		}
	}

	public static void zeigeVektor(int[] f) {
		if (f == null || f.length == 0) {
			System.out.print("Array putt");
		} else {
			for (int i = 0; i < f.length; i++)
				System.out.print(f[i] + " ");
		}
		System.out.print("\n");
	}

}
