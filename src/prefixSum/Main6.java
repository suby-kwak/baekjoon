package prefixSum;

import java.io.*;
import java.util.StringTokenizer;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] board = new int[N + 1][M + 1];
        int[][] black = new int[N + 1][M + 1];
        int[][] white = new int[N + 1][M + 1];

        int result = Integer.MAX_VALUE;

        for (int i = 1; i < N + 1; i++) {
            String s = reader.readLine();
            for (int j = 1; j < M + 1; j++) {
                board[i][j] = (s.charAt(j - 1) == 'B') ? 1 : 0;
            }
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
                black[i][j] = ((i + j) % 2 == 0) ? 1 : 0;
                white[i][j] = (i + j) % 2;
            }
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
                black[i][j] = (black[i][j] + board[i][j]) % 2;
                white[i][j] = (white[i][j] + board[i][j]) % 2;
            }
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
                black[i][j] = black[i - 1][j] + black[i][j - 1] + black[i][j] - black[i - 1][j - 1];
                white[i][j] = white[i - 1][j] + white[i][j - 1] + white[i][j] - white[i - 1][j - 1];
            }
        }

        for (int i = K; i < N + 1; i++) {
            for (int j = K; j < M + 1; j++) {
                int b = black[i][j] - black[i][j - K] - black[i - K][j] + black[i - K][j - K];
                int w = white[i][j] - white[i][j - K] - white[i - K][j] + white[i - K][j - K];
                result = Math.min(result, Math.min(b, w));
            }
        }
        writer.write(result + "\n");
        writer.close();
    }
}
