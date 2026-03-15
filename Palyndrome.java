import java.util.Scanner;

public class Palyndrome{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int size;
    int revSize;

    System.out.println("Enter the number of digits for your value.");
    System.out.print("Number of digits: ");
    size = scanner.nextInt();
    revSize = size - 1;

    int[] array = new int[size];
    int[] revArray = new int[size];

    for (int i = 0; i < size; i++){
      System.out.print("Digit " + (i+1) +": ");
      array[i] = scanner.nextInt();
      revArray[revSize] = array[i];  
      revSize--;
    }

    System.out.print("Entered integer value: ");
    for (int i = 0; i < size; i++){
      System.out.print(array[i]);
    }

    System.out.println();

    System.out.print("Reversed integer value: ");
    for (int i = 0; i < size; i++){
      System.out.print(revArray[i]);
    }

    System.out.println();

    boolean isPalyndrome = true; 

    for (int i = 0; i < size; i++){
      if (array[i] != revArray[i]){
        isPalyndrome = false;
        break;
      }
    }

    if (isPalyndrome == true){
      System.out.println("The integer you entered is a PALYNDROME.");
    } else {
      System.out.println("The integer you entered is a NOT PALYNDROME.");
    }

    

    scanner.close();
  }

}