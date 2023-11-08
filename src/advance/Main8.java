package advance;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(reader.readLine());
            String obj = st.nextToken();
            double N = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (map.containsKey(grade)) {
                sum1 += N;
                sum2 += N * map.get(grade);
            }
        }

        double result = sum2 / sum1;

        writer.write(result + "\n");
        writer.flush();
        writer.close();
        reader.close();
    }
}
