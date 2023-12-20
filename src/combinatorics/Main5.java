package combinatorics;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
            BigInteger answer = combine(N, M);
            writer.write(answer + "\n");
        }
        writer.close();
        reader.close();
    }

    private static BigInteger combine(int n, int m) {
        BigInteger answer = BigInteger.valueOf(1);
        for (int i = m; i > m - n; i--) {
            answer = answer.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= n; i++) {
            answer = answer.divide(BigInteger.valueOf(i));
        }

        return answer;
    }
}
