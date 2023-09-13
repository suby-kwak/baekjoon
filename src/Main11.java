import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        while (A < 1L || A > 1000000000000L) {
            System.out.println("다시");
            A = scanner.nextLong();
        }

        long B = scanner.nextLong();
        while (B < 1L || B > 1000000000000L) {
            System.out.println("다시");
            B = scanner.nextLong();
        }

        long C = scanner.nextLong();
        while (C < 1L || C > 1000000000000L) {
            System.out.println("다시");
            C = scanner.nextLong();
        }

        System.out.println(A + B + C);
    }
}
