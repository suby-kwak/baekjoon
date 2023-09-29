package loop;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        while ((N < 4 || N > 1000) || !(N % 4 == 0)) {
            N = scanner.nextInt();
        }

        for (int i = 0; i < N / 4; i++) {
            System.out.print("long ");
        }

        System.out.println("int");
    }
}
