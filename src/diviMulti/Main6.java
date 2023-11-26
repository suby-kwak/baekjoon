package diviMulti;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                N /= i;
                System.out.println(i);
            }
            if (N == 1) {
                break;
            }
        }
    }
}
