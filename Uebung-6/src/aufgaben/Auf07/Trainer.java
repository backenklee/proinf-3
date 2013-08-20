package aufgaben.Auf07;

public class Trainer extends Person {
	
	byte level;

	public Trainer(String name, String vorname, byte alter, byte level) {
		super(name, vorname, alter);
		this.level = level;
	}

	public int getErfahrung() {
		return level * 100;
	}
	
	
}
