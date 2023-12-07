package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String[] split = N.split("");
        Arrays.sort(split, Comparator.reverseOrder());
        for (String i : split) {
            System.out.print(i);
        }
    }
}
