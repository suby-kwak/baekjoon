package conditional;

import java.util.*;

public class Main7 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A = scanner.nextInt();
        check(A);
        int B = scanner.nextInt();
        check(B);
        int C = scanner.nextInt();
        check(C);

        List<Integer> dice = new ArrayList<>();
        dice.add(A);
        dice.add(B);
        dice.add(C);

        dice.sort(Comparator.naturalOrder());

        int temp = 0;
        int count = 0;

        for (Integer die : dice) {
            if (temp == die) {
                count++;
            } else {
                if (count == 0) {
                    temp = die;
                }
            }
        }

        if (count == 2) {
            System.out.println(10000 + (temp * 1000));
        } else if (count == 1) {
            System.out.println(1000 + (temp * 100));
        } else {
            System.out.println(temp * 100);
        }
    }

    public static void check(int num) {
        while (num < 1 || num > 6) {
            num = scanner.nextInt();
        }
    }
}
