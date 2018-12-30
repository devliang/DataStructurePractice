class Main {
  public static void main(String[] args) {
    ObjectArrayList objAL = new ObjectArrayList();

    objAL.add("String0");
    objAL.add("String1");
    objAL.add("String2");
    objAL.add("String3");
    objAL.add("String4");

    System.out.println("");

    objAL.remove(0);
    objAL.remove(1);
    

    objAL.add("a");
    objAL.add("aa");
    objAL.add("aaa");
    objAL.add("aaaa");
    objAL.add("aaaaa");
    objAL.add("aaaaaa");
    objAL.add("aaaaaaa");
    objAL.add("aaaaaaaa");
    objAL.add("aaaaaaaaa");
    objAL.add("aaaaaaaaaa");

    objAL.printAll();
  }
}