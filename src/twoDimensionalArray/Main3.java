package twoDimensionalArray;

import java.io.*;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String[][] strs = new String[5][15];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(reader.readLine());
            String str = st.nextToken();
            for (int j = 0; j < 15; j++) {
                String[] split = str.split("");
                if (split.length > j) {
                    strs[i][j] = split[j];
                } else {
                    strs[i][j] = "/";
                }
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (!strs[j][i].equals("/")) {
                    writer.write(strs[j][i]);
                }
            }
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
