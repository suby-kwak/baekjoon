package string;

import java.io.*;
import java.util.StringTokenizer;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(reader.readLine());
        String num = st.nextToken();
        String[] split = num.split("");

        int sum = 0;

        for (String s : split) {
            sum += Integer.parseInt(s);
        }

        writer.write(sum + "\n");
        writer.close();
    }
}
