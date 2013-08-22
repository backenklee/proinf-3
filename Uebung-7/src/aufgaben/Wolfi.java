package aufgaben;


public class Wolfi implements Lebewesen {

	private byte lebtseit = 0, gegessen = 0;

	@Override
	public boolean lebeweiter() {
		lebtseit++;
		gegessen++;
		return (lebtseit <= 20) && (gegessen < 5);
	}

	@Override
	public byte gebaehrt() {
		return  (byte) ((lebtseit & 1)==1?2:0);
	}
	
	public void friss() {
		gegessen =0;
	}

	@Override
	public char print() {
		return 'W';
	}

}
