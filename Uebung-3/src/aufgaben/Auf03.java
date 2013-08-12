package aufgaben;

public class Auf03 {
	
	public static boolean[][] falsiere(boolean[][] l) {
		boolean[][] kopie = l.clone();
		for (boolean[] d1:kopie)
			for (boolean d2:d1)
				d2 = false;
		
		return kopie;
	}
	
	public static void main(String[] args) {
		boolean[][] a = {{true}, {true, false}, {false, false}};
		boolean[][] b = falsiere(a);
		boolean c = a == b;
		b[2][1] = true;
		b[1] = a[0];
		boolean d = a[0][0] == b[0][0];
		boolean e = a[2][1] != b[2][1];
		a[0][0] = true;
		boolean f = b[1][0] != b[2][0];
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
