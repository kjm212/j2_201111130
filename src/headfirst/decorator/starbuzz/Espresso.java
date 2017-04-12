package headfirst.decorator.starbuzz;

public class Espresso extends Beverage{
//  String description = "Espresso";
  
  public Espresso(){
    description = "Espresso"; 
  }
  
//  public String getDescription(){
//    return description;
//  }
  
  public double cost(){
    return 1.99;
  }
}