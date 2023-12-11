package map;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        Map<Integer, String> pokemonList = new HashMap<>();
        Map<String, Integer> numList = new HashMap<>();

        for (int i = 1; i < N + 1; i++) {
            String name = reader.readLine();
            pokemonList.put(i, name);
            numList.put(name, i);
        }

        for (int i = 0; i < M; i++) {
            String s = reader.readLine();
            if (Character.isDigit(s.charAt(0))) {
                int num = Integer.parseInt(s);
                writer.write(pokemonList.get(num) + "\n");
            } else {
                writer.write(numList.get(s) + "\n");
            }
        }

        writer.close();
        reader.close();
    }
}
