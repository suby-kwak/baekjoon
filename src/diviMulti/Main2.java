package diviMulti;

import java.io.*;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        int answer = 0;

        for (int i = 1; count < K; i++) {
            if (N % i == 0) {
                answer = i;
                count++;
            }

            if (N < i) {
                answer = 0;
                break;
            }
        }

        writer.write(answer + "\n");
        writer.flush();
        writer.close();
        reader.close();
    }
}
