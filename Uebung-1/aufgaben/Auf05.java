package aufgaben;

public class Auf5 {
	
	public static void main(String[] args) {
		boolean b1, b2;
		b1 = false;
		b2 = false;
		System.out.println(boolCalc(b1, b2));
		b2 = true;
		System.out.println(boolCalc(b1, b2));
		b1 = true;
		b2 = false;
		System.out.println(boolCalc(b1, b2));
		b2 = true;
		System.out.println(boolCalc(b1, b2));
	}
	
	public static boolean boolCalc(boolean b1, boolean b2) {
		return (b1 && b2) || (!b2);
	}

}
