package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main5b {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                int N = Integer.parseInt(reader.readLine());
                StringBuilder sb = new StringBuilder();
                sb.append("-");
                make(N,sb);
                System.out.println(sb);
            } catch (Exception e) {
                break;
            }
        }
    }

    private static void make(int n, StringBuilder sb) {
        if (n > 0) {
            String tmp = sb.toString();
            for (int i = 0; i < tmp.length(); i++) {
                sb.append(" ");
            }
            sb.append(tmp);
            make(--n, sb);
        }
    }
}
