public class Vertex{
  String name;
  boolean isVisited;

  public Vertex(String name){
    this.name = name;
    isVisited = false;
  }

  public String getName(){
    return name;
  }

  public boolean isVisited(){
    return isVisited;
  }
}