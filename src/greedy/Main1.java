package greedy;

import java.io.*;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] a = new int[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = N - 1; i >= 0; i--) {

            if (a[i] > K) {
                continue;
            }

            result += K / a[i];
            K = K % a[i];

            if (K == 0) {
                break;
            }
        }

        writer.write(result + "\n");
        writer.close();
    }
}
