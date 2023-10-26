package DFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private final String name;
    private boolean visited;
    private final List<Vertex> adjacencyList;

    public Vertex(String name){
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void addNeighbor(Vertex v){
        this.adjacencyList.add(v);
    }

    public List<Vertex> getNeighbor(){
        return this.adjacencyList;
    }

    @Override
    public String toString() {
        return "Vertex{" + "name='" + name + '\'' + '}';
    }
}
