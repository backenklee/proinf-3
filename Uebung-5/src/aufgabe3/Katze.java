package aufgabe3;

public class Katze implements Haustier {
	
	private String name;
	
	private int alter;
	
	public Katze(String name, int alter) {
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
		return "Katze";
	}

	@Override
	public String getTierstimme() {
		return "miau";
	}
	
	

}
