package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int average = sum / 5;

        int[] array = Arrays.stream(arr).sorted().toArray();

        System.out.println(average);
        System.out.println(array[2]);
    }
}
