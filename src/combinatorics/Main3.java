package combinatorics;

import java.io.*;

public class Main3 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(reader.readLine());

        if (N != 0) {
            Factorial(N);
        } else {
            N = 1;
        }

        writer.write(N + "\n");
        writer.close();
        reader.close();
    }

    private static void Factorial(int n) {
        if (n < 2) {
            return;
        } else {
            N *= n - 1;
            Factorial(n - 1);
        }
    }
}
