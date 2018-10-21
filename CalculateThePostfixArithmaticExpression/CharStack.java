public class CharStack{
  int size;
  char[] arr;
  int top;

  public CharStack(int size){
    this.size = size;
    arr = new char[size];
    top = -1;
  }

  public boolean isEmpty(){
    return (top == -1)? true:false;
  }

  public boolean isFull(){
    return (top == size-1)? true:false;
  }

  public void push(char ch){
    if(!isFull())
      arr[++top] = ch;
    else
      return;
  }

  public char pop(){
    return (!isEmpty())? arr[top--]:null;
  }

  public char peek(){
    return (!isEmpty())? arr[top]:null;
  }
}