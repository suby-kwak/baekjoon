package map;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Integer, Integer> cntList = new HashMap<>();

        int N = Integer.parseInt(reader.readLine());
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (!cntList.containsKey(num)) {
                cntList.put(num, 1);
            } else {
                cntList.put(num, cntList.get(num) + 1);
            }
        }

        int M = Integer.parseInt(reader.readLine());
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < M; i++) {
            int check = Integer.parseInt(st.nextToken());
            writer.write(cntList.getOrDefault(check, 0) + " ");
        }
        writer.close();
        reader.close();
    }
}
