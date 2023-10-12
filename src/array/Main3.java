package array;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st2.nextToken());
            list.add(num);
        }

        list.sort(Comparator.naturalOrder());

        writer.write(list.get(0) + " " + list.get(list.size() - 1));
        writer.close();
    }
}
