package aufgaben;

public class Auf19 {

	public static void main(String[] args) {
		for (int i = 0; i <= 2; i++) {
			SprungZuJ: for (int j = 0; j <= 2; j++) {
				for (int k = 0; k <= 2; k++) {
					if (k == 1)
						break SprungZuJ;
				}
			}
		}
		System.out.println("Le shit terminiert nicht");
	}
}
