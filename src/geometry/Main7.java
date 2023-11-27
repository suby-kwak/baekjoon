package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(reader.readLine());
            int[] line = new int[3];
            for (int i = 0; i < 3; i++) {
                line[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(line);
            if (line[0] == 0) {
                break;
            }

            if (line[2] < line[0] + line[1]) {
                if (line[0] == line[1] && line[1] == line[2]) {
                    System.out.println("Equilateral");
                } else if (line[0] == line[1] || line[1] == line[2] || line[0] == line[2]) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
