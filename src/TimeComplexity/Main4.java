package TimeComplexity;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }

        System.out.println(sum);
        System.out.println(2);
    }
}
