import java.util.*;

public class Graph{
  
  List<Vertex> vertices;
  List<Edge> edges;

  public Graph(List<Vertex> vertices, List<Edge> edges){
    this.vertices = vertices;
    this.edges = edges;
  }

  public void printAll(){
    for(Vertex v : vertices){
      System.out.print(v.getName());
    }
  }

  // public void insertVertex(Vertex v){

  // }

  // public void insertEdge(Vertex from, Vertex to, String edgeName){

  // }
  
  // public void removeVertex(Vertex v){

  // }

  // public void removeEdge(Edge e){

  // }

  public Collection<Edge> incomingEdges(Vertex v){
    return null;
  }

  public Collection<Edge> outgoingEdges(Vertex v){
    Set<Edge> s = new HashSet<Edge>();
    for(Edge e : edges){
      if(e.from == v)
        s.add(e);
    }
    return s;
  }

  public void breadFirstSearch(Vertex v){
    Queue<Vertex> q = new LinkedList<Vertex>();

    q.add(v);

    while(q.size()>1){
      Collection<Edge> outgoingEdges = outgoingEdges(v);
      Vertex u = q.remove();
      System.out.println(u.name);
      q.add(v);
    }
  }
}