class Main {
  public static void main(String[] args) {
    int[] arr = {77,99,44,55,22,88,11,0,66,33};

    BubbleSort bs = new BubbleSort(arr);

    bs.BubbleSort();
    bs.display();

    SelectionSort ss = new SelectionSort(arr);

    ss.SelectionSort();
    ss.display();
  }
}