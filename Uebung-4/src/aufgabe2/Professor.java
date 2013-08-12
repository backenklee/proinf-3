package aufgabe2;

public class Professor extends Person {
	
	private double gehalt;
	
	private String[] publikationen;
	
	public Professor(String name, String vorname, byte alter, double gehalt, String[] publikationen) {
		super(name, vorname, alter);
		this.gehalt = gehalt;
		this.publikationen = publikationen;
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	public String[] getPublikationen() {
		return publikationen;
	}

	public void setPublikationen(String[] publikationen) {
		this.publikationen = publikationen;
	}

	public String toString() {
		String s = super.toString();
		s += " Gehalt: " + this.gehalt;
		if (this.publikationen.length > 0) {
			s += " Publikationen: ";
			for (String p:this.publikationen)
				s += p + " ";
		}
		return s;
	}
	
}
