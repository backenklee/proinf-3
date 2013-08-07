package aufgaben;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Auf02 {

	public static void main(String[] args) {
		try {
			BufferedWriter wrt = new BufferedWriter(new FileWriter("blablabla"));
			for (byte zhlr = 0; zhlr < 100; zhlr++) {
				for (byte zhlr2 = 0; zhlr2 < 10; zhlr2++) {
					wrt.write((zhlr * zhlr + zhlr2)+"\t");
				}
			}
			wrt.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
