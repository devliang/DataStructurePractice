public class BinarySearch extends Search{

  public BinarySearch(int[] arr){
    super(arr);
  }

  public int search(int value){
    long startTime = System.nanoTime();
    int start = 0;
    int end = nElems -1;
    int middle = 0;

    while(true){
      middle = (start + end)/2;
      if(arr[middle] == value)
        break;
      else if(start > end){
        middle = -1;
        break;
      }
      else{
        if(arr[middle]>value)
          end = middle -1;
        else
          start = middle +1;
      }
    }
    long timeElapsed = System.nanoTime() - startTime;
    double seconds = timeElapsed/1000000000.0;
    System.out.println("The time elapsed for binary search is: " + seconds + "s");

    return middle;
  }
}