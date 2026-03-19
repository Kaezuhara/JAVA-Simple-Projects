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

      System.out.println("");
      System.out.println("---------------------------------------");
      System.out.println("");
      
      while(true){

        // add if statement validation here
        while(true){
          System.out.print("Enter first integer: ");
          if(scanner.hasNextInt()){
            firstNum = scanner.nextInt();
            break;
          } else{
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
          }
        }

        while(true){
          System.out.print("Enter second integer: ");
          if(scanner.hasNextInt()){
            secondNum = scanner.nextInt();
            break;
          } else{
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
          }
        }

        System.out.print("Choose your desired operation (+ - * /): ");
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
      System.out.println("Solution: " + firstNum + " " + operation + " " + secondNum + " = " + result);

      while(true){
        System.out.println("");
        System.out.print("Do you want to repeat the program? (y/n): ");
        repeat = scanner.next();

        if(repeat.equalsIgnoreCase("y") || repeat.equalsIgnoreCase("n")){
          break;
        } else {
          System.out.println("Invalid input.");
        }
      }
    }
  System.out.println("Thank you! Terminating the program...");
  System.out.println("");  
  scanner.close();
  }
}