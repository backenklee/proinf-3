package aufgaben;

public class Auf10 {

	public static void main(String[] args) {
		int i = 7, j = 2;
		char c = 'a';
		float f = 1.2f;
		long l = Long.MAX_VALUE;
		
		char c3 = (char) (i&j^i);
		int i3 = (int)f | 'g';
		float f2 = l;
		byte b = (byte)((short)((int)l));
	}
	
}
