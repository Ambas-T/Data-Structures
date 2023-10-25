package BFS;

public class App {

    public static void main(String[] args) {
        BFS bfs = new BFS();

        VertexBFS a = new VertexBFS("A");
        VertexBFS b = new VertexBFS("B");
        VertexBFS c = new VertexBFS("C");
        VertexBFS d = new VertexBFS("D");
        VertexBFS e = new VertexBFS("E");
        VertexBFS f = new VertexBFS("F");
        VertexBFS g = new VertexBFS("G");
        VertexBFS h = new VertexBFS("H");

        a.addNeighbor(b);
        a.addNeighbor(f);
        a.addNeighbor(g);

        b.addNeighbor(a);
        b.addNeighbor(c);
        b.addNeighbor(d);

        c.addNeighbor(b);

        d.addNeighbor(b);
        d.addNeighbor(e);

        g.addNeighbor(a);
        g.addNeighbor(h);

        h.addNeighbor(g);

        bfs.traverse(a);
    }
}

/**
 * Breadth First Search
 * - Pathfinding algorithms
 * - Maximum flow
 * - Garbage collections
 * - Serialization
 */
