package string;

import java.io.*;
import java.util.StringTokenizer;

public class Main9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        String[] AList = st.nextToken().split("");
        String[] BList = st.nextToken().split("");

        swap(AList);
        swap(BList);

        int A = Integer.parseInt(String.join("", AList));
        int B = Integer.parseInt(String.join("", BList));

        if (A > B) {
            writer.write(A + "\n");
        } else {
            writer.write(B + "\n");
        }

        writer.close();
    }

    public static void swap(String[] list) {
        String temp = list[0];
        list[0] = list[2];
        list[2] = temp;
    }
}
