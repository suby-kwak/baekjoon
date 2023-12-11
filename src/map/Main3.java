package map;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        Set<String> attend = new HashSet<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            String name = st.nextToken();
            String check = st.nextToken();

            if (check.equals("enter")) {
                attend.add(name);
            } else if(check.equals("leave")) {
                attend.remove(name);
            }
        }

        List<String> sortAttend = attend.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for (String s : sortAttend) {
            writer.write(s + "\n");
        }
        writer.close();
        reader.close();
    }
}
