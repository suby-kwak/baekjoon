package prefixSum;

import java.io.*;
import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] sums = new long[N];
        long[] dp = new long[M];
        long answer = 0;

        long num = 0;
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            num += Integer.parseInt(st.nextToken());
            sums[i] = num;
        }

        for (int i = 0; i < N; i++) {
            int r = (int) (sums[i] % M);
            if (r == 0) {
                answer++;
            }
            dp[r]++;
        }

        for (int i = 0; i < M; i++) {
            if (dp[i] > 1) {
                answer += (dp[i] * (dp[i] - 1) / 2);
            }
        }

        writer.write(answer + "\n");
        writer.close();
    }
}
