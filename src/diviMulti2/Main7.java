package diviMulti2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        List<Integer> answer = new ArrayList<>();
        while (n != 0) {
            n = sc.nextInt();
            int cnt = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime(i)) {
                    cnt++;
                }
            }
            if (n != 0) {
                answer.add(cnt);
            }
        }

        for (int i : answer) {
            System.out.println(i);
        }
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
}
