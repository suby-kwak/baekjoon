package conditional;

import java.util.Scanner;

public class Main5 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int H = scanner.nextInt();
        if (H < 0 || H > 23) {
            H = scanner.nextInt();
        }

        int M = scanner.nextInt();
        if (M < 0 || M > 59) {
            M = scanner.nextInt();
        }

        M = M - 45;
        if (M < 0) {
            M = 60 + M;
            H = H - 1;
            if (H < 0) {
                H = 24 + H;
            }
        }

        System.out.println(H + " " + M);
    }
}
