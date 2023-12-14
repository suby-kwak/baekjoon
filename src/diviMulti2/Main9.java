package diviMulti2;

import java.io.*;

public class Main9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        writer.write((int) Math.sqrt(N) + "\n");
        writer.close();
        reader.close();
    }
}
