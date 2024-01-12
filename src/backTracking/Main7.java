package backTracking;

import java.io.*;
import java.util.StringTokenizer;

public class Main7 {
    static int N;
    static int[] num;
    static int[] formula = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(reader.readLine());

        StringTokenizer st = new StringTokenizer(reader.readLine());
        num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < 4; i++) {
            formula[i] = Integer.parseInt(st.nextToken());
        }

        backTrack(num[0], 1);

        writer.write(max + "\n");
        writer.write(min + "\n");
        writer.close();
    }

    private static void backTrack(int result, int index) {
        if (index == N) {
            max = Math.max(max, result);
            min = Math.min(min, result);
        }

        if (formula[0] > 0) {
            formula[0]--;
            backTrack(result + num[index], index + 1);
            formula[0]++;
        }
        if (formula[1] > 0) {
            formula[1]--;
            backTrack(result - num[index], index + 1);
            formula[1]++;
        }
        if (formula[2] > 0) {
            formula[2]--;
            backTrack(result * num[index], index + 1);
            formula[2]++;
        }
        if (formula[3] > 0) {
            formula[3]--;
            if (result < 0) {
                backTrack(Math.abs(result) / num[index] * -1, index + 1);
            } else {
                backTrack(result / num[index], index + 1);
            }
            formula[3]++;
        }
    }
}
