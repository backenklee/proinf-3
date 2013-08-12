package aufgabe2;

public class Student extends Person {
	
	private String wohnort;
	
	private int matrikelnr;

	public Student(String name, String vorname, byte alter, String wohnort, int matrikelnr) {
		super(name, vorname, alter);
		this.wohnort = wohnort;
		this.matrikelnr = matrikelnr;
	}

	public String getWohnort() {
		return wohnort;
	}

	public void setWohnort(String wohnort) {
		this.wohnort = wohnort;
	}

	public int getMatrikelnr() {
		return matrikelnr;
	}

	public void setMatrikelnr(int matrikelnr) {
		this.matrikelnr = matrikelnr;
	}
	
	public String toString() {
		String s = super.toString();
		s += " Wohnort: " + this.wohnort + " Matrikelnr.: " + this.matrikelnr;
		return s;
	}

}
