package loop;

import java.io.*;
import java.util.StringTokenizer;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(reader.readLine());
        while (N < 0 || N > 1000000) {
            N = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            while (a < 1 || a > 1000) {
                a = Integer.parseInt(st.nextToken());
            }

            int b = Integer.parseInt(st.nextToken());
            while (b < 1 || b > 1000) {
                b = Integer.parseInt(st.nextToken());
            }

            writer.write(a + b + "\n");
        }

        writer.close();
    }
}
