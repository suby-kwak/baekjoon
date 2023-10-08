package loop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        StringTokenizer st2;
        List<Integer> C = new ArrayList<>();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (A != 0 || B != 0) {
            st2 = new StringTokenizer(reader.readLine());
            C.add(A + B);
            A = Integer.parseInt(st2.nextToken());
            B = Integer.parseInt(st2.nextToken());
        }

        for (Integer integer : C) {
            writer.write(integer + "\n");
        }

        writer.close();
    }
}
