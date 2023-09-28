package loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int X = scanner.nextInt();
        check(X, 1000000000);

        int N = scanner.nextInt();
        check(N, 100);

        List<Integer> aList = new ArrayList<>();

        int result = 0;

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            check(a, 1000000);
            int b = scanner.nextInt();
            check(b, 10);
            aList.add(a * b);
        }

        for (Integer integer : aList) {
            result += integer;
        }

        if (X == result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static void check(int num, int limit) {
        while (num < 1 || num > limit) {
            num = scanner.nextInt();
        }
    }
}
