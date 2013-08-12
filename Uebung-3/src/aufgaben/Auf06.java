package aufgaben;

public class Auf06 {
	
//	public static double sum1() {
//		int i, startwert = 1;
//		double d, h;
//		for (i = --startwert; i > 100; i++)
//			System.out.println(d);
//		{h = (i*i*i)/2;
//		d = d+h;
//		}
//		return d;
//	}
	
	public static double sum1() {
		int i, startwert = 1;
		double d = 0, h;
		for (i = startwert; i <= 100; i++) {
			h = (i*i+i)/2.0;
			d = d+h;
		}
		return d;
	}
	
	public static void main(String[] args) {
		System.out.println(sum1());
	}

}
