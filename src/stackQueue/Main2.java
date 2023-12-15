package stackQueue;

import java.io.*;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int K = Integer.parseInt(reader.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (num == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.add(num);
            }
        }

        int sum = 0;
        for (int i : stack) {
            sum += i;
        }
        writer.write(sum + "\n");
        writer.close();
        reader.close();
    }
}
