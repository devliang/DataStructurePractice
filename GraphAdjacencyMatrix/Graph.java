public class Graph{
  public static final int SIZE = 20;
  Vertex[] vertexList;//list of vertex
  int adjMat[][];//adjacency matrix
  int nVerts;//curr number of vertices
  Stack st;
  Queue q;

  public Graph(){//constructor
    vertexList = new Vertex[SIZE];
    adjMat = new int[SIZE][SIZE];
    nVerts = 0;
    for(int i=0; i<SIZE; i++){//initialize two dimensional array
      for(int j=0; j<SIZE; j++){
        adjMat[i][j] = 0;
      }
    }
    st = new Stack();
    q = new Queue();
  }

  public void addVertex(String name){
    Vertex newVert = new Vertex(name);//create a new vertex;
    vertexList[nVerts++] = newVert;
  }

  public void addEdge(int start, int end){
    adjMat[start][end]= 1;
    adjMat[end][start] = 1;
  }

  public void printVertex(int v){
    System.out.print(vertexList[v].name);
  }

  public void dfs(){
    vertexList[0].isVisited = true;
    printVertex(0);
    st.push(0);

    while(!st.isEmpty()){
      int v = getAdjUnvisitedVert(st.peek());
      if(v == -1){//if no such vertex
        st.pop();
      }
      else{
        vertexList[v].isVisited = true;
        printVertex(v);
        st.push(v);
      }
    }

    for(int i=0; i<nVerts; i++){//reset current number of vertex
      vertexList[i].isVisited = false;
    }
  }

  public void bfs(){
    vertexList[0].isVisited = true;
    printVertex(0);
    q.enqueue(0);
    int v2;

    while(!q.isEmpty()){
      int v1 = q.dequeue();
      while((v2=getAdjUnvisitedVert(v1)) != -1){
        vertexList[v2].isVisited = true;
        printVertex(v2);
        q.enqueue(v2);
      }
    }

    for(int i=0; i<nVerts; i++){//reset current number of vertex
      vertexList[i].isVisited = false;
    }
  }
  
  public int getAdjUnvisitedVert(int v){
    for(int j=0; j<nVerts; j++){
      if(adjMat[v][j] == 1 && vertexList[j].isVisited == false)
        return j;
    }
    return -1;
  }
}