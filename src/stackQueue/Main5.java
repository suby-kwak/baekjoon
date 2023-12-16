package stackQueue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        Queue<Integer> nowLine = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        int cnt = 1;
        boolean chk = true;

        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            nowLine.offer(Integer.parseInt(st.nextToken()));
        }

        while (!nowLine.isEmpty()) {
            if (nowLine.peek() == cnt) {
                nowLine.poll();
                cnt++;
            } else if (!stack.isEmpty() && stack.peek() == cnt) {
                stack.pop();
                cnt++;
            } else {
                stack.push(nowLine.poll());
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == cnt) {
                stack.pop();
                cnt++;
            } else {
                chk = false;
                break;
            }
        }

        if (chk) {
            writer.write("Nice");
        } else {
            writer.write("Sad");
        }
        writer.close();
        reader.close();
    }
}
