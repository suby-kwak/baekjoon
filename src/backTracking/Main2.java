package backTracking;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main2 {
    static Stack<Integer> stack = new Stack<>();
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
            for (int i : stack) {
                writer.write(i + " ");
            }
            writer.write("\n");
            stack.pop();
        } else {
            for (int i = 1; i <= n; i++) {
                if (!stack.contains(i)) {
                    if (stack.isEmpty()) {
                        stack.add(i);
                        backTrack(n, m - 1);
                    } else if (stack.peek() < i) {
                        stack.add(i);
                        backTrack(n, m - 1);
                    }
                }
            }

            if (!stack.isEmpty()) {
                stack.pop();
            }
        }
    }
}
