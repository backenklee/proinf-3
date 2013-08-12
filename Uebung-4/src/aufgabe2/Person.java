package aufgabe2;

public class Person {
	
	private String name;
	
	private String vorname;
	
	private byte alter;

	public Person(String name, String vorname, byte alter) {
		super();
		this.name = name;
		this.vorname = vorname;
		this.alter = alter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public byte getAlter() {
		return alter;
	}

	public void setAlter(byte alter) {
		this.alter = alter;
	}
	
	public String toString() {
		String s = "";
		s += "Name: " + this.name + " Vorname: " + this.vorname + " Alter: " + this.alter;
		return s;
	}
	
}
