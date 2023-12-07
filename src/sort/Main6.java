package sort;

import java.io.*;
import java.util.*;

public class Main6 {
    static class Graph {
        int x;
        int y;

        public Graph(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static Comparator<Graph> comp = new Comparator<Graph>() {
        @Override
        public int compare(Graph o1, Graph o2) {
            if (o1.x != o2.x) {
                return o1.x - o2.x;
            } else {
                return o1.y - o2.y;
            }
        }
    };

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        List<Graph> graphs = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graphs.add(new Graph(x, y));
        }

        graphs.sort(comp);
        for (Graph graph : graphs) {
            writer.write(graph.x + " " + graph.y + "\n");
        }
        writer.close();
        reader.close();
    }
}
