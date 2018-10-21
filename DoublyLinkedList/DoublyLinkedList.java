public class DoublyLinkedList{
  Node first;
  Node last;

  public DoublyLinkedList(){
    first = null;
    last = null;
  }

  public boolean isEmpty(){
    return (first == null)? true:false;
  }

  public void insertFirst(int value){
    Node newNode = new Node(value);
    if(isEmpty())
      last = newNode;
    else
      first.prev = newNode;
    newNode.next = first;
    first = newNode;
  }

  public void insertLast(int value){
    Node newNode = new Node(value);
    if(isEmpty())
      first = newNode;
    last.next = newNode;
    newNode.prev = last;
    last = newNode;
  }

  public Node deleteFirst(){//assume non-empty list
    Node temp = first;
    if(first.next == null)//only one node
      last = null;
    first.next.prev = null;
    first = first.next;
    return temp;    
  }

  public Node deleteLast(){//assume non-empty list
    Node temp = last;
    if(first.next == null)
      first = null;
    last.prev.next = null;
    last = last.prev;
    return temp;
  }

  public void insertAfter(int key, int data){
    Node curr = first;
    while(curr.value != key){
      curr = curr.next;
      if(curr == null)
        return;
    }

    Node newNode = new Node(data);

    if(curr == last){
      newNode.next = null;
      last = newNode;
    }
    else{
      newNode.next = curr.next;
      curr.next.prev = newNode;
    }

    newNode.prev = curr;
    curr.next = newNode;
  }

  public Node deleteKey(int key){
    Node curr = first;
    while(curr.value != key){
      curr = curr.next;
      if(curr == null)
        return null;
    }
    if(curr == first)
      first = curr.next;
    else
      curr.prev.next = curr.next;

    if(curr == last)
      last = curr.prev;
    else
      curr.next.prev = curr.prev;
    return curr;
  }

  public void displayForward(){
    Node curr = first;
    while(curr.next != null){
      System.out.print(curr.value + "->");
      curr = curr.next;
    }
    System.out.print(curr.value);
    System.out.println("");
  }

  public void displayBackward(){
    Node curr = last;
    while(curr.prev != null){
      System.out.print(curr.value + "<-");
      curr = curr.prev;
    }
    System.out.print(curr.value);
    System.out.println("");
  }
}