package aufgaben;

public class Auf02 {
	
	/*
	 * Normalerweise erzeugt Java eine lokale Kopie der
	 * Eingabeparameter, die dann innerhalb der Funktion
	 * verwendet werden. Arrays können jedoch sehr groß
	 * werden, und werden deshalb by reference übergeben,
	 * also nicht die Daten selber, sondern nur ein Pointer.
	 * Deshalb bleiben die Änderungen am Array erhalten.
	 */
	public static void invertiereListe(int[] liste) {
		for (int i = 0; i < liste.length/2; i++) {
			int temp = liste[i];
			liste[i] = liste[liste.length-1-i];
			liste[liste.length-1-i] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] liste1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] liste2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		invertiereListe(liste2);
		for (int i : liste1)
			System.out.print(i + " ");
		System.out.println();
		for (int j : liste2)
			System.out.print(j + " ");
		System.out.println();
	}

}
