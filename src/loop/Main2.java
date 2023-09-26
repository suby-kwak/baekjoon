package loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            while (A <= 0) {
                A = scanner.nextInt();
            }

            int B = scanner.nextInt();
            while (B >= 10) {
                B = scanner.nextInt();
            }

            result.add(A + B);
        }

        for (Integer integer : result) {
            System.out.println(integer);
        }

    }
}
