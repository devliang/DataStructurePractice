public class Calculation{
  String input;
  IntStack aStack;//create a instance of integer stack
  int size;

  public Calculation(String input){
    this.input = input;
    size = input.length();
    aStack = new IntStack(size);
  }

  public int calc(){
    char ch;
    int num1, num2, result;

    for(int i =0; i<size; i++){
      ch = input.charAt(i);
      if(ch >= '0' && ch <= '9')
        aStack.push((int)(ch-'0')); //it's operand, then I convet to integer and push it into stack
      else{
        num2 = aStack.pop();
        num1 = aStack.pop();
        switch(ch){
          case '+':
            result = num1 + num2;
            break;
          case '-':
            result = num1 - num2;
            break;
          case '*':
            result = num1 * num2;
            break;
          case '/':
            result = num1 / num2;
            break;
          default:
            result = 0;
            break;
        }
        aStack.push(result); //push the result back to stack
      }
    }
    result = aStack.pop();//pop up the final calculated result and return it
    return result;
  }
}