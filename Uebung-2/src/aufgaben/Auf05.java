package aufgaben;

public class Auf05 {
	
	public static boolean isUpperCase(char c) {
		if (c >= 65 && c <= 90) {
			return true;
		} else {
			return false;
		}
	}
	
	public static char toLowerCase(char c) {
		if (isUpperCase(c)) {
			c += 32;
		}
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println("isUpper(c) " + isUpperCase('c'));
		System.out.println("isUpper(D) " + isUpperCase('D'));
		System.out.println("toLower(e) " + toLowerCase('e'));
		System.out.println("toLower(F) " + toLowerCase('F'));
	}

}
