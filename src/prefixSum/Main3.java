package prefixSum;

import java.io.*;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = reader.readLine();
        int q = Integer.parseInt(reader.readLine());

        int[][] dp = new int[S.length()][26];
        dp[0][S.charAt(0) - 'a']++;

        for (int i = 1; i < S.length(); i++) {
            for (int j = 0; j < 26; j++) {
                dp[i][j] = dp[i - 1][j];
            }
            dp[i][S.charAt(i) - 'a']++;
        }

        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            char a = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            if (l == 0) {
                writer.write(dp[r][a - 'a'] + "\n");
            } else {
                writer.write(dp[r][a - 'a'] - dp[l - 1][a - 'a'] + "\n");
            }
        }

        writer.close();
    }
}
