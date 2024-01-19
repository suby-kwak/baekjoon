package dynamicProgramming;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main7 {
    static List<List<Integer>> triangle = new ArrayList<>();
    static List<List<Integer>> maxSum = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            triangle.add(new ArrayList<>());
            for (int j = 0; j < i + 1; j++) {
                int num = Integer.parseInt(st.nextToken());
                triangle.get(i).add(num);
            }
        }

        maxSum.add(new ArrayList<>());
        maxSum.get(0).add(triangle.get(0).get(0));

        for (int i = 1; i < n; i++) {
            maxSum.add(new ArrayList<>());
            for (int j = 0; j < i + 1; j++) {
                int max = 0;
                if (j == 0) {
                    max = maxSum.get(i - 1).get(0) + triangle.get(i).get(j);
                } else if (j == i) {
                    max = maxSum.get(i - 1).get(j - 1) + triangle.get(i).get(j);
                } else {
                    max = Math.max(maxSum.get(i - 1).get(j - 1) + triangle.get(i).get(j), maxSum.get(i - 1).get(j) + triangle.get(i).get(j));
                }
                maxSum.get(i).add(max);
            }
        }

        int last = maxSum.get(n - 1).size() - 1;
        maxSum.get(n - 1).sort(Comparator.naturalOrder());
        writer.write(maxSum.get(n - 1).get(last) + "\n");
        writer.close();
    }
}
