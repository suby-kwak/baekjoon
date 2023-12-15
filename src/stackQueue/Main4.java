package stackQueue;

import java.io.*;
import java.util.Stack;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = null;

        do {
            str = reader.readLine();
            if (str.equals(".")) {
                break;
            }
            String[] split = str.split("");
            Stack<String> stack = new Stack<>();
            boolean chk = true;
            label:
            for (String s : split) {
                switch (s) {
                    case "(":
                        stack.push("(");
                        break;
                    case ")":
                        if (!stack.isEmpty() && stack.peek().equals("(")) {
                            stack.pop();
                        } else {
                            chk = false;
                            break label;
                        }
                        break;
                    case "[":
                        stack.push("[");
                        break;
                    case "]":
                        if (!stack.isEmpty() && stack.peek().equals("[")) {
                            stack.pop();
                        } else {
                            chk = false;
                            break label;
                        }
                        break;
                }
            }
            if (chk && stack.isEmpty()) {
                writer.write("yes\n");
            } else {
                writer.write("no\n");
            }
        } while (true);

        writer.close();
        reader.close();
    }
}
