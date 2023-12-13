package diviMulti2;

import java.io.*;
import java.util.StringTokenizer;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());

        for (int i = M; i <= N; i++) {
            boolean chk = false;
            if (i == 2) {
            } else if (i > 2) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        chk = true;
                        break;
                    }
                }
            } else {
                chk = true;
            }

            if (!chk) {
                System.out.println(i);
            }
        }
    }
}
