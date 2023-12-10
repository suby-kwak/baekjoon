package map;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        int cnt = 0;

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(reader.readLine());
        }

        for (int i = 0; i < M; i++) {
            String str = reader.readLine();
            if (set.contains(str)) {
                cnt++;
            }
        }

        writer.write(cnt + "\n");
        writer.close();
        reader.close();
    }
}
