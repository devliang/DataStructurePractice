class Main {
  public static void main(String[] args) {
    LinkedList ll = new LinkedList();

    ll.insertFront(11);
    ll.insertFront(22);
    ll.insertFront(33);
    ll.insertBack(44);
    ll.insertBack(55);
    ll.printAll();

    ll.removeFront();
    ll.removeBack();
    ll.insertBack(66);
    ll.printAll();

    ll.deleteNode(ll.getNode(11));
    ll.printAll();

    ll.removeAt(1);
    ll.printAll();

    ll.replaceNode(0, 77);
    ll.printAll();
  }
}