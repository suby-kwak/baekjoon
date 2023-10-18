package array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(reader.readLine());
            int num = Integer.parseInt(st.nextToken());
            int rest = num % 42;
            if (!list.contains(rest)) {
                list.add(rest);
            }
        }

        writer.write(list.size()+"\n");
        writer.close();
    }
}
