package aufgaben;

public class Auf16 {
	
	public static int funcOne(int n) {
		int result = 0;
		for (int i = 0; i <= 28; i++) {
			result += (i-1)*(i-1);
		}
		return result;
	}
	
	public static int funcTwo(int n) {
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			result += (i*(i+1))/2;
		}
		return result;
	}
	
	public static int funcThree(int n) {
		int result = 0;
		for (int i = 1; i <= 25; i++) {
			result += (i+1)/i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(funcOne(12));
		System.out.println(funcTwo(13));
		System.out.println(funcThree(14));
	}

}
