package advance;

import java.io.*;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = reader.readLine();

        String[] list = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String a : list) {
            str = str.replace(a, "/");
        }

        String[] split = str.split("");

        writer.write(split.length + "\n");
        writer.close();
        reader.close();
    }
}
