package TopologicalOrdering;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private final List<Vertex> neighbors;

    public Vertex(String name){
        this.name = name;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Vertex vertex){
        this.neighbors.add(vertex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbors() {
        return neighbors;
    }

    @Override
    public String toString() {
        return "Vertex{" + "name='" + name + '\'' + '}';
    }
}
