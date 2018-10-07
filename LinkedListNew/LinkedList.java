public class LinkedList{
  Node head;
  int size;

  public LinkedList(){
    head = null;
    size = 0;
  }

  public void insertFront(int value){
    Node n = new Node(value);
    if(head == null){
      head = n;
    }
    else{
      n.next = head;
      head = n;
    }
    size ++;
  }

  public void insertBack(int value){
    Node newNode = new Node(value);
    if(head == null){
      head = newNode;
    }
    else{
      Node curr = head;
      while(curr.next != null){//to find the last node
        curr = curr.next;
      }
      curr.next = newNode;
    }
    size++;
  }

  public Node removeFront(){
    if(head == null)
      return null;
    Node temp = head;
    head = head.next;
    size --;
    return temp;
  }

  public Node removeBack(){
    if(head == null)
      return null;
    if(head.next == null){//only one node -> head node
      Node temp = head;
      head = null;
      return temp;
    }
    Node curr = head;
    Node prev = head;
    while(curr.next != null){//to find the last node
      prev = curr;
      curr = curr.next;
    }
    prev.next = null;
    size--;
    return curr;
  }

  public Node removeAt(int index){
    if(head == null || index < 0 || index >= size)
      return null;
    if(index ==0){
      Node temp = head;
      head = head.next;
      size--;
      return temp;
    }
    Node curr = head;
    Node prev = head;
    for(int i=0; i<index && curr.next != null; i++){
      prev = curr;
      curr = curr.next;
    }
    prev.next = curr.next;
    size --;
    return curr;
  }

  public Node replaceNode(int index, int value){
    if(head == null || index <0 || index >= size)
      return null;
    Node newNode = new Node(value);
    if(index ==0){
      Node temp = head;
      newNode.next = head.next;
      head = newNode;
      return temp;
    }
    Node curr = head;
    Node prev = head;
    for(int i =0; i < index && curr.next != null; i++){
      prev = curr;
      curr = curr.next;
    }
    Node temp = curr;
    newNode.next = curr.next;
    prev.next = newNode;
    return temp;
  }

  public Node getNode(int value){
    if(head == null)
      return null;
    else{
      Node curr = head;
      while(curr.next != null){
        if(curr.value == value)
          break;
        curr = curr.next;
      }
      return (curr.value == value)? curr: null;
    }
  }

  public void deleteNode(Node curr){
    // Node temp = n.next;
    // n.value = temp.value;
    // n.next = temp.next;
    // temp = null;
    curr.value = curr.next.value;
    curr.next = curr.next.next;
  }

  public void printAll(){
    if(head == null) return;
    else{
      Node curr = head;
      while(curr.next != null){
        System.out.print(curr.value + "->");
        curr = curr.next;
      }
      System.out.println(curr.value);
    }
  }
  
}