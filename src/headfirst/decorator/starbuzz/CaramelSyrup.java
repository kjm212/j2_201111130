package headfirst.decorator.starbuzz;

public class CaramelSyrup extends CondimentDecorator {
 Beverage beverage;

 public CaramelSyrup(Beverage beverage) {
  this.beverage = beverage;
 }

 public String getDescription() {
  return beverage.getDescription() + ", CaramelSyrup";
 }

 public double cost() {
  return .15 + beverage.cost();
 }
}