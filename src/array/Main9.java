package array;

import java.io.*;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> list = IntStream.rangeClosed(1,N).boxed().collect(Collectors.toList());
        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(reader.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            if ((i + j) % 2 == 0) {
                int average = (i + j) / 2;
                for (int b = i; b <= average; b++) {
                    int temp = list.get(b - 1);
                    list.set(b - 1, list.get(average * 2 - b - 1));
                    list.set(average * 2 - b - 1, temp);
                }
            } else {
                int average = (i + j) / 2;
                for (int b = i; b <= average; b++) {
                    int temp = list.get(b - 1);
                    list.set(b - 1, list.get(average * 2 - b));
                    list.set(average * 2 - b, temp);
                }
            }
        }

        for (Integer integer : list) {
            writer.write(integer + " ");
        }
        writer.close();
    }
}
