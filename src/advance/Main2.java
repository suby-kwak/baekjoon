package advance;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        Integer[] listA = {1, 1, 2, 2, 2, 8};
        List<Integer> list = Arrays.asList(listA);

        List<Integer> input = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int num = Integer.parseInt(st.nextToken());
            input.add(list.get(i) - num);
        }

        for (Integer integer : input) {
            writer.write(integer + " ");
        }
        writer.flush();
        writer.close();
    }
}
