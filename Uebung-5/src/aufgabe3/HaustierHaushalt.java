package aufgabe3;

public class HaustierHaushalt {
	
	public static void main(String[] args) {
		Haustierhalter heinz = new Haustierhalter();
		Hund rambo = new Hund("Rambo", 3);
		heinz.neuesHaustier(rambo);
		Katze grumpy = new Katze("GrumpyCat", 76);
		heinz.neuesHaustier(grumpy);
		System.out.println("Haustiere von Heinz: ");
		for (Haustier h:heinz.getHaustiere())
			System.out.println(h.getBezeichnung());
	}

}
