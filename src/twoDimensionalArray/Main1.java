package twoDimensionalArray;

import java.io.*;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] array = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < M; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < M; j++) {
                array[i][j] += Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                writer.write(array[i][j]+" ");
            }
            writer.write("\n");
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
