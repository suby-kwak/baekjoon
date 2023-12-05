package bruteForce;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ruin = 665;
        int count = 0;

        while (count != N) {
            ruin++;
            if (String.valueOf(ruin).contains("666")) {
                count++;
            }
        }

        System.out.println(ruin);
    }
}
