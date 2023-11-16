package math;

import java.io.*;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        int[] rest = new int[4];


        for (int i = 0; i < N; i++) {
            int C = Integer.parseInt(reader.readLine());
            rest[0] = C / 25;
            C %= 25;

            rest[1] = C / 10;
            C %= 10;

            rest[2] = C / 5;
            C %= 5;

            rest[3] = C;

            for (int num : rest) {
                writer.write(num + " ");
            }
            writer.write("\n");
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
