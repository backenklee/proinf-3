package aufgabe4;

public class Binom {

	public static int calcBinom(int n, int k) throws BinomInvArg{
		if ((n < 1) || (k < 0) || (n< k) ) throw new BinomInvArg();
		if (k > (n / 2))
			k = n - k;
		int res = 1;
		for (int i = 1; i <= k; i++)
			res *= (double) (n + 1 - i) / i;
		return res;
	}

	public static void main(String[] args) {
		try {
			System.out.println(calcBinom(5, 3));
			System.out.println(calcBinom(4, 3));
			System.out.println(calcBinom(6, 2));
		} catch (BinomInvArg e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
