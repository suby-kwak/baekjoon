package InOutCalculate;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        while ((A < 2) || (A > 10000)) {
            System.out.println("A 다시 입력");
            A = scanner.nextInt();
        }

        int B = scanner.nextInt();
        while ((B < 2) || (B > 10000)) {
            System.out.println("B 다시 입력");
            B = scanner.nextInt();
        }

        int C = scanner.nextInt();
        while ((C < 2) || (C > 10000)) {
            System.out.println("C 다시 입력");
            C = scanner.nextInt();
        }

        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}
