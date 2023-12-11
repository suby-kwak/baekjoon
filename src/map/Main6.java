package map;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        Set<String> checkList = new HashSet<>();
        Set<String> answer = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String name = reader.readLine();
            checkList.add(name);
        }
        for (int i = 0; i < M; i++) {
            String name = reader.readLine();
            if (checkList.contains(name)) {
                answer.add(name);
            }
        }

        List<String> collect = answer.stream().sorted().collect(Collectors.toList());
        writer.write(collect.size() + "\n");
        for (String s : collect) {
            writer.write(s + "\n");
        }
        writer.close();
        reader.close();
    }
}
