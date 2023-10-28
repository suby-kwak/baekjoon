package string;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main8 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        List<String> lan = new ArrayList<>();

        while (st.hasMoreTokens()) {
            lan.add(st.nextToken());
        }

        writer.write(lan.size() + "\n");
        writer.close();
    }
}
