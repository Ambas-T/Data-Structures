package BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Breadth-First Search
 *
 * We have a G(V,E) graph, and we want to visit all the V vertices - we can do it
 * with BFS
 *
 * The algorithm keeps visiting the nodes and then the neighbors of these nodes
 *
 * O(V+E) running time complexity
 *
 * The memory complexity of this approach is not favorable as we have to store
 * a lot of references
 *
 */
public class BFS {

    public void traverse(VertexBFS root){
        Queue<VertexBFS> queue = new LinkedList<VertexBFS>();

        root.setVisited(true);
        queue.add(root);

        while(!queue.isEmpty())
        {
            VertexBFS actualVertex = queue.remove();

            System.out.println("Actual visit vertex: " + actualVertex);

            for(VertexBFS vertex : actualVertex.getAdjacencyList()) {
                if (!vertex.isVisited())
                {
                    vertex.setVisited(true);
                    queue.add(vertex);
                }
            }
        }
    }
}
