public abstract class Search{
  int[] arr;
  int nElems;

//constractor
  public Search(int[] arr){
    this.arr = arr;
    nElems = arr.length;
  }

  public abstract int search(int value);
}