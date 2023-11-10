package twoDimensionalArray;

import java.io.*;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[][] arr = new int[9][9];

        int result = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 9; j++) {
                int n = Integer.parseInt(st.nextToken());
                arr[i][j] = n;
                if (n >= result) {
                    result = n;
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        writer.write(result + "\n");
        writer.write(x + " " + y);
        writer.flush();
        writer.close();
        reader.close();
    }
}
