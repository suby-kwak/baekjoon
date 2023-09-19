package conditional;

import java.util.Scanner;

public class Main4 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x = scanner.nextInt();
        check(x);
        int y = scanner.nextInt();
        check(y);

        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }

    public static void check(int num) {

        if (num < -1000 || num > 1000) {
            num = scanner.nextInt();
            if (num == 0) {
                num = scanner.nextInt();
            }
        }
    }
}
