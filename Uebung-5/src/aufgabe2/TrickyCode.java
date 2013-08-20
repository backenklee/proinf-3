package aufgabe2;

public class TrickyCode {
	
	public static void main(String[] args) {
		int[][] a = {{2, 4, 6, 8}, {1, 2, 3}, {3, 4, 5}};
		int[][] b = a;
		int[][] c = (int[][]) a.clone();
		c[2] = a[1];
		c[2][1] = 6;
		b[2][2] = 7;
		
		for (int i = 0; i < a.length; i++)
			a[i][i]++;
		
		System.out.println("a[1] == c[1] " + (a[1] == c[1]));
		System.out.println("b[2] == c[2] " + (b[2] == c[2]));
		System.out.println("a == c       " + (a == c));
		System.out.println("b[2][2]      " + b[2][2]);
		System.out.println("c[1][1]      " + c[1][1]);
		System.out.println("c[2][2]      " + c[2][2]);
	}

}
