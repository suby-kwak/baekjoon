package recursion;

import java.io.*;

public class Main3 {
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());
        for (int i = 0; i < T; i++) {
            String str = reader.readLine();
            count = 0;
            writer.write(isPalindrome(str) + " " + count + "\n");
        }
        writer.close();
        reader.close();
    }

    private static int isPalindrome(String str) {
        return recursion(str, 0, str.length() - 1);
    }

    private static int recursion(String str, int l, int r) {
        count++;
        if(l >= r) return 1;
        else if(str.charAt(l) != str.charAt(r)) return 0;
        else return recursion(str, l + 1, r - 1);
    }
}
