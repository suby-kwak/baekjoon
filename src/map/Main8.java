package map;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Set<String> set = new HashSet<>();

        for (int i = 1; i <= str.length(); i++) {
            int point = 0;
            while ((point + i) <= str.length()) {

                String substring = str.substring(point, point + i);
                set.add(substring);
                point++;
            }
        }

        System.out.println(set.size());
    }
}
