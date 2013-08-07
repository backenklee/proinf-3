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

}
