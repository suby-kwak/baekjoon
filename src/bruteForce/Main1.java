package bruteForce;

import java.io.*;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int max = 0;

        int[] list = new int[N];
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N-2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int result = list[i] + list[j] + list[k];
                    if (result <= M) {
                        max = Math.max(result, max);
                    }
                }
            }
        }

        writer.write(max + "\n");
        writer.close();
        reader.close();
    }
}
