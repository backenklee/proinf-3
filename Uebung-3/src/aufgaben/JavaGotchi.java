package aufgaben;

public class JavaGotchi {

	private static enum Zustand {
		GLUECKLICH, HUNGRIG, ESSEN, VERHUNGERT
	};

	private static Zustand aktuellerZustand;

	private static int hungerGrad;

	private static boolean spielLaeuft;

	private static void verhaltenHungrig() {
		System.out.println(":/    ...Hunger");
		if (Math.random() < 0.3) {
			aktuellerZustand = Zustand.ESSEN;
		}
	}

	private static void verhaltenVerhungert() {
		System.out.println("x[    ...Tot");
		spielLaeuft = false;
	}

	private static void verhaltenEssen() {
		System.out.println(":#    ...Essen");
		hungerGrad = 0;
		aktuellerZustand = Zustand.GLUECKLICH;
	}

	private static void verhaltenGluecklich() {
		System.out.println(":]    ...Gluecklich");
	}

	private static void aktualisierung() {
		if (aktuellerZustand != Zustand.ESSEN) {
			hungerGrad += (int) (Math.random() * 5);
			if (hungerGrad > 15)
				aktuellerZustand = Zustand.HUNGRIG;
			if (hungerGrad > 30)
				aktuellerZustand = Zustand.VERHUNGERT;
		}
	}

	private static void warte(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// Gotta catch 'em all
			e.printStackTrace();
		}
	}

	private static void starteSpiel() {
		aktuellerZustand = Zustand.GLUECKLICH;
		hungerGrad = 0;
		spielLaeuft = true;
		while (spielLaeuft) {
			switch (aktuellerZustand) {
			case HUNGRIG:
				verhaltenHungrig();
				break;
			case VERHUNGERT:
				verhaltenVerhungert();
				break;
			case ESSEN:
				verhaltenEssen();
				break;
			case GLUECKLICH:
				verhaltenGluecklich();
				break;
			}
			aktualisierung();
			warte(400);
		}
	}

	public static void main(String[] args) {
		starteSpiel();
	}

}
