public class Stack{
  private int size;
  private int[] arr;
  private int top;

  public Stack(int size){
    this.size = size;
    arr = new int[size];
    top = -1;
  }

  public boolean isFull(){
    return (top == size-1)? true:false;
  }

  public boolean isEmpty(){
    return (top == -1)? true : false;
  }

  public void push(int value){
    if(!isFull())
      arr[++top] = value;
    else
      System.out.print("The stack is full");
  }

  public int pop(){
    return (!isEmpty())?arr[top--]:-1;
  }

  public int peek(){
    return (!isEmpty())?arr[top] : -1;
  }

}