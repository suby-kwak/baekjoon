package advance;

import java.io.*;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        for (int i = 1; i < 2 * N; i++) {
            if (i <= N) {
                for (int j = N - i; j > 0; j--) {
                    writer.write(" ");
                }
                for (int k = 0; k < 2 * i - 1; k++) {
                    writer.write("*");
                }
                writer.write("\n");
            } else {
                for (int j = i - N; j > 0; j--) {
                    writer.write(" ");
                }
                for (int k = 0; k < 2 * (2 * N - i) - 1; k++) {
                    writer.write("*");
                }
                writer.write("\n");
            }
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
