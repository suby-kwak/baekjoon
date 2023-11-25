package diviMulti;

import java.io.*;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(reader.readLine());
        int N = Integer.parseInt(reader.readLine());
        int sum = 0;
        int min = 10000;
        for (int i = M; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0 && j != 1) {
                    break;
                }

                if (j == i - 1) {
                    sum += i;
                    min = Math.min(min, i);
                }
            }
        }

        if (sum == 0 && min == 10000) {
            writer.write(-1 + "\n");
        } else {
            writer.write(sum + "\n");
            writer.write(min + "\n");
        }
        writer.close();
        reader.close();
    }
}
