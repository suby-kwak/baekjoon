package diviMulti2;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] trees = new int[N];
        for (int i = 0; i < N; i++) {
            trees[i] = sc.nextInt();
        }

        int gcd = 0;
        for (int i = 0; i < N - 1; i++) {
            int distance = trees[i + 1] - trees[i];
            gcd = gcd(distance, gcd);
        }

        int Len = trees[N - 1] - trees[0];

        System.out.println(Len / gcd + 1 - N);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int rest = a % b;
            a = b;
            b = rest;
        }
        return a;
    }
}
