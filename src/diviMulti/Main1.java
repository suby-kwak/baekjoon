package diviMulti;

import java.io.*;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int A = -1;
        int B = -1;

        while (A != 0 && B != 0) {
            st = new StringTokenizer(reader.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if (A == 0 && B == 0) {
                break;
            }

            if (B % A == 0) {
                writer.write("factor\n");
            } else if (A % B == 0) {
                writer.write("multiple\n");
            } else {
                writer.write("neither\n");
            }
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
