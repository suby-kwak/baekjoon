package dynamicProgramming;

import java.io.*;

public class Main9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        int[] calcul = new int[1000001];

        calcul[1] = 0;
        calcul[2] = 1;
        calcul[3] = 1;

        for (int i = 4; i <= N; i++) {
            if (i % 3 == 0 && i % 2 == 0) {
                calcul[i] = Math.min(calcul[i / 3], Math.min(calcul[i / 2], calcul[i - 1])) + 1;
            } else if (i % 3 == 0) {
                calcul[i] = Math.min(calcul[i / 3], calcul[i - 1]) + 1;
            } else if (i % 2 == 0) {
                calcul[i] = Math.min(calcul[i / 2], calcul[i - 1]) + 1;
            } else {
                calcul[i] = calcul[i - 1] + 1;
            }
        }

        writer.write(calcul[N] + "\n");
        writer.close();
    }
}
