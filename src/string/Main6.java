package string;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        String[] lan = st.nextToken().split("");
        Map<String, Integer> spell = new HashMap<>();
        char c = 97;
        for (int i = 0; i < 26; i++) {
            spell.put(Character.toString(c + i), -1);
        }
        
        for (int i = 0; i < lan.length; i++) {
            if (spell.get(lan[i]) == -1) {
                spell.replace(lan[i], i);
            }
        }

        for (String key : spell.keySet()) {
            Integer value = spell.get(key);
            writer.write(value + " ");
        }
        writer.close();
    }
}
