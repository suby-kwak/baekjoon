package loop;

import java.io.*;
import java.util.StringTokenizer;

public class Main12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        boolean sw = true;

        while (sw) {
            try {
                st = new StringTokenizer(reader.readLine());

                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                writer.write(A + B + "\n");
            } catch (Exception e) {
                sw = false;
            }
        }

        writer.close();
    }
}
