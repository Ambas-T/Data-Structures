package MazeEscape;

public class MazeSolver {

    private final int[][] maze;
    private final boolean[][] visited;
    private final int startRow;
    private final int startCol;

    public MazeSolver(int[][] maze, int startRow, int startCol) {
        this.maze = maze;
        this.visited = new boolean[maze.length][maze.length];
        this.startCol = startCol;
        this.startRow = startRow;
    }

    public void findWay(){
        if(dfs(startRow, startCol))
        {
            System.out.println("Solution exists...");
        }else
        {
            System.out.println("No Solution exists.");
        }
    }

    private boolean isFeasible(int x, int y){
        if(x < 0 || x > maze.length - 1) return false;
        if(y < 0 || y > maze.length - 1) return false;
        if(visited[x][y]) return false;
        return maze[x][y] != 1;
    }

    private boolean dfs(int x, int y) {

        if(x == maze.length - 1 && y == maze.length - 1) return true;

        if(isFeasible(x,y))
        {
            visited[x][y] = true;
            if(dfs(x+1, y)) return true;
            if(dfs(x-1, y)) return true;
            if(dfs(x, y+1)) return true;
            if(dfs(x, y+1)) return true;

            //BACKTRACK
            visited[x][y] = false;
            return false;
        }
        return false;
    }
}
