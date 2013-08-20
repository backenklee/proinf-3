package aufgabe3;

public class Hund implements Haustier {
	
	private String name;
	
	private int alter;
	
	public Hund(String name, int alter) {
		this.name = name;
		this.alter = alter;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAlter() {
		return alter;
	}

	@Override
	public String getBezeichnung() {
		return "Hund";
	}

	@Override
	public String getTierstimme() {
		return "wuff";
	}

}
