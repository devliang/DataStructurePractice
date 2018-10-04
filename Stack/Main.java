class Main {
  public static void main(String[] args) {
    int size = 6;
    Stack st = new Stack(size);

    st.push(11);
    st.push(12);
    st.push(13);
    st.push(14);

    while(!st.isEmpty()){
      System.out.print(st.pop());
      System.out.print(" ");
    }

    System.out.println("");

    System.out.print(st.peek());

  }
}