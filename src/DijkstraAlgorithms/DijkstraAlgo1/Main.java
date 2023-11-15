package DijkstraAlgorithms.DijkstraAlgo1;

public class Main {
    public static void main(String[] args) {
        int vertices = 5;
        Graph graph = new Graph(vertices);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 2, 1);
        graph.addEdge(2, 4, 4);
        graph.addEdge(3, 1, 3);
        graph.addEdge(3, 2, 9);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 0, 7);
        graph.addEdge(4, 2, 6);

        Dijkstra.dijkstra(graph, 0);
    }
}

