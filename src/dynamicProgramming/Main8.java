package dynamicProgramming;

import java.io.*;

public class Main8 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        int[] stair = new int[300];
        int[] maxSum = new int[300];
        for (int i = 0; i < N; i++) {
            stair[i] = Integer.parseInt(reader.readLine());
        }

        maxSum[0] = stair[0];
        maxSum[1] = stair[0] + stair[1];
        maxSum[2] = Math.max(stair[0], stair[1]) + stair[2];

        for (int i = 3; i < N; i++) {
            maxSum[i] = Math.max(maxSum[i - 2], maxSum[i - 3] + stair[i - 1]) + stair[i];
        }

        writer.write(maxSum[N - 1] + "\n");
        writer.close();
    }
}
