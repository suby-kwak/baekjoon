package math;

import java.io.*;
import java.util.*;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        writer.write(Integer.parseInt(N, B) + "\n");
        writer.flush();
        writer.close();
        reader.close();
    }
}
