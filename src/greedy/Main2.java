package greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        int[][] time = new int[N][2];
        int result = 1;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time,(o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        int end = time[0][1];

        for (int i = 1; i < N; i++) {
            if (end > time[i][0]) {
                end = Math.min(end, time[i][1]);
            } else {
                result++;
                end = time[i][1];
            }
        }

        writer.write(result + "\n");
        writer.close();
    }
}
