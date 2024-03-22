package greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        int result = 0;

        int[] P = new int[N];

        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(P);

        int sum = 0;

        for (int i : P) {
            sum += i;
            result += sum;
        }

        writer.write(result + "\n");
        writer.close();
    }
}
