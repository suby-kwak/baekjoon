package array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        for (int a = 0; a < N; a++) {
            list.add(a + 1);
        }

        for (int b = 0; b < M; b++) {
            st = new StringTokenizer(reader.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int temp = list.get(i - 1);
            list.set(i - 1, list.get(j - 1));
            list.set(j - 1, temp);
        }

        for (Integer integer : list) {
            writer.write(integer + " ");
        }

        writer.close();
    }
}
