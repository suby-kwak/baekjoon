package advance2;

import java.io.*;
import java.util.*;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        writer.write(average(numbers) + "\n");
        writer.write(mid(numbers) + "\n");
        writer.write(count(numbers) + "\n");
        writer.write(range(numbers) + "\n");
        writer.close();
        reader.close();
    }

    private static int average(int[] numbers) {
        OptionalDouble average = Arrays.stream(numbers).average();
        double v = average.orElseThrow();
        if (v > 0) {
            if (v % 1 >= 0.5) {
                return (int) v + 1;
            } else {
                return (int) v;
            }
        } else {
            double abs = Math.abs(v);
            if (abs % 1 >= 0.5) {
                return (int) v - 1;
            } else {
                return (int) v;
            }
        }
    }

    private static int mid(int[] numbers) {
        int size = numbers.length;
        Arrays.sort(numbers);

        return numbers[size / 2];
    }

    private static int count(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            if (!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
            }
        }

        List<Integer> chk = new ArrayList<>();
        int max = 0;
        for (int k : map.keySet()) {
            if (max < map.get(k)) {
                chk.clear();
                max = map.get(k);
                chk.add(k);
            } else if (max == map.get(k)) {
                chk.add(k);
            }
        }

        if (chk.size() == 1) {
            return chk.get(0);
        } else {
            chk.sort(Comparator.naturalOrder());
            return chk.get(1);
        }
    }

    private static int range(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : numbers) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        return max - min;
    }
}
