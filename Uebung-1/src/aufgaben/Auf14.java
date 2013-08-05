package aufgaben;

public class Auf14 {
	
	public static double funcOne(double x) {
		return x;
	}
	
	public static double funcTwo(double x) {
		return Math.pow(x, 2)/2.0+17*2;
	}
	
	public static double funcThree(double x) {
		return (Math.pow((x-1), 3)-14)/2.0;
	}
	
	public static void main(String[] args) {
		System.out.println(funcOne(5));
		System.out.println(funcTwo(6));
		System.out.println(funcThree(7));
	}

}
