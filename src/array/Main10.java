package array;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main10 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(reader.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }

        list.sort(Comparator.naturalOrder());
        int max = list.get(N - 1);
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }

        double result = (double) (sum * 100) / (N * max);
        writer.write(result + "\n");
        writer.close();
    }
}
