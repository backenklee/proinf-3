package aufgaben;

public class Auf18 {
	
	/*
	 * for (int x = 7; x < 12; x++) <Anweisung>
	 */
	public static void funcOne() {
		int x = 7;
		while (x < 12) {
			System.out.println("shit1");
			x++;
		}
	}
	
	/*
	 * for (int y = 0; x = 10; x > y; y++; x--) <Anweisung>
	 */
	public static void funcTwo() {
		int y = 0;
		int x = 10;
		while (x > y) {
			System.out.println("shit2");
			y++;
			x--;
		}
	}
	
	/*
	 * int a = 1-24; while (a>2) { <Anweisung>; a = a/2; }
	 */
	public static void funcThree() {
		for (int a = 1024; a > 2; a = a/2) {
			System.out.println("shit3");
		}
	}
	
	public static void main(String[] args) {
		funcOne();
		funcTwo();
		funcThree();
	}
	
}
