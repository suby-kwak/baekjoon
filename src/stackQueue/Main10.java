package stackQueue;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        Deque<Integer> number = new ArrayDeque<>();
        Deque<Integer> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= N; i++) {
            number.addLast(i);
            deque.addLast(Integer.parseInt(st.nextToken()));
        }

        int chk = 1;
        while (!number.isEmpty()&&!deque.isEmpty()) {
            int num = Math.abs(chk);
            if (chk > 0) {
                for (int i = 0; i < num; i++) {
                    if (i == num - 1) {
                        writer.write(number.pollFirst() + " ");
                        chk = deque.pollFirst();
                    } else {
                        number.addLast(number.pollFirst());
                        deque.addLast(deque.pollFirst());
                    }
                }
            } else {
                for (int i = 0; i < num; i++) {
                    if (i == num - 1) {
                        writer.write(number.pollLast() + " ");
                        chk = deque.pollLast();
                    } else {
                        number.addFirst(number.pollLast());
                        deque.addFirst(deque.pollLast());
                    }
                }
            }
        }
        writer.close();
        reader.close();
    }
}
