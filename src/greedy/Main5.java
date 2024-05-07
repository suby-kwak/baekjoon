package greedy;

import java.io.*;
import java.util.StringTokenizer;

public class Main5 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        long[] route = new long[N - 1];
        long[] node = new long[N];
        long result = 0;

        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N - 1; i++) {
            route[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            node[i] = Long.parseLong(st.nextToken());
        }

        int min_point = 0;
        long r = route[0];

        for (int i = 1; i < N - 1; i++) {
            if (node[min_point] <= node[i]) {
                r += route[i];
            } else {
                result += r * node[min_point];
                min_point = i;
                r = route[i];
            }
        }

        result += r * node[min_point];

        writer.write( result + "\n");
        writer.close();
    }

}
