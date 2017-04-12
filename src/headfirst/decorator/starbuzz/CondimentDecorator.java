package headfirst.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage{
  Beverage b;
  
//  public CondeimentDecorator(Beverage b){
//    this.b = b;
//  }
  
//  public void setDescription(String description){
//    description = "Unknown Beverage";
//  }
  
  public abstract String getDescription();
  
//  public abstract double getCost(); 
}