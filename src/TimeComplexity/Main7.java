package TimeComplexity;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        int fn = a1 * n0 + a0;
        int check = c * n0;

        if (fn <= check) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
