package string;

import java.io.*;
import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int lan = st.nextToken().charAt(0);
        writer.write(lan + "\n");
        writer.close();
    }
}
