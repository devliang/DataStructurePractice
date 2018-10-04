public class array{
  private int[] arr;
  private int nElems;

  public array(int size){
    arr = new int[size];
    nElems = 0;
  }

  public void insert(int value){
    arr[nElems++] = value;
  }

  public boolean find(int value){
    int i;
    for(i=0; i<arr.length; i++){
      if(arr[i] == value)
        break;
    }
    return (i < nElems)? true : false; 
  }

  public boolean delete(int value){
    int i;
    for(i=0; i< arr.length; i++){
      if(arr[i] == value)
        break;
    }
    if(i == nElems)
      return false;
    else{
      for(int j =i; j<nElems; j++){
        arr[j] = arr[j+1];
      }
      nElems--;
      return true;
    }
  }

  public void display(){
    for(int i =0; i< arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println("");
  }
}