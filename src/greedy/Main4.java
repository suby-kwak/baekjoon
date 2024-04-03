package greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = reader.readLine();

        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        boolean sw = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '+') {
                if (sw) {
                    list.add(Integer.parseInt(sb.toString()));
                    sb = new StringBuilder();
                } else {
                    list.add(Integer.parseInt(sb.toString()));
                    sb = new StringBuilder();
                    sb.append('-');
                }
            } else if (c == '-') {
                sw = false;
                list.add(Integer.parseInt(sb.toString()));
                sb = new StringBuilder();
                sb.append('-');
            } else {
                sb.append(c);
            }
        }

        list.add(Integer.parseInt(sb.toString()));

        int result = 0;
        for (Integer i : list) {
            result += i;
        }

        writer.write(result + "\n");
        writer.close();
    }
}
