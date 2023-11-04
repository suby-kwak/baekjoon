package advance;

import java.io.*;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String lan = reader.readLine();
        String[] split = lan.split("");
        int length = split.length;
        int result = 1;
        for (int i = 0; i < length / 2; i++) {
            if (!split[i].equals(split[length - 1 - i])) {
                result = 0;
                break;
            }
        }

        writer.write(result + "\n");
        writer.flush();
        writer.close();
        reader.close();
    }
}
