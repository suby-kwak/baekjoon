package twoDimensionalArray;

import java.io.*;
import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(reader.readLine());
        int result = 0;


        boolean[][] list = new boolean[100][100];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!list[j][k]) {
                        list[j][k] = true;
                        result++;
                    }
                }
            }
        }

        writer.write(result + "\n");
        writer.flush();
        writer.close();
        reader.close();
    }
}
