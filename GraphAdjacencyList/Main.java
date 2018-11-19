import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Vertex a = new Vertex("a");
    Vertex b = new Vertex("b");
    Vertex c = new Vertex("c");
    Vertex d = new Vertex("d");
    Vertex e = new Vertex("e");

    Edge e0 = new Edge(a,b,"AB");
    Edge e1 = new Edge(b,c,"BC");
    Edge e2 = new Edge(c,d,"CD");
    Edge e3 = new Edge(d,e,"DE");

    List<Vertex> vertices = new ArrayList<Vertex>();
    vertices.add(a);
    vertices.add(b);
    vertices.add(c);
    vertices.add(d);
    vertices.add(e);

    List<Edge> edges = new ArrayList<Edge>();
    edges.add(e0);
    edges.add(e1);
    edges.add(e2);
    edges.add(e3);

    Graph g = new Graph(vertices, edges);
    g.printAll();
  }
}