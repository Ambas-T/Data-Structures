package BellmanFordAlgorithms.BellmanFordAlgo1;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private double distance;
    private List<Edge> adjacentList;
    private Vertex predecessors;

    public Vertex(String name) {
        this.name = name;
        this.distance = Double.MAX_VALUE;
        this.adjacentList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public List<Edge> getAdjacentList() {
        return adjacentList;
    }

    public void addNeighbor(Edge edge) {
        this.adjacentList.add(edge);
    }

    public Vertex getPredecessors() {
        return predecessors;
    }

    public void setPredecessors(Vertex predecessors) {
        this.predecessors = predecessors;
    }

    @Override
    public String toString() {
        return name + '-' + distance;
    }
}
