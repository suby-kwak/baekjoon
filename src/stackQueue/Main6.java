package stackQueue;

import java.io.*;
import java.util.*;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        Queue<Integer> queue = new ArrayDeque<>();
        int last = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            String order = st.nextToken();
            switch (order) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    queue.offer(num);
                    last = num;
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        writer.write(-1 + "\n");
                    } else {
                        writer.write(queue.poll() + "\n");
                    }
                    break;
                case "size":
                    writer.write(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        writer.write(1 + "\n");
                    } else {
                        writer.write(0 + "\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        writer.write(-1 + "\n");
                    } else {
                        writer.write(queue.peek() + "\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        writer.write(-1 + "\n");
                    } else {
                        writer.write(last + "\n");
                    }
                    break;
            }
        }
        writer.close();
        reader.close();
    }
}
