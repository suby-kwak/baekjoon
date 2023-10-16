package array;

import java.io.*;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        List<Integer> list = IntStream.rangeClosed(1,30).boxed().collect(Collectors.toList());
        for (int i = 0; i < 28; i++) {
            st = new StringTokenizer(reader.readLine());
            int check = Integer.parseInt(st.nextToken());
            list.set(check - 1, 0);
        }

        for (Integer integer : list) {
            if (integer != 0) {
                writer.write(integer + "\n");
            }
        }
        writer.close();
    }
}
