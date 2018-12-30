import java.util.Arrays;

public class ObjectArrayList{

  public static final int SIZE = 5;
  int nElems;
  Object[] arr;

  public ObjectArrayList(){
    nElems = 0;
    arr = new Object[SIZE];
  }

  public boolean isFull(){
    return nElems == arr.length;
  }

  public void add(Object obj){
    if(isFull()){//size doubled
      int newSize = arr.length*2;
      arr = Arrays.copyOf(arr,newSize);
    }

    arr[nElems++] = obj;
  }

  public Object getObj(int i){
    if(i<0 || i>=nElems){
      return null;
    }
    else
      return arr[i];
  }

  public Object remove(int i){
    Object temp;
    if(i <0 || i>=nElems){
      return null;
    }
    else{
      temp = arr[i];
      for(int j = i; j< nElems-1; j++){
        arr[j] = arr[j+1];
      }
      nElems--;
      return temp;
    }
  }

  public void printAll(){
    for(int i =0; i<nElems; i++){
      System.out.println(arr[i].toString());
    }
  }
}