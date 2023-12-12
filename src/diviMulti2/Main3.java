package diviMulti2;

import java.io.*;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] frac = new int[2][2];

        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 2; j++) {
                frac[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int a = frac[0][1];
        int b = frac[1][1];

        int gcd = gcd(a, b);
        int multi = a * b / gcd;

        int sum = (b * frac[0][0] / gcd) + (a * frac[1][0] / gcd);

        int answer = gcd(multi, sum);
        writer.write(sum/answer+" ");
        writer.write(multi / answer + "\n");
        writer.close();
        reader.close();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int rest = a % b;
            a = b;
            b = rest;
        }
        return a;
    }
}
