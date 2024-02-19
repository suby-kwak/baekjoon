package prefixSum;

import java.io.*;
import java.util.StringTokenizer;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine());
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += Integer.parseInt(st.nextToken());
                arr[i][j] = sum;
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(reader.readLine());
            int x1 = Integer.parseInt(st.nextToken()) - 1;
            int y1 = Integer.parseInt(st.nextToken()) - 1;
            int x2 = Integer.parseInt(st.nextToken()) - 1;
            int y2 = Integer.parseInt(st.nextToken()) - 1;

            int result = 0;
            for (int j = x1; j <= x2; j++) {
                if (y1 == 0) {
                    result += arr[j][y2];
                } else {
                    result += arr[j][y2] - arr[j][y1 - 1];
                }
            }
            writer.write(result + "\n");
        }
        writer.close();
    }
}
