package Constructor;

public class Pizza {
  String toppings;
  int diameter;
  double price;
  int amount;

  public void order(String toppings, int diameter, double price){
    this.toppings = toppings;
    this.diameter = diameter;
    this.price = price;
  }

  public void order(String toppings, int diameter, double price, int amount){
    this.toppings = toppings;
    this.diameter = diameter;
    this.price = price;
    this.amount = amount;
  }
}
