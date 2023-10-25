package BFS;

import java.util.ArrayList;
import java.util.List;

public class VertexBFS {

    private String name;
    private boolean visited;
    private List<VertexBFS> adjacencyList;

    public VertexBFS(String name){
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<VertexBFS> getAdjacencyList() {
        return adjacencyList;
    }

    public void addNeighbor(VertexBFS vertex) {
        this.adjacencyList.add(vertex);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
