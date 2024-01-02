package backTracking;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main1 {

    static Stack<Integer> rest = new Stack<>();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        backTrack(N, M);
        writer.close();
    }

    private static void backTrack(int n, int m) throws IOException {
        if (m == 0) {
            for (int i : rest) {
                writer.write(i+" ");
            }
            writer.write("\n");
            rest.pop();
        } else {
            for (int i = 1; i <= n; i++) {
                if (!rest.contains(i)) {
                    rest.add(i);
                    backTrack(n, m - 1);
                }
            }
            if (!rest.isEmpty()) {
                rest.pop();
            }
        }
    }


}
