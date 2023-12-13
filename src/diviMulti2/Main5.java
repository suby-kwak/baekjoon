package diviMulti2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(reader.readLine());
        long[] answer = new long[(int) N];
        for (long i = 0; i < N; i++) {
            long num = Long.parseLong(reader.readLine());
            while (!isPrime(num)) {
                num++;
            }
            answer[(int) i] = num;
        }

        for (long l : answer) {
            System.out.println(l);
        }
    }

    private static boolean isPrime(long num) {
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
}
