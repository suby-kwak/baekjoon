package array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();

        StringTokenizer st2 = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st2.nextToken()));
        }

        StringTokenizer st3 = new StringTokenizer(reader.readLine());
        int v = Integer.parseInt(st3.nextToken());
        int count = 0;
        for (Integer integer : list) {
            if (integer == v) {
                count++;
            }
        }

        writer.write(count + "\n");
        writer.close();
    }
}
