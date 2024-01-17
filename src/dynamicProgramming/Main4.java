package dynamicProgramming;

import java.io.*;

public class Main4 {
    static long[] padoban = new long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(reader.readLine());

        padoban[1] = 1;
        padoban[2] = 1;
        padoban[3] = 1;

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(reader.readLine());
            long result = dp(N);
            writer.write(result + "\n");
        }
        writer.close();
    }

    private static long dp(int n) {
        if (padoban[n] != 0) {
            return padoban[n];
        }

        for (int i = 4; i <= n; i++) {
            padoban[i] = padoban[i - 2] + padoban[i - 3];
        }
        return padoban[n];
    }
}
