package string;

import java.io.*;

public class Main11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = reader.readLine();
            if (str == null) {
                break;
            }

            writer.write(str + "\n");
            writer.flush();
        }

        writer.close();
        reader.close();
    }
}
