package combinatorics;

import java.io.*;
import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        int G = N - K;
        int answer = Factorial(N) / Factorial(K) / Factorial(G);
        writer.write(answer + "\n");
        writer.close();
        reader.close();
    }

    private static int Factorial(int n) {
        if (n > 0) {
            return n * Factorial(n - 1);
        } else {
            return 1;
        }
    }
}
