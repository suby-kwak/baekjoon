package diviMulti;

import java.io.*;
import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int result = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            for (int j = 1; j < num; j++) {
                if (num % j == 0 && j != 1) {
                    break;
                }

                if (j == num - 1) {
                    result++;
                }
            }
        }
        writer.write(result + "\n");
        writer.close();
        reader.close();
    }
}
