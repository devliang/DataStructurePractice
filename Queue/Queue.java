public class Queue {
  private int size;
  private int[] arr;
  private int front;
  private int rear;
  private int counter;

  public Queue(int size) {
    this.size = size;
    arr = new int[size];
    front = 0;
    rear = -1;
    counter = 0;
  }

  public boolean isFull() {
    return (counter == size) ? true : false;
  }

  public boolean isEmpty() {
    return (counter == 0) ? true : false;
  }

  public void enqueue(int value) {
    if (!isFull()) {
      if (rear == size - 1)
        rear = -1;
      arr[++rear] = value;
      counter++;
    } else
      System.out.println("Queue is FULL!");
  }

  public int dequeue() {
    if (!isEmpty()) {
      if (front == size)
        front = 0;
      counter--;
      return arr[front++];
    } else
      return -1;
  }

  public int peek() {
    return (!isEmpty())?arr[front]:-1;
  }
}