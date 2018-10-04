public class BubbleSort{
  private int[] arr;
  private int nElems;

  public BubbleSort(int[] arr){
    this.arr = arr;
    nElems = arr.length;
  }

  public void BubbleSort(){
    int out, in;
    for(out = nElems - 1; out>1; out --){
      for(in=0; in<out; in++){
        if(arr[in] > arr[in+1])
          swap(in, in+1);
      }
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