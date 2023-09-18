package conditional;

import java.util.Scanner;

public class Main3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int year = scanner.nextInt();
        check(year);

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }

    public static void check(int num) {
        if (num < 0 || num > 4000) {
            num = scanner.nextInt();
        }
    }
}
