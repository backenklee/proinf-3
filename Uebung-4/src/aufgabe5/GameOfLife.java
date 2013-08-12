package aufgabe5;

import java.io.IOException;

public class GameOfLife {

	private Petrischale welt;

	public GameOfLife(int dimension) {
		this.welt = new Petrischale(dimension, 0.5);
	}

	public void startGame() {
		while (true) {
			try {
				Runtime.getRuntime().exec("clear");
			} catch (IOException e) {
				// Gotta catch 'em all
				e.printStackTrace();
			}
			System.out.println(welt.toString());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// Gotta catch 'em all
				e.printStackTrace();
			}
			welt.applyRules();
		}
	}

	public static void main(String[] args) {
		GameOfLife gol = new GameOfLife(10);
		gol.startGame();
	}

}
