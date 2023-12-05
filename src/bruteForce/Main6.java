package bruteForce;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = N / 5;
        while (i != -1) {
            int count = i;
            int copyN = N;
            copyN -= i * 5;
            if (copyN % 3 == 0) {
                count += copyN / 3;
                System.out.println(count);
                break;
            }
            i--;
        }

        if (i == -1) {
            System.out.println(-1);
        }
    }
}
