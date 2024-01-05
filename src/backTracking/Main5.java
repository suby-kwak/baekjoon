package backTracking;

import java.io.*;

public class Main5 {
    static int count = 0;
    static int[] check;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(reader.readLine());
        check = new int[N];
        BackTrack(0);
        writer.write(count + "\n");
        writer.close();
    }

    private static void BackTrack(int n) {
        boolean queen;
        if (n == N) {
            count++;
        } else {
            for (int i = 0; i < N; i++) {
                queen = true;
                for (int j = 0; j < n; j++) {
                    if (check[j] == i || (n - j) == Math.abs(i - check[j])) {
                        queen = false;
                        break;
                    }
                }
                if (queen) {
                    check[n] = i;
                    BackTrack(n + 1);
                }
            }
        }
    }
}
