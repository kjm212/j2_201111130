package headfirst.decorator.starbuzz;

public class Macchiato extends Beverage{
  public Macchiato(){
    description = "Caramel Macchiato";
  }
  
  public double cost(){
    return 3.55;
  }
}