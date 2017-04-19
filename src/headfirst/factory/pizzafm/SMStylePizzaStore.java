package headfirst.factory.pizzafm;

public class SMStylePizzaStore extends PizzaStore{

public Pizza createPizza(String type) {
  Pizza pizza = null;
  if (type.equals("potato")) {
    pizza = new SMStylePotatoPizza();
  } 

  return pizza;
}

}