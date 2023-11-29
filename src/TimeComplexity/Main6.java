package TimeComplexity;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = ((long) n * (n - 1) * (n - 2)) / 6;
        System.out.println(result);
        System.out.println(3);
    }
}
