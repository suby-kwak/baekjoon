package diviMulti2;

import java.io.*;
import java.util.*;

public class Main8 {
    static Set<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());
        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<T; i++) {
            int num = Integer.parseInt(reader.readLine());
            int cnt = 0;
            list = new HashSet<>();
            Set<Integer> repeat = new HashSet<>();
            isPrime(num);
            for (int prime : list) {
                if(!repeat.contains(prime)) {
                    if (list.contains(num - prime)) {
                        cnt++;
                        repeat.add(num - prime);
                    }
                }
            }
            answer.add(cnt);
        }

        for (int cnt : answer) {
            writer.write(cnt + "\n");
        }
        writer.close();
        reader.close();
    }

    private static void isPrime(int num) {
        if (num < 2) {
            return;
        }

        boolean[] chk = new boolean[num + 1];
        chk[0] = chk[1] = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (chk[i]) {
                continue;
            }
            for (int j = i * i; j < chk.length; j += i) {
                chk[j] = true;
            }
        }

        for (int i = 0; i < chk.length; i++) {
            if(!chk[i]) list.add(i);
        }


    }
}
