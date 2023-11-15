package DijkstraAlgorithms.DijkstraAlgo1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Dijkstra {
    public static void dijkstra(Graph graph, int source) {
        int vertices = graph.getAdjList().size();
        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        pq.add(new Edge(source, 0));

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int vertex = current.vertex;

            for (Edge edge : graph.getAdjList().get(vertex)) {
                int adjacent = edge.vertex;
                int weight = edge.weight;

                if (distances[adjacent] > distances[vertex] + weight) {
                    distances[adjacent] = distances[vertex] + weight;
                    pq.add(new Edge(adjacent, distances[adjacent]));
                }
            }
        }

        printSolution(distances);
    }

    private static void printSolution(int[] distances) {
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < distances.length; i++) {
            System.out.println(i + "\t\t" + distances[i]);
        }
    }
}

