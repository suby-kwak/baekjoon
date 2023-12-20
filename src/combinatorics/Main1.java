package combinatorics;

import java.io.*;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());

        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i != j) {
                    cnt++;
                }
            }
        }

        writer.write(cnt + "\n");
        writer.close();
        reader.close();
    }
}
