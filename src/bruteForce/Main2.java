package bruteForce;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        for (int i = 1; i < N; i++) {
            String[] split = String.valueOf(i).split("");
            int sum = 0;
            for (String s : split) {
                sum += Integer.parseInt(s);
            }

            if (N == i + sum) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
