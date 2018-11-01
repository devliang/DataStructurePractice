import java.util.*;

class Main {
  public static void main(String[] args) {
    // BinaryTree bt = new BinaryTree();
    // bt.insert(50);
    // bt.insert(20);
    // bt.insert(80);
    // bt.insert(10);
    // bt.insert(30);
    // bt.insert(60);
    // bt.insert(90);
    // bt.insert(25);
    // bt.insert(85);
    // bt.insert(100);

    // bt.delete(10);//delete the node has no child
    // bt.delete(30);//delete the node has one child
    // bt.delete(80);//delete the node has two children
    // System.out.println(bt.findMax().value);
    // System.out.println(bt.findMin().value);
    // System.out.println(bt.find(100));
    // System.out.println(bt.find(200));
    int height;
    String nodeString;
    int intValue;
    System.out.println("Enter the height of the tree: ");
    Scanner scan = new Scanner(System.in);
    height = scan.nextInt();

    BinaryTree bt = new BinaryTree();

    System.out.println("Enter those node values: ");

    scan = new Scanner(System.in);
    nodeString = scan.nextLine();
    String[] nodeArr = nodeString.split(",");
    for(int i =0; i<nodeArr.length; i++){
      bt.insert(Integer.parseInt(nodeArr[i]));
    }
    System.out.println("The tree is: ");
    bt.printTree(height);
    
    bt.printLeafNode();
  }
}