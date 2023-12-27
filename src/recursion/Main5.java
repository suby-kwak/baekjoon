package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main5 {
    static String[] str;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                int N = Integer.parseInt(reader.readLine());
                str = new String[(int) Math.pow(3, N)];
                for (int i = 0; i < str.length; i++) {
                    str[i] = "-";
                }
                Cantor(str, 0, str.length - 1);
                for (String s : str) {
                    System.out.print(s);
                }
                System.out.println();
            } catch (Exception e) {
                break;
            }
        }
    }

    private static void Cantor(String[] str, int l, int r) {
        if (l != r) {
            int point = (r - l + 1) / 3;
            for (int i = l + point; i < l + (2 * point); i++) {   // 가운데 삭제
                str[i] = " ";
            }
            Cantor(str, l, l + point - 1);  // 좌측 재귀
            Cantor(str, l + (2 * point), r);  // 우측 재귀
        }
    }
}
