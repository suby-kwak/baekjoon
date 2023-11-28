package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int[] line = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(st.nextToken());
            line[i] = a;
        }

        Arrays.sort(line);
        if (line[2] >= line[0] + line[1]) {
            line[2] = line[0] + line[1] - 1;
        }

        for (int i : line) {
            sum += i;
        }

        System.out.println(sum);
    }
}
