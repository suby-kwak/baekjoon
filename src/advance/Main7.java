package advance;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String str = reader.readLine();
            List<String> list = new ArrayList<>();

            String[] split = str.split("");
            String check = split[0];
            list.add(split[0]);

            for (int j = 0; j < split.length; j++) {
                if (!split[j].equals(check)) {
                    if (!list.contains(split[j])) {
                        list.add(split[j]);
                        check = split[j];
                    } else {
                        break;
                    }
                }

                if (j == split.length - 1) {
                    count++;
                }
            }
        }

        writer.write(count + "\n");
        writer.close();
        reader.close();
    }
}
