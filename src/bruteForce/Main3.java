package bruteForce;

import java.io.*;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int[] equal = new int[6];

        for (int i = 0; i < 6; i++) {
            equal[i] = Integer.parseInt(st.nextToken());
        }

        for (int x = -999; x < 1000; x++) {
            for (int y = -999; y < 1000; y++) {
                if ((equal[0] * x) + (equal[1] * y) == equal[2]
                        && (equal[3] * x) + (equal[4] * y) == equal[5]) {
                    writer.write(x + " ");
                    writer.write(y + "\n");
                }
            }
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}
