package dynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class Main12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        int[] nums = new int[N];
        int[] counts = new int[N];
        int maxValue = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        counts[0] = 1;

        for (int i = 1; i < N; i++) {
            counts[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && counts[j] >= counts[i]) {
                    counts[i] = counts[j] + 1;
                }
            }
        }

        for (int i : counts) {
            maxValue = Math.max(i, maxValue);
        }

        writer.write(maxValue + "\n");
        writer.close();
    }
}
