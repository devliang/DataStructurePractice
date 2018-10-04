class Main {
  public static void main(String[] args) {
    int size = 100000;
    int[] arr = new int[size];

    for(int i=0; i<arr.length; i++){
      arr[i] = i;
    }

    BinarySearch bs = new BinarySearch(arr);
    LinearSearch ls = new LinearSearch(arr);

    int key = 6930;

    if(bs.search(key)!=-1)
      System.out.println("Found: " + key);
    else
      System.out.println("Not Found: " + key);

    if(ls.search(key)!=-1)
      System.out.println("Found: " + key);
    else
      System.out.println("Not Found: " + key);
  }
}