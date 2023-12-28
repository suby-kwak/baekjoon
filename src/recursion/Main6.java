package recursion;

import java.io.*;

public class Main6 {
    static int N;
    static char[][] star;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(reader.readLine());
        if (N % 3 == 0) {
            star = new char[N][N];
            star[0][0] = '*';
            make(3);
            for (char[] str : star) {
                for (char c : str) {
                    sb.append(c);
                }
                sb.append("\n");
            }
            writer.write(String.valueOf(sb));
        }
        writer.close();
        reader.close();
    }

    private static void make(int n) {
        if (n <= N) {
            int plus = n / 3;
            for (int i = 0; i < n; i += plus) {
                for (int j = 0; j < n; j += plus) {
                    if (!(i == plus && j == plus)) {
                        copy(i, j, plus);
                    } else {
                        blank(i, j, plus);
                    }
                }
            }
            make(n * 3);
        }
    }

    private static void blank(int i, int j, int size) {
        for (int a = i; a < i + size; a++) {
            for (int b = j; b < j + size; b++) {
                star[a][b] = ' ';
            }
        }
    }

    private static void copy(int i, int j, int size) {
        for (int a = i; a < i + size; a++) {
            for (int b = j; b < j + size; b++) {
                star[a][b] = star[a - i][b - j];
            }
        }
    }
}
