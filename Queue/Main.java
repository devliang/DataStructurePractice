class Main {
  public static void main(String[] args) {
    int size = 6;
    Queue queArr = new Queue(size);

    queArr.enqueue(11);
    queArr.enqueue(22);
    queArr.enqueue(33);
    queArr.enqueue(44);
    queArr.enqueue(55);
    queArr.enqueue(66);
   // queArr.enqueue(77);

    while(!queArr.isEmpty()){
      System.out.print(queArr.dequeue());
      System.out.print(" ");
    }
    System.out.println("");

    System.out.print(queArr.dequeue());
  }
}