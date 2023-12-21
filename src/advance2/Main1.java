package advance2;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(reader.readLine());

        StringTokenizer st = new StringTokenizer(reader.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        list.sort(Comparator.naturalOrder());

        writer.write(list.get(0) * list.get(list.size() - 1) + "\n");
        writer.close();
        reader.close();
    }
}
