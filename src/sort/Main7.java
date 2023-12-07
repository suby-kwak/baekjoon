package sort;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        int[][] graph = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 2; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(graph,(a,b)-> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        for (int[] point : graph) {
            writer.write(point[0] + " " + point[1] + "\n");
        }
        writer.close();
        reader.close();
    }
}
