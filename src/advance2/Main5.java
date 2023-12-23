package advance2;

import java.io.*;
import java.util.*;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        Map<String, Integer> lan = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String str = reader.readLine();
            if (str.length() >= M) {
                if (!lan.containsKey(str)) {
                    lan.put(str, 1);
                } else {
                    lan.put(str, lan.get(str) + 1);
                }
            }
        }

        List<String> keySet = new ArrayList<>(lan.keySet());
        keySet.sort((o1, o2) -> {
            if (!lan.get(o2).equals(lan.get(o1))) {
                return lan.get(o2) - lan.get(o1);
            } else if (o1.length() != o2.length()) {
                return o2.length() - o1.length();
            } else {
                return o1.compareTo(o2);
            }
        });

        for (String key : keySet) {
            writer.write(key + "\n");
        }

        writer.close();
        reader.close();
    }
}
