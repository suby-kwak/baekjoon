package dynamicProgramming;

import java.io.*;

public class Main15 {
    static int[] dp;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = reader.readLine();
        String str2 = reader.readLine();

        if (str.length() > str2.length()) {
            lcs(str2, str);
        } else {
            lcs(str, str2);
        }

        writer.write(max + "\n");
        writer.close();
    }

    private static int lcs(String s, String l) {
        dp = new int[l.length()];

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < l.length(); j++) {
                if (s.charAt(i) == l.charAt(j)) {
                    if (count < dp[j]) {
                        max = Math.max(max, count = dp[j]);
                    } else {
                        max = Math.max(max, dp[j] = count + 1);
                    }
                } else {
                    max = Math.max(max, count = Math.max(count, dp[j]));
                }
            }
        }

        return max;
    }
}
