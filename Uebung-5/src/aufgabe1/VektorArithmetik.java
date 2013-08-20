package aufgabe1;

public class VektorArithmetik {

	public static int[] addVektoren(int[] d, int[] e)
			throws VectorLengthException, VectorOverflowException {
		if (d.length != e.length)
			throw new VectorLengthException("MUH");
		if ((d == null || e == null) || (e.length == 0))
			return null;
		else {
			int[] res = new int[e.length];
			for (int i = 0; i < res.length; i++) {
				res[i] = d[i] + e[i];
				if (((d[i] > 0) && (e[i] > 0) && (res[i] <= 0))
						|| ((d[i] < 0) && (e[i] < 0) && (res[i] >= 0)))
					throw new VectorOverflowException();

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
