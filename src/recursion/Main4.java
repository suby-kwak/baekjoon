package recursion;

import java.io.*;
import java.util.StringTokenizer;

public class Main4 {
    static int count = 0, answer = -1, N, K;
    static int[] tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        tmp = new int[N];
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(arr, 0, N - 1);
        writer.write(answer + "\n");
        writer.close();
        reader.close();
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (count < K) {
            if (l < r) {
                int q = (l + r) / 2;
                mergeSort(arr, l, q);
                mergeSort(arr, q + 1, r);
                merge(arr, l, q, r);
            }
        }
    }

    private static void merge(int[] arr, int l, int q, int r) {
        if (count < K) {
            int i = l, j = q + 1, t = 0;
            while (i <= q && j <= r) {
                if (arr[i] <= arr[j]) {
                    tmp[t++] = arr[i++];
                } else {
                    tmp[t++] = arr[j++];
                }
            }

            while (i <= q) {
                tmp[t++] = arr[i++];
            }
            while (j <= r) {
                tmp[t++] = arr[j++];
            }
            i = l;
            t = 0;
            while (i <= r) {
                count++;
                if (count == K) {
                    answer = tmp[t];
                    break;
                }
                arr[i++] = tmp[t++];
            }
        }
    }
}
