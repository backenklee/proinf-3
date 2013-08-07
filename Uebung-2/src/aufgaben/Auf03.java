package aufgaben;

public class Auf03 {

	public static boolean isPrime(int p) {
		if (p <= 0) {
			return false;
		} else if (p == 2) {
			return true;
		} else if (p == 1 || p%2 == 0) {
			return false;
		}
		for (int i = 3; i < p; i++) {
			if ((p % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("23 prim? " + isPrime(23));
		System.out.println("2 prim? " + isPrime(2));
		System.out.println("36 prim? " + isPrime(36));
	}

}
