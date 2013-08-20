package aufgaben.Auf07;

public class Auf07 {
	private static void mystic(Person p) {
		p = new Person("H .", "Hinterseer", (byte) 22);
		p.setAlter((byte) 27);
	}

	public static void main(String[] args) {
		Person mario = new Trainer("M.", "Gomez", (byte) 27, (byte) 7);
		mystic(mario);
		System.out.println(" Name :" + mario.getName() + " Erfahrung : "
				+ ((Trainer) mario).getErfahrung());
	}
	
}
