package aufgaben;

public class Auf6 {

	public static void main(String[] args) {
		boolean a = true, b = false, c, d, e, f, g;
		c = a^b;
		System.out.println("c = " + c);
		d = !a || b;
		System.out.println("d = " + d);
		e = (d && !c) || !a;
		System.out.println("e = " + e);
		f = ((d == e) || (d != e)) == true;
		System.out.println("f = " + f);
		g = 5 == 7;
		System.out.println("g = " + g);
	}
	
}
