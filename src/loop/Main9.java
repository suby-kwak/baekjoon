package loop;

import java.io.*;

public class Main9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        while (N < 1 || N > 100) {
            N = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < N; i++) {
            for (int k = 0; k <= i; k++) {
                writer.write("*");
            }
            writer.write("\n");
        }

        writer.close();
    }
}
