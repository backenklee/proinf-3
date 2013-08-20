package aufgaben;

public abstract class Auf06 {
	
	double currentPi;
	
	double startTime;
	
	double duration;
	
	public void setCurrentPi(double pi) {
		currentPi = pi;
	}
	
	public void setStartTime() {
		startTime = System.currentTimeMillis();
	}
	
	public void calcDone() {
		duration = System.currentTimeMillis() - startTime;
	}
	
	/**
	 * Berechnet n Folgeglieder der Vorschrift für π
	 * @param n
	 * @return
	 */
	public void calcPi(int it) {
		setStartTime();
		double pi_half = 1;
		for (int i = 1; i <= it; i++) {
			double zaehler = 4 * Math.pow(i, 2);
			double nenner = (2.0 * i - 1) * (2.0 * i + 1);
			double bla = zaehler / nenner;
			pi_half *= bla;
			if (pi_half == Double.NEGATIVE_INFINITY)
				System.out.println("OMGOMGOMGOMG");
			setCurrentPi(2 * pi_half);
		}
		calcDone();
	}
	
	abstract void piIteration(int i);
	
	/**
	 * Liefert die für den letzten calcPi-Aufruf aufgewendete Zeit in [ms]
	 * @return
	 */
	public double getCalcTime(){
		return duration;
	}
	
	/**
	 * Liefert den aktuellen Wert für π
	 * @return
	 */
	public double getCurrentPi() {
		return currentPi;
	}
	
	/**
	 * Liefert nur den Präfix von π zurück, der bereits korrekt ist
	 * @return
	 */
	public double getPi() {
		double currPi = currentPi;
		double realPi = Math.PI;
		String currPiString = Double.toString(currPi);
		String realPiString = Double.toString(realPi);
		String newPi = "";
		int i = 0;
		while (currPiString.charAt(i) == realPiString.charAt(i)) {
			newPi += currPiString.charAt(i);
		}
		return Double.parseDouble(newPi);
	}

}
