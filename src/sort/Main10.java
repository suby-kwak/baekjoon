package sort;

import java.io.*;
import java.util.*;

public class Main10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        int[] x = new int[N];
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            x[i] = num;
            arr[i] = num;
        }

        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(arr[0], 0);

        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                map.put(arr[i], cnt);
                cnt++;
            }
        }

        for (int i : x) {
            writer.write(map.get(i) + " ");
        }

        writer.close();
        reader.close();
    }
}
