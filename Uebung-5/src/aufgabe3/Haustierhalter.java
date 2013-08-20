package aufgabe3;

import java.util.LinkedList;

public class Haustierhalter {
	
	private LinkedList<Haustier> meineHaustiere;
	
	public Haustierhalter() {
		 meineHaustiere = new LinkedList<Haustier>();
	}
	
	public void neuesHaustier(Haustier haustier) {
		meineHaustiere.add(haustier);
	}
	
	public LinkedList<Haustier> getHaustiere() {
		return meineHaustiere;
	}
	
	public void removeHaustier(Haustier haustier) {
		meineHaustiere.remove(haustier);
	}
	
	public String getHaustierbezeichnung(Haustier haustier) {
		return meineHaustiere.get(meineHaustiere.indexOf(haustier)).getBezeichnung();
	}

}
