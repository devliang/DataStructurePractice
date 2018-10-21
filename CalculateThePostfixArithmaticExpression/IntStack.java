public class IntStack{
  int size;
  int[] arr;
  int top;

  public IntStack(int size){
    this.size = size;
    arr = new int[size];
    top = -1;
  }

  public boolean isEmpty(){
    return (top == -1)? true:false;
  }

  public boolean isFull(){
    return (top == size-1)? true:false;
  }

  public void push(int value){
    if(!isFull())
      arr[++top] = value;
    else
      return;
  }

  public int pop(){
    return (!isEmpty())? arr[top--]:-1;
  }

  public int peek(){
    return (!isEmpty())? arr[top]:-1;
  }
}