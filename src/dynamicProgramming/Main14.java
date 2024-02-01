package dynamicProgramming;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        List<int[]> routes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            routes.add(new int[3]);
            routes.get(i)[0] = Integer.parseInt(st.nextToken());
            routes.get(i)[1] = Integer.parseInt(st.nextToken());
            routes.get(i)[2] = 1;
        }

        routes.sort((o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o1[0] - o2[0];
            }
            return 0;
        });

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (routes.get(i)[1] > routes.get(j)[1]) {
                    routes.get(i)[2] = Math.max(routes.get(i)[2], routes.get(j)[2] + 1);
                }
            }
        }

        int max = 0;
        for (int[] a : routes) {
            max = Math.max(a[2], max);
            System.out.println(max);
        }

        writer.write(N - max + "\n");
        writer.close();
    }
}
