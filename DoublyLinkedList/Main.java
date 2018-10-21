class Main {
  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();

    dll.insertFirst(22);
    dll.insertFirst(44);
    dll.insertFirst(66);

    dll.insertLast(11);
    dll.insertLast(33);
    dll.insertLast(55);

    dll.displayForward();
    dll.displayBackward();

    dll.deleteFirst();
    dll.deleteLast();
    dll.deleteKey(11);

    dll.displayForward();

    dll.insertAfter(22,77);
    dll.insertAfter(33,88);

    dll.displayForward();
  }
}