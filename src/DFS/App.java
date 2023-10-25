package DFS;

import BFS.VertexBFS;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");

        List<Vertex> list = new ArrayList<>();

        a.addNeighbor(b);
        a.addNeighbor(c);
        c.addNeighbor(d);
        d.addNeighbor(e);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        DFS dfs = new DFS();
        DFSRecursion dfsRecursion = new DFSRecursion();
        dfs.dfs(list);
        dfsRecursion.dfs(list);

    }
}
