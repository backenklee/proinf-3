package aufgaben;

public class Hase implements Lebewesen {
	
	private byte lebtseit = 0; 

	@Override
	public boolean lebeweiter() {
		lebtseit++;
		return lebtseit <= 15;
	}

	@Override
	public byte gebaehrt() {
		return  5;
	}

	@Override
	public char print() {
		return 'H';
	}

}
