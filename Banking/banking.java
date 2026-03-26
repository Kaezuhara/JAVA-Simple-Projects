import java.util.Scanner;

public class banking{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    double balance = 0.0;
    int choice = 0;
    while (choice != 4){

      System.out.println();
      System.out.println("---------------");
      System.out.println("BANKING PROGRAM");
      System.out.println("---------------");

      // OPTIONS
      System.out.println("(1) Check Balance");
      System.out.println("(2) Deposit");
      System.out.println("(3) Withdraw");
      System.out.println("(4) Exit");

      // CHOOSE
      while (true){ 
        System.out.print("Enter your choice (1-4): ");

        if (scanner.hasNextInt()) {     // loop that prevents non-integer input crash
          choice = scanner.nextInt();
          
          if (choice == 1){
            System.out.printf("\nYour balance is: $%.2f\n", balance);
            break;
          } else if (choice == 2){
            balance = deposit(balance, scanner);
            break;
          } else if (choice == 3){
            balance = withdraw(balance, scanner);
            break;
          } else if (choice == 4){
            break;
          } else {
            System.out.println("Invalid input.");
            scanner.next();
          }

        } else {      // clear non-integer input
          System.out.println("Invalid input.");
          scanner.next();
        }
      }
    }
    System.out.println("Closing the program...");
    scanner.close();
  }

  // ----- DEPOSIT METHOD -----
  static double deposit(double balance, Scanner scanner){
    
    double deposit = 0.0;

    while (true){
      System.out.print("Enter deposit amount: ");

      if (scanner.hasNextDouble()){
        deposit = scanner.nextDouble();

        deposit = Math.round(deposit * 100.0) / 100.0;

        if (deposit > 0){
          balance += deposit;
          balance = Math.round(balance * 100.0) / 100.0;
          System.out.println("Deposit successful.");
          break;
        } else {
          System.out.println("Invalid input.");
        }

      } else {
        System.out.println("Invalid input.");
        scanner.next();
      }
    }
    return balance;
  }

  // ----- WITHDRAW METHOD -----
  static double withdraw(double balance, Scanner scanner){
    double withdraw = 0.0;

    while (true){
      System.out.print("Enter withdraw amount: ");

      if (scanner.hasNextDouble()){
        withdraw = scanner.nextDouble();

        withdraw = Math.round(withdraw * 100.0) / 100.0;

        if (withdraw > 0 && balance >= withdraw){
          balance -= withdraw;
          balance = Math.round(balance * 100.0) / 100.0;
          System.out.println("Withdraw successful.");
          break;
        } else if (withdraw > 0 && withdraw > balance){
          System.out.println("Not enough balance. Withdraw failed.");
        } else {
          System.out.println("Invalid input.");
        }

      } else {
        System.out.println("Invalid input.");
        scanner.next();
      }
    }
    return balance;
  }
}