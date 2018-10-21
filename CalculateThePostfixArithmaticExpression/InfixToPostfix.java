public class InfixToPostfix{
  CharStack aStack;
  String input;
  String output = "";
  int size;


  public InfixToPostfix(String s){
    input = s;
    size = input.length();
    aStack = new CharStack(size);
  }

  public String convert(){
    for(int i =0; i<input.length(); i++){
      char ch = input.charAt(i);
      switch(ch){
        case '+':
        case '-':
          gotOper(ch,1);
          break;
        case '*':
        case '/':
          gotOper(ch,2);
          break;
        case '(': //if it's open paren, then push to stack
          aStack.push(ch);
          break;
        case ')':
          gotParen(); //call function and go to see if the next pop is (
          break;
        default:
          output +=ch; //if it's an operand, then write to output
      }
    }

    while(!aStack.isEmpty()){
      output += aStack.pop(); //pop remaining write to output
    }

    return output;
  }

  public void gotOper(char ch, int prece){
    while(!aStack.isEmpty()){
      char top = aStack.pop();
      if(top == '('){
        aStack.push(top);// if it's opening paren, then push back to stack
        break;
      }
      int newPrece; //precedent of new operator
      if(top == '+' || top == '-')
        newPrece = 1;
      else
        newPrece = 2;
      
      if(newPrece < prece){
        aStack.push(top); //if new precedence is less than old precedence, save back
        break;
      }
      else
        output += top; //if new precedence is larger than old one, then write to output
    }
    aStack.push(ch);//push the remaining
  }
  
  public void gotParen(){
    while(!aStack.isEmpty()){
      char chx = aStack.pop();
      if(chx == '(') //find ( , matching with )
        break;
      else
        output += chx; //the pop is a operand, then write to output
    }
  }

}