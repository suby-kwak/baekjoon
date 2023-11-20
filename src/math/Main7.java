package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        V -= A;

        if (V % (A - B) > 0) {
            V = V / (A - B) + 2;
        } else {
            V = V / (A - B) + 1;
        }

        writer.write(V + "\n");
        writer.close();
        reader.close();
    }
}
