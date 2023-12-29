package recursion;

import java.io.*;

public class Main7 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(reader.readLine());
        writer.write((int) Math.pow(2, N) - 1 + "\n");
        hanoi(N, 1, 3, 2);
        writer.close();
        reader.close();
    }

    private static void hanoi(int n, int start, int end, int via) throws IOException {
        if (n == 1) {
            writer.write(n + " " + start + " " + end + "\n");
        } else {
            hanoi(n - 1, start, via, end);
            writer.write(n + " " + start + " " + end + "\n");
            hanoi(n - 1, via, end, start);
        }
    }
}
