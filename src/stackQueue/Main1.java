package stackQueue;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int ch = Integer.parseInt(st.nextToken());
            switch (ch) {
                case 1:
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        writer.write(-1 + "\n");
                    } else {
                        writer.write(stack.pop() + "\n");
                    }
                    break;
                case 3:
                    writer.write(stack.size() + "\n");
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        writer.write(1 + "\n");
                    } else {
                        writer.write(0 + "\n");
                    }
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        writer.write(-1 + "\n");
                    } else {
                        writer.write(stack.peek() + "\n");
                    }
                    break;
            }
        }
        writer.close();
        reader.close();
    }
}
