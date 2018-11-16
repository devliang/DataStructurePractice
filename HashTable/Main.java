class Main {
  public static void main(String[] args) {
    HashTable ht = new HashTable();
    ht.putPair(1, "one");
    ht.putPair(2, "two");
    ht.putPair(3, "three");
    ht.putPair(11, "eleven");
    ht.putPair(12, "twelve");
    ht.putPair(22, "twentytwo");


    ht.printTable();

    System.out.println("key: " + "1" + " value is: " + ht.getValue(1));
    System.out.println("key: " + "11" + " value is: " + ht.getValue(11));

    System.out.println("Number of items on index 2: " + ht.numberOfPairsInList(2));

    System.out.println("");
    ht.deletePair(2);
    ht.deletePair(12);
    ht.deletePair(22);

  
    ht.printTable();
    System.out.println("Number of items on index 1: " + ht.numberOfPairsInList(2));
  }
}