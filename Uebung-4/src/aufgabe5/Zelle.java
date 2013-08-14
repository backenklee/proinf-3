package aufgabe5;

public class Zelle {
	
	private boolean zustand;
	
	public Zelle(double prob) {
		if (Math.random() < prob)
			this.zustand = true;
		else
			this.zustand = false;
	}
	
	public boolean getZustand() {
		return this.zustand;
	}
	
	public void setZustand(boolean zustand) {
		this.zustand = zustand;
	}

}
