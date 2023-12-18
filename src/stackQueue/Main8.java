package stackQueue;

import java.io.*;
import java.util.*;

public class Main8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < K; i++) {
                if (i == K - 1) {
                    answer.add(queue.poll());
                } else {
                    queue.offer(queue.poll());
                }
            }
        }

        int size = answer.size();
        if (size != 1) {
            for (int i = 0; i < answer.size(); i++) {
                if (i == 0) {
                    writer.write("<" + answer.get(i) + ", ");
                } else if (i == answer.size() - 1) {
                    writer.write(answer.get(i) + ">");
                } else {
                    writer.write(answer.get(i) + ", ");
                }
            }
        } else {
            writer.write("<" + answer.get(0) + ">");
        }

        writer.close();
        reader.close();
    }
}
