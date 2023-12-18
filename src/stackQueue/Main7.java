package stackQueue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() != 1) {
            queue.poll();
            queue.add(queue.poll());
        }

        writer.write(queue.poll() + "\n");
        writer.close();
        reader.close();
    }
}
