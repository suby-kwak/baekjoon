package math;

import java.io.*;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        int point = 3;
        int result = 0;
        for (int i = 0; i < N; i++) {
            result = point * point;
            point = point + (point - 1);
        }

        writer.write(result + "\n");
        writer.flush();
        writer.close();
        reader.close();
    }
}
