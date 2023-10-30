package string;

import java.io.*;
import java.util.*;

public class Main10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        Map<String, Integer> alpha = new HashMap<>();
        char c = 65;
        int value = 2;
        int count = 0;
        for (int i = 0; i < 26; i++) {
            alpha.put(Character.toString(c + i), value);
            count++;
            if (value == 7 || value == 9) {
                if (count == 4) {
                    value++;
                    count = 0;
                }
            } else {
                if (count == 3) {
                    value++;
                    count = 0;
                }
            }
        }

        String[] S = st.nextToken().split("");
        int result = 0;
        for (String a : S) {
            result += alpha.get(a) + 1;
        }

        writer.write(result + "\n");
        writer.close();
    }
}
