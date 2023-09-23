package conditional;

import java.util.Scanner;

public class Main6 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int A = scanner.nextInt();
        while (A < 0 || A > 23) {
            System.out.println("시를 다시 입력하세요");
            A = scanner.nextInt();
        }

        int B = scanner.nextInt();
        while (B < 0 || B > 59) {
            System.out.println("분을 다시 입력하세요");
            B = scanner.nextInt();
        }

        int C = scanner.nextInt();
        while (C < 0 || C > 1000) {
            System.out.println("예약시간을 다시 입력하세요");
            C = scanner.nextInt();
        }

        int temp = C / 60;

        if (!(temp == 0)) {
            A += temp;
            B += C % 60;

            if (B >= 60) {
                B -= 60;
                A += 1;
            }

            if (A >= 24) {
                A = A - 24;
            }
        } else {
            B += C;
            if (B >= 60) {
                B -= 60;
                A += 1;
                if (A >= 24) {
                    A = 0;
                }
            }
        }

        System.out.println(A + " " + B);
    }
}
