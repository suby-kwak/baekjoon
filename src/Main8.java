import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();

        if (y < 999 || y > 3001) {
            System.out.println("1000 이상 3000 이하의 수를 입력하시오.");
            y = scanner.nextInt();
        }

        System.out.println(y - 543);
    }
}
