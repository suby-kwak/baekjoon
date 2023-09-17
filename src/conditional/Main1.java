package conditional;

import java.util.Scanner;

public class Main1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A = scanner.nextInt();
        check(A);
        int B = scanner.nextInt();
        check(B);

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

    }

    public static void check(int num) {
        if (num < -10000 || num > 100000) {
            num = scanner.nextInt();
        }
    }
}
