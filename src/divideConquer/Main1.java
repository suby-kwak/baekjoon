package divideConquer;

import java.io.*;
import java.util.StringTokenizer;

public class Main1 {
    static int b = 0;
    static int w = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        int[][] paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        conquer(N, paper,0,0);

        writer.write(w + "\n");
        writer.write(b + "\n");
        writer.close();
    }

    public static void conquer(int n, int[][] paper, int x, int y) {
        boolean sw = true;

        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (paper[x][y] != paper[i][j]) {
                    sw = false;
                    break;
                }
            }
            if (!sw) {
                break;
            }
        }

        if (sw) {
            if (paper[x][y] == 1) {
                b++;
            } else {
                w++;
            }
        } else {
            conquer(n / 2, paper, x, y);
            conquer(n / 2, paper, x + n / 2, y);
            conquer(n / 2, paper, x, y + n / 2);
            conquer(n / 2, paper, x + n / 2, y + n / 2);
        }
    }
}
