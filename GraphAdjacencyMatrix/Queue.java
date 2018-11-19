public class Queue{
  public static final int SIZE = 20;
  int[] q;
  int front;
  int rear;
  int counter;

  public Queue(){
    q = new int[SIZE];
    front = 0;
    rear = -1;
    counter =0;
  }

  public void enqueue(int i){
    if(rear == SIZE -1)//queue is full
      rear = -1;
    q[++rear] = i;
    counter ++;
  }

  public int dequeue(){
    int temp = q[front++];
    if(front == SIZE)
      front =0;
    counter --;
    return temp;
  }

  public boolean isEmpty(){
    return (counter == SIZE)? true : false;
  }
}