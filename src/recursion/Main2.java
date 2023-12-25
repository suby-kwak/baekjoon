package recursion;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        writer.write(fibonacci(N) + "\n");
        writer.close();
        reader.close();
    }

    private static int fibonacci(int n) {
        if (n >= 2) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } else if (n == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
