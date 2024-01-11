package backTracking;

import java.io.*;
import java.util.*;

public class Main6 {
    static int[][] board = new int[9][9];
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 9; j++) {
                int a = Integer.parseInt(st.nextToken());
                if (a == 0) {
                    list.add(i * 9 + j);
                }
                board[i][j] = a;
            }
        }

        sdocu(0);

        for (int[] line : board) {
            for (int i : line) {
                writer.write(i+" ");
            }
            writer.write("\n");
        }
        writer.close();
    }

    private static boolean sdocu(int idx) {
        if (idx >= list.size()) {
            return true;
        }

        int num = list.get(idx);
        int y = num / 9;
        int x = num % 9;

        for (int i = 1; i < 10; i++) {
            if (!check(y, x, i)) {
                continue;
            }

            board[y][x] = i;

            if (sdocu(idx + 1)) {
                return true;
            }
        }

        board[y][x] = 0;
        return false;
    }

    private static boolean check(int y, int x, int n) {
        for (int i = 0; i < 9; i++) {
            if (board[i][x] == n) {
                return false;
            }
        }

        for (int j = 0; j < 9; j++) {
            if (board[y][j] == n) {
                return false;
            }
        }

        int y1 = y / 3 * 3;
        int x1 = x / 3 * 3;
        for (int i = y1; i < y1 + 3; i++) {
            for (int j = x1; j < x1 + 3; j++) {
                if (board[i][j] == n) {
                    return false;
                }
            }
        }

        return true;
    }
}
