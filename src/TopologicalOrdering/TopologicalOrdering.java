package TopologicalOrdering;

import java.util.Stack;

/**
 * Topological ordering
 *
 * The depth-first search based algorithm was first constructed by
 * Robert Tarjan back in 1976
 *
 * Topological ordering (topological sort) of a G(V, E) directed graph is a linear ordering
 * of its vertices such that for every directed (u,v) edge u comes before v in the ordering
 *
 * The V vertices of the G(V,E) graph may represent tasks to be performed and that edges are
 * the constraints (one task may be performed before another)
 *
 * Crucial that we have to use directed graphs for topological ordering
 *
 */
public class TopologicalOrdering {

    private final Stack<Vertex> stack;

    public TopologicalOrdering(){
        this.stack = new Stack<>();
    }

    public void dfs(Vertex vertex) {

        vertex.setVisited(true);

        for(Vertex v : vertex.getNeighbors())
        {
            if(!v.isVisited())
            {
                dfs(v);
            }
        }

        stack.push(vertex);
    }

    public Stack<Vertex> getStack() {
        return this.stack;
    }
}
