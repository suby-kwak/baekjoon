package dynamicProgramming;

import java.io.*;

public class Main1 {
    static int count1=1;
    static int count2;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());

        fib(n);
        fibonacci(n);

        writer.write(count1+" ");
        writer.write(count2 + "\n");
        writer.close();
    }

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            count1++;
            return fib(n - 1) + fib(n - 2);
        }
    }

    private static int fibonacci(int n) {
        int[] f = new int[n + 1];
        f[1] = f[2] = 1;
        for (int i = 3; i <= n; i++) {
            count2++;
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }
}
