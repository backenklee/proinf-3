package aufgaben;

public class Auf02 {
	
	// Die main-Methode muss bspw. immer static sein, da
	// sie nicht an eine Instanz von Auf02 gebunden sein
	// darf
	public static void main(String[] args) {
		System.out.println("Hello, world!");
	}
	
	// Diese Methode operiert nicht auf Objekt-Attributen,
	// deswegen soll sie jeder einfach so benutzen können,
	// etwa so:
	// int i = Auf02.verdoppelnStatic(3);
	public static int verdoppelnStatic(int i) {
		return 2*i;
	}
	
	// Um diese Methode aufrufen zu können, müsste erst
	// eine Instanz von Auf02 erstellt werden, also so:
	// Auf02 a = new Auf02();
	// int i = a.verdoppeln(3);
	public int verdoppeln(int i) {
		return 2*i;
	}

}
