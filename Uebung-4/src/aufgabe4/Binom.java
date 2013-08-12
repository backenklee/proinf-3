package aufgabe4;

public class Binom {
	
	public static int calcBinom(int n, int k) {
		int res = 1;
		for (int i = 1; i <= k; i++)
			res *= (double)(n+1-i)/i;
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(calcBinom(5, 3));
		System.out.println(calcBinom(4, 3));
		System.out.println(calcBinom(6, 2));
	}

}
