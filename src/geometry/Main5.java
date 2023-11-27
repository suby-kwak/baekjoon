package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(reader.readLine());
        int[] min = {10001, 10001};
        int[] max = {-10001, -10001};

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 2; j++) {
                int num = Integer.parseInt(st.nextToken());
                min[j] = Math.min(num, min[j]);
                max[j] = Math.max(num, max[j]);
            }
        }

        System.out.println((max[0] - min[0]) * (max[1] - min[1]));
    }
}
