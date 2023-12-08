package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main8 {
    static Comparator<String> comp = new Comparator<String>() {
        @Override
        public int compare(String a, String b) {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return a.compareTo(b);
            }
        }
    };

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        List<String> str = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = reader.readLine();
            str.add(s);
        }

        str.sort(comp);

        List<String> collect = str.stream().distinct().collect(Collectors.toList());

        for (String s : collect) {
            System.out.println(s);
        }
    }
}
