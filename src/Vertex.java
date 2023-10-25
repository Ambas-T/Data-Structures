import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private List<Vertex> adjacencyList;

    public Vertex(String name) {
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public void addNeighbor(Vertex vertex){
        adjacencyList.add(vertex);
    }

    public void showNeighbor(){
        for (Vertex v : adjacencyList)
        {
            System.out.println(v);
        }
    }

    @Override
    public String toString(){
        return name;
    }
}
/**
 *          Graph Applications
 *
 * 1. Shortest path algorithms
*      Dijkstra's shortest path
 *
 * 2. Google's page rank algorithm
 *      BFS
 *
 * 3. Software engineering
 *      Software project management tools like Maven and Gradle
 *
 * 4. Optimization problems
 *      Quadratic optimization
 *
 *
 *
 */
