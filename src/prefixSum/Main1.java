package prefixSum;

import java.io.*;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(reader.readLine());
        int[] nums = new int[N];
        int[] sums = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            sum += nums[i];
            sums[i] = sum;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken()) - 2;
            int b = Integer.parseInt(st.nextToken()) - 1;
            if (a < 0) {
                writer.write(sums[b] + "\n");
            } else {
                writer.write(sums[b] - sums[a] + "\n");
            }
        }
        writer.close();
    }
}
