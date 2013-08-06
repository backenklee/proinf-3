package aufgaben;

public class Auf15 {
	
	public static int faculty(int n) {
		if (n < 0)
			return -1;
		else if (n == 0)
			return 1;
		else
			return n * faculty(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println("Fakultät von 3: " + faculty(3));
		System.out.println("Fakultät von 6: " + faculty(6));
	}

}
