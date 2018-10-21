import java.util.*;

public class Main{
  public static void main(String[] args){

    String input, output;
    int calcOutput;
    System.out.print("Enter an expression Infix: ");
    Scanner scan = new Scanner(System.in);
    input = scan.nextLine();

    InfixToPostfix exp = new InfixToPostfix(input);
    output = exp.convert();

    System.out.println("Postfix is " + output);

    Calculation newExp = new Calculation(output);
    calcOutput = newExp.calc();
    
    System.out.println("The calulated result is: " + calcOutput);
  }
}