package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
// String description = "Unknown Beverage";
 Beverage beverage;
 
 public Mocha(Beverage b){
  this.beverage = b; 
 }
 
 public String getDescription(){
   return beverage.getDescription()+" adding Mocha";
 }
 
 public double cost(){
   return beverage.cost() + 20;
 }
}