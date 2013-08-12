package aufgaben;

public class Auf07 {
	
	public static double calcPi(int it) {
		double pi_half = 1;
		for (int i = 1; i <= it; i++) {
			double zaehler = 4*Math.pow(i,  2);
			double nenner = (2.0*i-1)*(2.0*i+1);
			double bla = zaehler/nenner;
			pi_half *= bla;
			if (pi_half == Double.NEGATIVE_INFINITY)
				System.out.println("OMGOMGOMGOMG");
		}
		return 2*pi_half;
	}
	
	public static String shit(Object o) {
		return o.getClass().getName();
	}
	
	public static void main(String[] args) {
		System.out.println(calcPi(10000000));
	}

}
