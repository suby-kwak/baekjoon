package array;

import java.io.*;
import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int result = 0;
        int seq = 0;

        for (int i = 1; i < 10; i++) {
            st = new StringTokenizer(reader.readLine());
            int num = Integer.parseInt(st.nextToken());
            if (num > result) {
                result = num;
                seq = i;
            }
        }

        writer.write(result + "\n");
        writer.write(seq + "\n");
        writer.close();
    }
}
