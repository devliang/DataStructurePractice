import java.util.*;

public class BinaryTree{
  Node root;

  public Node find(int key){
    Node curr = root;
    while(curr!=null){
      if(curr.value > key)
        curr = curr.left;//if curr value is larger, then look for key towards left
      else if(curr.value < key)
        curr = curr.right;//curr value is smaller, then look for key towards right
      else{
        return curr;//find the key
      }
    }
    return null;//didn't find key
  }

  public void insert(int value){
    Node newNode = new Node(value);
    if(root == null){
      root = newNode;//if the tree is empty
    }
    else{
      Node curr = root;
      Node parentNode = null;
      while(curr!=null){
        parentNode = curr;
        if(curr.value > value){
          curr = curr.left;//look towards left
          if(curr == null){//if left is empty, direct assign
            parentNode.left = newNode;
            newNode.parent = parentNode;
          }
        }
        else{
          curr = curr.right;
          if(curr == null){
            parentNode.right = newNode;
            newNode.parent = parentNode;
          }
        }
      }
    }
  }

  public void infixOrder(Node curr){
    //left - root - right
    while(curr != null){
      infixOrder(curr.left);
      System.out.print(curr.value + " ");
      infixOrder(curr.right);
    }
  }

  public void preOrder(Node curr){
    //root - left - right
    if(curr == null)
      return;
    if(curr.isLeaf()){
      System.out.println("Leaf Node: " + curr.value + ", Parent Node: " + curr.parent.value + ", Lowest Common Ancestor: " + curr.parent.value);
    }
      preOrder(curr.left);
      preOrder(curr.right);
  }

  public void postOrder(Node curr){
    //left - right - root
    while(curr != null){
      postOrder(curr.left);
      postOrder(curr.right);
      System.out.print(curr.value + " ");
    }
  }

  public Node findMax(){
    Node curr = root;
    Node maxNode = curr;
    while (curr != null){
      maxNode = curr;
      curr = curr.right;
    }
    return maxNode;
  }

  public Node findMin(){
    Node curr = root;
    Node minNode = curr;
    while(curr != null){
      minNode = curr;
      curr = curr.left;
    }
    return minNode;
  }

  public boolean delete(int key){
    Node curr = root;
    Node parent = root;
    boolean isLeft = false;
    //search the delete key, if can't find then return false;
    while(curr.value != key){
      parent = curr;
      if(curr.value > key){
        isLeft = true;
        curr = curr.left;
      }
      else{
        isLeft =false;
        curr = curr.right;
      }
      if(curr == null)
        return false;
    }

    //if the curr node doesn't have a child
    if(curr.left == null && curr.right == null){
      if(curr == root)
        root = null;
      else if(isLeft)
        parent.left = null;
      else
        parent.right = null;
      return true;
    }
    //if the curr node has a right child
    else if(curr.left == null){
      if(curr == root)
        root = curr.right;
      else if(isLeft)
        parent.left = curr.right;
      else
        parent.right = curr.right;
      return true;
    }

    //if the curr node has a left child
    else if(curr.right == null){
      if(curr == root)
        root = curr.left;
      else if(isLeft)
        parent.left = curr.left;
      else
        parent.right = curr.right;
      return true;
    }
    else{
      //if the curr node has two children
      Node successor = getSuccessor(curr);
      if(curr == root)
       successor = root;
      else if(isLeft)
        parent.left = successor;
      else
        parent.right = successor;
    
      successor.left = curr.left;
    }
    return false;
  }

  public Node getSuccessor(Node delNode){
    Node successorParent = delNode;
    Node successor = delNode;
    Node curr = delNode.right;
    while(curr != null){
      successorParent = successor;
      successor = curr;
      curr = curr.left;
    }
    //if successor is not the right node of delNode, then use successor to replace the delNode.
    if(successor != delNode.right){
      successorParent.left = successor.right;
      successor.right = delNode.right;
    }
    return successor;
  }

  public void printTree(int height){
    if(root == null)
      return;
    Queue<Node> q = new LinkedList<Node>();
    Node curr = root;
    q.add(curr);
    int nodeCount = 0;
    int level = 0;

    while(q.size() > 0 && level <= height){
      Node node = q.remove();
      nodeCount ++;

      printSpace(height * (height - level));
      if(node != null){
        System.out.print(node.value);
        printSpace(height);
        q.add(node.left);
        q.add(node.right);
      }
      else{
        System.out.print("*");
      }

      if(nodeCount %2 ==0)
        printSpace(height);

      if(nodeCount == (int)Math.pow(2,level)){
        nodeCount = 0;
        System.out.println("");
        level ++;
      }
    }
  }

  private void printSpace(int number){
    while (number > 0){
      System.out.print(" ");
      number --;
    }
  }

  public void printLeafNode(){
    preOrder(root);
  }
}