package BellmanFordAlgorithms.BellmanFordAlgo1;

import java.util.List;

public class BellmanFordAlgorithm {

    private List<Vertex> vertexList;
    private List<Edge> edgeList;

    public BellmanFordAlgorithm(List<Vertex> vertexList, List<Edge> edgeList) {
        this.vertexList = vertexList;
        this.edgeList = edgeList;
    }

    public void run(Vertex source){
        source.setDistance(0);

        for(int i = 0; i < vertexList.size() - 1; i++)
        {
            for(Edge edge : edgeList)
            {
                Vertex u = edge.getStartVertex();
                Vertex v = edge.getTargetVertex();

                //Relaxation
                if(u.getDistance() + edge.getWeight() < v.getDistance())
                {
                    v.setDistance(u.getDistance() + edge.getWeight());
                    v.setPredecessors(u);
                }
            }
        }

        // if there are negative cycle
        for(Edge edge : edgeList)
        {
            if(edge.getStartVertex().getDistance() != Double.MAX_VALUE)
            {
                if(hasCycle(edge))
                {
                    System.out.println("There is a negative cycle...");
                    return;
                }
            }
        }
    }

    private boolean hasCycle(Edge edge) {
        return edge.getStartVertex().getDistance() + edge.getWeight() < edge.getTargetVertex().getDistance();
    }

    public void shortestPathTo(Vertex vertex) {

        if(vertex.getDistance() == Double.MAX_VALUE) {
            System.out.println("There is no path from source to the given vertex...");
            return;
        }

        Vertex actual = vertex;

        while(actual != null) {
            System.out.println(actual);
            actual = actual.getPredecessors();
        }
    }
}
