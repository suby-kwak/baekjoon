package dynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class Main5 {
    static int[] arr;
    static int[] sum;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(reader.readLine());
        arr = new int[n];
        sum = new int[n];

        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        sum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            if (sum[i - 1] < 0) {
                sum[i] = arr[i];
            } else {
                sum[i] = sum[i - 1] + arr[i];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int s : sum) {
            max = Math.max(max, s);
        }

        writer.write(max + "\n");
        writer.close();
    }
}
