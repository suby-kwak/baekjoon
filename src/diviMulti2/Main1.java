package diviMulti2;

import java.io.*;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int multi = A * B;
            int min = Math.min(A, B);
            for (int j = min; j >= 1; j--) {
                if (A % j == 0 && B % j == 0) {
                    multi /= j;
                    break;
                }
            }
            writer.write(multi + "\n");
        }
        writer.close();
        reader.close();
    }
}
