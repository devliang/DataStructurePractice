public class LinearSearch extends Search{

  public LinearSearch(int[] arr){
    super(arr);
  }

  public int search(int value){
    long startTime = System.nanoTime();
    int i;
    for(i = 0; i<nElems; i++){
      if(arr[i] == value)
        break;
    }
    long timeElapsed = System.nanoTime() - startTime;
    double seconds = timeElapsed/1000000000.0;
    System.out.println("The time elapsed for linear search is: " + seconds + "s");
    return (i<nElems)?i:-1;
  }
}