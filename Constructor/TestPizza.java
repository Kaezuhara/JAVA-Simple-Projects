package Constructor;

public class TestPizza {
  public static void main(String[] args){
    Pizza variant1 = new Pizza();
    Pizza variant2 = new Pizza();

    System.out.println("----------------");
    variant1.order("Pepperoni", 8, 18.99);
    System.out.println("Order #1");
    System.out.println("Toppings: " + variant1.toppings);
    System.out.println("Diameter: " + variant1.diameter);
    System.out.println("Price: " + variant1.price);
    System.out.println("----------------");

    System.out.println("");

    System.out.println("----------------");
    variant2.order("Bacon", 11, 24.99, 2);
    System.out.println("Order #2");
    System.out.println("Toppings: " + variant2.toppings);
    System.out.println("Diameter: " + variant2.diameter);
    System.out.println("Price: " + variant2.price);
    System.out.println("Amount: " + variant2.amount);
    System.out.println("----------------");
  }
}