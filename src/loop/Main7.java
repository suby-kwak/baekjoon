package loop;

import java.io.*;
import java.util.StringTokenizer;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(reader.readLine());
        while (T < 1 || T > 1000000) {
            T = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            while (a <= 0) {
                a = Integer.parseInt(st.nextToken());
            }

            int b = Integer.parseInt(st.nextToken());
            while (b >= 10) {
                b = Integer.parseInt(st.nextToken());
            }

            writer.write("Case #" + (i + 1) + ": " + (a + b) + "\n");
        }

        writer.close();
    }
}
