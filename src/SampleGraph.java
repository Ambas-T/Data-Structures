/**
 *
 * Undirected Graph
 * Directed Graph
 * Forest Graph
 * Directed Acyclic graph (DAG)
 * Completed graph
 *
 * Graph Representation
 *      1. Adjacency list representation
 *          We assign a data structure (array) to every single vertex (node) in the
 *          graph that stores the edges accordingly
 *          A : [(4,C), (3, B)
 *          B : [(3,D]
 *
 *          Advatnage: Space efficient
 *                     Iterating over all the edges is efficient
 *          Disadvantage: inefficient with dense ones
 *                        Edge weight lookup is slow O(E) because we have to find it in linear time.
 *
 *
 *      2. Adjacency matrix representation
 *          Let's assuem we have a G(V,E) graph with V vertices (nodes) and E edges (links)
 *          We can construct an M matrix with size VxV where M[i][j] represents the edge weight of
 *          going from node i to node j
 *
 *          Advantage : Space efficient with dense graphs but it requires O(V^2)
 *                      Edge weight lookup is O(1)
 *
 *          Disadvantage : Iterating over all edges takes O(E^2)
 *
 *
 *
 */

public class SampleGraph {
    private static int[][] adjacencyMatric = {
            {0,2,4,0},
            {0,0,0,3},
            {0,0,0,0},
            {0,0,0,0}
    };

    public static void main(String[] args) {
        for (int i=0; i<adjacencyMatric.length; i++)
        {
            for(int j=0; j<adjacencyMatric.length; j++)
            {
                System.out.println("Edge with weight: " + adjacencyMatric[i][j]);
            }
        }

        System.out.println(adjacencyMatric[0][2]);

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");

        a.addNeighbor(b);
        a.addNeighbor(c);
        b.addNeighbor(d);

        a.showNeighbor();
        b.showNeighbor();
        c.showNeighbor();
        d.showNeighbor();
    }
}





































