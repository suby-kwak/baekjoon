package loop;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 0;

        while (n < 1 || n > 10000) {
            n = scanner.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            result += i;
        }

        System.out.println(result);
    }
}
