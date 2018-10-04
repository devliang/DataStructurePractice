public class SelectionSort{
  private int[] arr;
  private int nElems;

  public SelectionSort(int[] arr){
    this.arr = arr;
    nElems = arr.length;
  }

  public void SelectionSort(){
    int out, in, min;
    for(out = 0; out<nElems-1; out++){
      min = out;
      for(in = out+1; in<nElems; in++){
        if(arr[min] > arr[in])
          min = in;
      }
      swap(out, min);
    }
  }

  public void swap(int a, int b){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  public void display(){
    for(int i=0; i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println("");
  }
}