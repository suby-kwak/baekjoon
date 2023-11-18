package math;

import java.io.*;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        int result = 1;
        int count = 1;

        while (result < N) {
            result += count * 6;
            count++;
        }

        writer.write(count + "\n");
        writer.flush();
        writer.close();
        reader.close();
    }
}
