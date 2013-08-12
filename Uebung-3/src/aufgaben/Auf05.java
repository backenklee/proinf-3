package aufgaben;

public class Auf05 {
	
	public static char haeufigstesSymbol(String s) {
		int[] symbols = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			symbols[(int)c]++;
		}

		int max = symbols[0];
		for (int i = 1; i < symbols.length; i++) {
			if (symbols[i] >= symbols[max])
				max = i;
		}
		return (char)max;
	}
	
	public static void main(String[] args) {
		String s = "aaaaafffffffffffffffffaapoiugsd87geyi";
		char c = haeufigstesSymbol(s);
		System.out.println(c);
	}

}
