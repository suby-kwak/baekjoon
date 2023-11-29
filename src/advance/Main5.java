package advance;

import java.io.*;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = reader.readLine().toUpperCase();

        Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long check = 0;
        String result = null;

        for (String key : collect.keySet()) {
            if (collect.get(key) > check) {
                check = collect.get(key);
                result = key;
            } else if (collect.get(key) == check) {
                result = "?";
            }
        }

        writer.write(result + "\n");
        writer.close();
        reader.close();
    }
}
