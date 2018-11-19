class Main {
  public static void main(String[] args) {
    Heap he = new Heap(10);

    he.insert(70);
    he.insert(40);
    he.insert(50);
    he.insert(20);
    he.insert(60);
    he.insert(100);

    he.printHeap();
    
    he.remove();
    he.printHeap();

    he.remove();
    he.printHeap();
  }
}