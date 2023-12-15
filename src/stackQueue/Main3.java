package stackQueue;

import java.io.*;
import java.util.Stack;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            Stack<String> stack = new Stack<>();
            String[] str = reader.readLine().split("");
            boolean chk = true;
            for (String s : str) {
                if (s.equals("(")) {
                    stack.push("(");
                } else if (s.equals(")")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        chk = false;
                        break;
                    }
                }
            }

            if (chk && stack.isEmpty()) {
                writer.write("YES\n");
            } else {
                writer.write("NO\n");
            }
        }
        writer.close();
        reader.close();
    }
}
