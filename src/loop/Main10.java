package loop;

import java.io.*;

public class Main10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        while (N < 1 || N > 100) {
            N = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < N; i++) {
            for (int k = N - 1; k > i; k--) {
                writer.write(" ");
            }
            for (int z = 0; z <= i; z++) {
                writer.write("*");
            }
            writer.write("\n");
        }
        writer.close();
    }
}
