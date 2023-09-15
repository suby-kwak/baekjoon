package InOutCalculate;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        while (A < 100 || A > 999) {
            A = scanner.nextInt();
        }

        int B = scanner.nextInt();
        while (B < 100 || B > 999) {
            B = scanner.nextInt();
        }

        System.out.println(A*(B%10));
        System.out.println(A*(B/10%10));
        System.out.println(A*(B/100));
        System.out.println(A*B);
    }
}
