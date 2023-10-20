package string;

import java.io.*;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        String lan = st.nextToken();

        st = new StringTokenizer(reader.readLine());

        int i = Integer.parseInt(st.nextToken());

        writer.write( lan.charAt(i-1) + "\n");
        writer.close();
    }
}
