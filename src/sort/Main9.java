package sort;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main9 {
    static class Profile {
        String name;
        int age;

        public Profile(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        List<Profile> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new Profile(name, age));
        }

        list.sort((a,b)->{
            if (a.age != b.age) {
                return a.age - b.age;
            }
            return 0;
        });

        for (Profile profile : list) {
            writer.write(profile.age + " " + profile.name + "\n");
        }
        writer.close();
        reader.close();
    }
}
