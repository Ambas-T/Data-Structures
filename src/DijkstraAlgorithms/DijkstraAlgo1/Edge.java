package DijkstraAlgorithms.DijkstraAlgo1;

import java.util.*;

class Edge {
    int vertex;
    int weight;

    Edge(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }
}

class Graph {
    private final List<List<Edge>> adjList;

    Graph(int vertices) {
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dest, int weight) {
        adjList.get(src).add(new Edge(dest, weight));
    }

    List<List<Edge>> getAdjList() {
        return adjList;
    }
}
