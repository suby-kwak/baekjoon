package dynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class Main6 {
    static int[][] rgb;
    static int[][] ans;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(reader.readLine());

        rgb = new int[N][3];
        ans = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 3; j++) {
                rgb[i][j] = Integer.parseInt(st.nextToken());
                if (i == 0) {
                    ans[0][j] = rgb[i][j];
                }
            }
        }


        for (int i = 1; i < N; i++) {
            ans[i][0] = Math.min(ans[i - 1][1], ans[i - 1][2]) + rgb[i][0];
            ans[i][1] = Math.min(ans[i - 1][0], ans[i - 1][2]) + rgb[i][1];
            ans[i][2] = Math.min(ans[i - 1][0], ans[i - 1][1]) + rgb[i][2];
        }

        int min = Math.min(Math.min(ans[N-1][0], ans[N-1][1]), ans[N-1][2]);

        writer.write(min + "\n");
        writer.close();
    }
}
