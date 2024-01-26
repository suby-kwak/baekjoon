package dynamicProgramming;

import java.io.*;

public class Main11 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        int[] wines = new int[10001];
        int[] max = new int[10001];

        for (int i = 0; i < N; i++) {
            wines[i] = Integer.parseInt(reader.readLine());
        }

        max[0] = wines[0];
        max[1] = wines[1] + wines[0];
        max[2] = wines[2] + wines[1] + wines[0] - Math.min(Math.min(wines[0], wines[1]), wines[2]);

        for (int i = 3; i < N; i++) {
            if (wines[i] != 0) {
                max[i] = Math.max(Math.max(wines[i - 1] + max[i - 3], max[i - 2]) + wines[i], max[i - 1]);
            } else {
                max[i] = max[i - 1];
            }
        }

        for (int i : max) {
            System.out.println(i);
        }
        writer.write(max[N - 1] + "\n");
        writer.close();
    }
}
