package backTracking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main8 {
    static int N;
    static int[][] board;
    static List<Integer> list = new ArrayList<>();
    static List<Integer> reverse = new ArrayList<>();
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(reader.readLine());
        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        list.add(0);
        backTrack(1, N / 2 - 2);

        writer.write(min + "\n");
        writer.close();
    }

    private static void backTrack(int i, int index) {
        if (index < 0) {
            for (int a = 0; a < N; a++) {
                if (!list.contains(a)) {
                    reverse.add(a);
                }
            }
            int result = solve();
            min = Math.min(result, min);
            reverse.clear();
            return;
        }

        for (int a = i; a < N - index; a++) {
            list.add(a);
            backTrack(a + 1, index - 1);
            list.remove((Integer) a);
        }
    }

    private static int solve() {
        int start=0;
        int link=0;

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                start += board[list.get(i)][list.get(j)] + board[list.get(j)][list.get(i)];
                link += board[reverse.get(i)][reverse.get(j)] + board[reverse.get(j)][reverse.get(i)];
            }
        }

        return Math.abs(start - link);
    }
}
