package map;

import java.io.*;
import java.util.*;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        StringTokenizer st = new StringTokenizer(reader.readLine());
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> answer = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(reader.readLine());
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            answer.put(num, 0);
        }

        for (int i = 0; i < N; i++) {
            if (answer.containsKey(list.get(i))) {
                answer.replace(list.get(i), 1);
            }
        }

        for (int i : answer.keySet()) {
            writer.write(answer.get(i) + " ");
        }

        writer.close();
        reader.close();
    }
}
