package math;

import java.io.*;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        int count = 1;
        while (N > 1) {
            count++;
            N -= count;
        }

        int a = 0;
        int b = 0;

        if (count % 2 == 0) {
            a = count + (N - 1);
            b = count + 1 - a;
        } else {
            b = count + (N - 1);
            a = count + 1 - b;
        }

        writer.write(a + "/" + b + "\n");
        writer.flush();
        writer.close();
        reader.close();
    }
}
