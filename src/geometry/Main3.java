package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<Integer> squareX = new ArrayList<>();
        List<Integer> squareY = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(reader.readLine());
            Integer x = Integer.parseInt(st.nextToken());
            Integer y = Integer.parseInt(st.nextToken());
            if (!squareX.contains(x)) {
                squareX.add(x);
            } else {
                squareX.remove(x);
            }

            if (!squareY.contains(y)) {
                squareY.add(y);
            } else {
                squareY.remove(y);
            }
        }

        System.out.println(squareX.get(0) + " " + squareY.get(0));
    }
}
