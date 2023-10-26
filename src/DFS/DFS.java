package DFS;

import java.util.List;
import java.util.Stack;

/**
 *
 * Depth-First Search
 *
 */
public class DFS {

    private final Stack<Vertex> stack;

    public DFS(){
        this.stack = new Stack<>();
    }

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

    private void dfsHelper(Vertex rootVertex) {

        stack.push(rootVertex);
        rootVertex.setVisited(true);

        while(!stack.isEmpty())
        {
            Vertex actualVertex = stack.pop();
            
            System.out.println(actualVertex);

            List<Vertex> neighbors = actualVertex.getNeighbor();
            for (Vertex neighbor : neighbors)
            {
                if(!neighbor.isVisited())
                {
                    neighbor.setVisited(true);
                    stack.push(neighbor);
                }
            }
        }
    }
}
