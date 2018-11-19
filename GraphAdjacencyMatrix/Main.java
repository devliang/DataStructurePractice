class Main {
  public static void main(String[] args) {
    Graph g = new Graph();
    g.addVertex("A");
    g.addVertex("B");
    g.addVertex("C");
    g.addVertex("D");
    g.addVertex("E");

    g.addEdge(0,1);
    g.addEdge(1,2);
    g.addEdge(2,3);
    g.addEdge(3,4);

    System.out.print("DFS Visited: ");
    g.dfs();
    System.out.println();

    System.out.print("BFS Visited: ");
    g.bfs();
    System.out.println();
  }
}