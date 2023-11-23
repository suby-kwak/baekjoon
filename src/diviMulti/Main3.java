package diviMulti;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int n = Integer.parseInt(reader.readLine());
            if (n == -1) {
                break;
            }

            List<Integer> list = new ArrayList<>();
            int sum = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }

            if (sum == n) {
                writer.write(n + " = ");
                for (int i = 0; i < list.size(); i++) {
                    if (i != list.size() - 1) {
                        writer.write(list.get(i) + " + ");
                    } else {
                        writer.write(list.get(i) + "\n");
                    }
                }
            } else {
                writer.write(n + " is NOT perfect.\n");
            }
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}
