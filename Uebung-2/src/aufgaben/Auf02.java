package aufgaben;

import java.io.*;

public class Auf02 {
    
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream(new File("auf02-output.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(os);
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                int res = i*i+j;
                osw.write(res + " ");
            }
            osw.write("\n");
        }
        osw.close();
    }

	public static void mainalt(String[] args) {
		try {
			BufferedWriter wrt = new BufferedWriter(new FileWriter("blablabla"));
			for (byte zhlr = 0; zhlr < 100; zhlr++) {
				for (byte zhlr2 = 0; zhlr2 < 10; zhlr2++) {
					wrt.write((zhlr * zhlr + zhlr2)+"\t");
				}
				wrt.write("\n");
			}
			wrt.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
