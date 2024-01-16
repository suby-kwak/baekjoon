package dynamicProgramming;

import java.io.*;

public class Main3 {
    static long[] bin = new long[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());

        bin[1] = 1;
        bin[2] = 2;

        long result = binary(N);

        writer.write(result + "\n");
        writer.close();
    }

    private static long binary(int n) {
        for (int i = 3; i <= n; i++) {
            bin[i] = (bin[i - 1] + bin[i - 2]) % 15746;
        }

        return bin[n];
    }
}
