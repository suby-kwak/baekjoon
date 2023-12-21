package advance2;

import java.io.*;
import java.util.*;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        Set<String> members = new HashSet<>();
        members.add("ChongChong");
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            String mem1 = st.nextToken();
            String mem2 = st.nextToken();
            if (members.contains(mem1)) {
                members.add(mem2);
            } else if (members.contains(mem2)) {
                members.add(mem1);
            }
        }

        writer.write(members.size() + "\n");
        writer.close();
        reader.close();
    }
}
