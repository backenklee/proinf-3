package aufgaben;

public class Auf04 {

	public static int[] calcPrimes(int n) {
		int[] primes = new int[n];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = i;
		}
		primes[0] = -1;
		primes[1] = -1;
		for (int j = 2; j < primes.length; j++) {
			for (int k = j + 1; k < primes.length; k++) {
				if ((primes[k] % j) == 0) {
					primes[k] = -1;
				}
			}
		}
		return primes;
	}

	public static void main(String[] args) {
		int[] primes = calcPrimes(24);
		for (int i : primes) {
			if (!(i == -1)) {
				System.out.print(i + " ");
			}
		}
	}

}
