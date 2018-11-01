public class Node{
  int value;
  Node right;
  Node left;
  Node parent;

  public Node(int value){
    this.value = value;
    right = null;
    left = null;
    parent = null;
  }

  public boolean isLeaf(){
    return (right == null && left == null)? true : false;
  }
}
