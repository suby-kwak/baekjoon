package diviMulti2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main8 {
    static List<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());
        int[] answer = new int[T];
        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(reader.readLine());
            list = new ArrayList<>();
            isPrime2(num);
            int cnt = 0;
            for (int prime : list) {
                if (isPrime(num - prime)) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }

        for (int i : answer) {
            writer.write(i + "\n");
        }
        writer.close();
        reader.close();
    }

    private static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        } else if (num > 2) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static void isPrime2(int num) {
        boolean[] chk = new boolean[num / 2 + 1];
        chk[0] = chk[1] = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(chk[i]) continue;
            for (int j = i * i; j < chk.length; j += i) {
                chk[j] = true;
            }
        }

        for (int i = 0; i < chk.length; i++) {
            if(!chk[i]) list.add(i);
        }
    }
}
