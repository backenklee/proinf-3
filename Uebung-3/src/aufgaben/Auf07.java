package aufgaben;

public class Auf07 {

	public static double calcPi(int it) {
		double pi_half = 1;
		for (int i = 1; i <= it; i++) {
			double zaehler = 4 * Math.pow(i, 2);
			double nenner = (2.0 * i - 1) * (2.0 * i + 1);
			double bla = zaehler / nenner;
			pi_half *= bla;
			if (pi_half == Double.NEGATIVE_INFINITY)
				System.out.println("OMGOMGOMGOMG");
		}
		return 2 * pi_half;
	}

	public static double eulerPi(int num) {
		double res = 1, denominator = 1, counter = 1;
		long signbit = 1l << 63;
		int zhlr = 1;
		while (num > zhlr) {
			counter = Double.longBitsToDouble(Double
					.doubleToRawLongBits(counter) ^ signbit);
			if ((zhlr & 1) == 1)
				denominator += 1;
			else
				denominator += 2;
			res += counter / denominator;
			zhlr++;
		}
		return res * (Math.sqrt(3) * 3);
	}

	public static double newtonPi(int num) {
		double res = 1, denominator = 1, counter = 1;
		long signbit = 1l << 63;
		int zhlr = 1;
		while (num > zhlr) {
			if ((zhlr & 1) == 0)
				counter = Double.longBitsToDouble(Double
						.doubleToRawLongBits(counter) ^ signbit);
			denominator += 2;
			res += counter / denominator;
			zhlr++;
		}
		return res * (Math.sqrt(2) * 2);
	}

	public static String shit(Object o) {
		return o.getClass().getName();
	}

	public static void main(String[] args) {
		System.out.println(calcPi(10000000));
		System.out.println(eulerPi(10000000));
		System.out.println(newtonPi(10000000));
	}

}
