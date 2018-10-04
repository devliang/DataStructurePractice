class Main {
  public static void main(String[] args) {
    int size =10;

    array arr = new array(size);
    arr.insert(77);
    arr.insert(88);
    arr.insert(99);
    arr.insert(44);
    arr.insert(22);

    arr.display();

    int key = 99;

    if(arr.find(key))
      System.out.println("Found " + key);
    else
      System.out.println("Can Not Find " + key);

    arr.delete(44);
    arr.delete(77);

    arr.display();
  }
}