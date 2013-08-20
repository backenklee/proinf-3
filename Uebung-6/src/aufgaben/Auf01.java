package aufgaben;


public class Auf01 {
	
	public static void main(String[] args) {
		int[][] shallow = {{1, 2, 3}, {4, 5, 6}};
		int[][] shallowCopy;
		int[][] deep = {{6, 5, 4}, {3, 2, 1}};
		int[][] deepCopy;
		
		// shallowCopy ist eine flache Kopie. Die Arrays, die
		// man mit shallowCopy[i] bekommt, sind die gleichen
		// (nicht nur gleicher Inhalt, auch am gleichen Speicherplatz!),
		// deswegen haben Änderungen an shallowCopy[i][j] auch
		// Auswirkungen auf das Original shallow.
		shallowCopy = shallow.clone();
		
		deepCopy = new int[deep.length][];
		
		// Hier wird auch clone() aufgerufen, allerdings einzeln für
		// jedes Array in deep. deepCopy beinhaltet jetzt die gleichen
		// Werte wie deep, hat dafür allerdings eigenen Speicher,
		// und damit haben Änderungen an deepCopy keine Auswirkungen
		// auf das Original deep.
		for (int i = 0; i < deep.length; i++)
			deepCopy[i] = deep[i].clone();
		
		System.out.println(shallow[0] == shallowCopy[0]);
		System.out.println(shallow[1] == shallowCopy[1]);
		// ...
		
		System.out.println(deep[0] == deepCopy[0]);
		System.out.println(deep[1] == deepCopy[1]);
		// ...
	}

}
