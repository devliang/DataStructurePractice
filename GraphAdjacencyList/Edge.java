public class Edge{

  String edgeName;
  Vertex from;
  Vertex to;

  public Edge(Vertex from, Vertex to, String edgeName){
    this.edgeName = edgeName;
    this.from = from;
    this.to = to;
  }
}