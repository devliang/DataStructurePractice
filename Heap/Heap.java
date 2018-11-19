public class Heap{
  Node[] heapArray;
  int maxSize;
  int currIndex;

  public Heap(int size){
    maxSize = size;
    heapArray = new Node[maxSize];
    currIndex = 0;
  }

  public void insert(int data){
    if(currIndex == maxSize)//full
      return;
    else{
      Node newNode = new Node(data);//create new node
      heapArray[currIndex] = newNode;//insert the node into the heapArray
      trickleUp(currIndex++);//bring to node up if necessary, then increase the index
    }
    
  }

  public void trickleUp(int index){
    int parent = (index -1)/2;
    Node bottom = heapArray[index];//save the newly inserted node as bottom node
    while(index>0 && heapArray[parent].getData() < bottom.getData() ){
      heapArray[index] = heapArray[parent];//move parent node down
      index = parent;//move parent index down
      parent = (parent -1)/2;//update the new parent index
    }
    heapArray[index] = bottom;
  }

  public Node remove(){
    if(currIndex ==0)//node is empty
      return null;
    Node root = heapArray[0];
    heapArray[0]=heapArray[--currIndex];//replace the root with last node, then size -1;
    trickleDown(0);//move down the node down if necessary
    return root;
  }

  public void trickleDown(int index){
    int largeChild;
    Node top = heapArray[index];//save root
    while(index < currIndex/2){//while the node has at least on child
      int leftChild = 2*index+1;
      int rightChild = 2*index+2;
      if(heapArray[leftChild].getData() < heapArray[rightChild].getData())
        largeChild = rightChild;
      else
        largeChild = leftChild;
      
      if(top.getData() >= heapArray[largeChild].getData())
        break;
      heapArray[index]=heapArray[largeChild];
      index = largeChild;
    }
    heapArray[index] = top;//root to index
  }

  public void printHeap(){
    System.out.println("Heap Array: ");
    for(int i =0; i<currIndex; i++){
      if(heapArray[i] != null)
        System.out.println(heapArray[i].getData());
      else
        System.out.print("");
    }
    System.out.println("");
  }
}