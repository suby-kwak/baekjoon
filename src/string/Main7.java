package string;

import java.io.*;
import java.util.StringTokenizer;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(reader.readLine());
            int R = Integer.parseInt(st.nextToken());
            String[] split = st.nextToken().split("");
            for (String s : split) {
                for (int k = 0; k < R; k++) {
                    writer.write(s);
                }
            }
            writer.write("\n");
        }
        writer.close();
    }
}
