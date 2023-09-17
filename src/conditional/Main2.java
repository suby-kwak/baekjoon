package conditional;

import java.util.Scanner;

public class Main2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = scanner.nextInt();
        check(num);

        if (num >= 90) {
            System.out.println("A");
        } else if (num >= 80) {
            System.out.println("B");
        } else if (num >= 70) {
            System.out.println("C");
        } else if (num >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public static void check(int num) {
        if (num < 0 || num > 100) {
            num = scanner.nextInt();
        }
    }
}
