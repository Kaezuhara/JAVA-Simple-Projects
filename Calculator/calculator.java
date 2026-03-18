import java.util.Scanner;

public class calculator{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    String repeat = "y";

    String operation = "";

    int firstNum;
    int secondNum;
    int result;

    while(repeat.equalsIgnoreCase("y")){
      
      while(true){

        // add if statement validation here
        System.out.print("Enter first integer: ");
        firstNum = scanner.nextInt();
        System.out.print("Enter second integer: ");
        secondNum = scanner.nextInt();
        // add if statement validation here

        System.out.print("Enter your desired operation: ");
        operation = scanner.next();

        if(operation.equals("+")){
          System.out.println("You chose addition.");
          result = firstNum + secondNum;
          break;
        } else if (operation.equals("-")){
          System.out.println("You chose subtraction.");
          result = firstNum - secondNum;
          break;
        } else if (operation.equals("*")){
          System.out.println("You chose multiplication.");
          result = firstNum * secondNum;
          break;
        } else if (operation.equals("/")){
          System.out.println("You chose division.");
          result = firstNum / secondNum;
          break;
        } else{
          System.out.println("Invalid input");
        }
      }

      System.out.println("Result: " + result);

      while(true){
        System.out.print("Do you want to repeat the program? (y/n): ");
        repeat = scanner.next();

        if(repeat.equalsIgnoreCase("y") || repeat.equalsIgnoreCase("n")){
          break;
        } else {
          System.out.println("Invalid input.");
        }
      }
    }
  scanner.close();
  }
}