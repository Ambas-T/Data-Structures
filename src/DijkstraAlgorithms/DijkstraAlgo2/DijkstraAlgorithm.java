package DijkstraAlgorithms.DijkstraAlgo2;

import java.util.*;

public class DijkstraAlgorithm {

    public void computePath(Vertex source){

        source.setDistance(0);

        PriorityQueue<Vertex> queue = new PriorityQueue<>();
        queue.add(source);

        while(!queue.isEmpty())
        {
            Vertex actualVertex = queue.poll();

            // Skip processing a vertex if it has already been visited with a shorter path
            if (actualVertex.getDistance() == Double.MAX_VALUE) {
                break;
            }

            for(Edge edge : actualVertex.getAdjacencyList())
            {
                Vertex v = edge.getTargetVertex();

                double d = actualVertex.getDistance() + edge.getWeight();

                if( d < v.getDistance())
                {
                    v.setDistance(d);
                    v.setPredecessor(actualVertex);
                    queue.add(v);
                }
            }
        }
    }

    public List<Vertex> getShortestPathTo(Vertex targetVertex){

        List<Vertex> path = new ArrayList<>();

        for(Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor())
            path.add(vertex);

        Collections.reverse(path);

        return path;
    }
}