package dynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class Main16 {
    public static class Goods {
        int weight;
        int value;

        public Goods(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Goods[] goods = new Goods[N];
        int[] dp = new int[K + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine());
            goods[i] = new Goods(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < N; i++) {
            for (int j = K; j >= goods[i].weight; j--) {
                dp[j] = Math.max(dp[j], dp[j - goods[i].weight] + goods[i].value);
            }
        }

        writer.write(dp[K] + "\n");
        writer.close();
    }
}
