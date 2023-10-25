package DFS;

import java.util.List;

public class DFSRecursion {

    public void dfs(List<Vertex> vertices){

        for (Vertex vertex : vertices)
        {
            if(!vertex.isVisited())
            {
                vertex.setVisited(true);
                dfsHelper(vertex);
            }
        }
    }

    private void dfsHelper(Vertex vertex) {

        System.out.println("Recursion " + vertex);

        List<Vertex> neighbors = vertex.getNeighbor();
        for (Vertex neighbor : neighbors)
        {
            if(!neighbor.isVisited())
            {
                neighbor.setVisited(true);
                dfsHelper(neighbor);
            }
        }
    }
}
