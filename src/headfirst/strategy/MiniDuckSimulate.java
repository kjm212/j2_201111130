package headfirst.strategy;

public class MiniDuckSimulate{
  public static void main(String[] args){
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
  
    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
    
  }
}