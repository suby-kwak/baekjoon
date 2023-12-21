package advance2;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        Set<String> set = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String str = reader.readLine();
            if (str.equals("ENTER")) {
                set.clear();
            } else {
                if (!set.contains(str)) {
                    set.add(str);
                    cnt++;
                }
            }
        }

        writer.write(cnt + "\n");
        writer.close();
        reader.close();
    }
}
