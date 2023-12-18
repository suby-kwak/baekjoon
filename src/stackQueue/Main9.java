package stackQueue;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int order = Integer.parseInt(st.nextToken());
            switch (order) {
                case 1:
                    int x = Integer.parseInt(st.nextToken());
                    deque.addFirst(x);
                    break;
                case 2:
                    int y = Integer.parseInt(st.nextToken());
                    deque.addLast(y);
                    break;
                case 3:
                    if (deque.isEmpty()) {
                        writer.write(-1 + "\n");
                    } else {
                        writer.write(deque.pollFirst() + "\n");
                    }
                    break;
                case 4:
                    if (deque.isEmpty()) {
                        writer.write(-1 + "\n");
                    } else {
                        writer.write(deque.pollLast() + "\n");
                    }
                    break;
                case 5:
                    writer.write(deque.size() + "\n");
                    break;
                case 6:
                    if (deque.isEmpty()) {
                        writer.write(1 + "\n");
                    } else {
                        writer.write(0 + "\n");
                    }
                    break;
                case 7:
                    if (deque.isEmpty()) {
                        writer.write(-1 + "\n");
                    } else {
                        writer.write(deque.peekFirst() + "\n");
                    }
                    break;
                case 8:
                    if (deque.isEmpty()) {
                        writer.write(-1 + "\n");
                    } else {
                        writer.write(deque.peekLast() + "\n");
                    }
            }
        }
        writer.close();
        reader.close();
    }
}
