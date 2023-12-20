package stackQueue;

import java.io.*;
import java.util.*;

public class Main11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        int[] chk = new int[N];
        Deque<Integer> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            chk[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (chk[i] == 0) {
                deque.addLast(num);
            }
        }

        int M = Integer.parseInt(reader.readLine());
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            deque.push(num);
            writer.write(deque.pollLast() + " ");
        }

        writer.close();
        reader.close();
    }
}
