import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        while (A < 0) {
            System.out.println("A를 다시 입력하시오");
            A = scanner.nextInt();
        }

        int B = scanner.nextInt();
        while (B > 10) {
            System.out.println("B를 다시 입력하시오");
            B = scanner.nextInt();
        }

        System.out.println((double) A / B);
    }
}
