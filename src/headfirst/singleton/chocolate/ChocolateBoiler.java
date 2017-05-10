package headfirst.singleton.chocolate;

public class ChocolateBoiler{    // eager instantiation
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled = 0;
  private boolean empty;
  private boolean boiled;
  
  private ChocolateBoiler(){
    empty = true;
    boiled = false;
  }
  
  public static ChocolateBoiler getInstance(){
    if(uniqueInstance == null){
      uniqueInstance = new ChocolateBoiler();
    }
    System.out.println("number called" + numCalled++);
      return uniqueInstance;
  }
  
  public void fill(){
    if(isEmpty()){
     empty = false;
     boiled = false;
    }
  }
  public void drain() {
  if (!isEmpty() && isBoiled()) {
   // drain the boiled milk and chocolate
   empty = true;
  }
 }
 
 public void boil() {
  if (!isEmpty() && !isBoiled()) {
   // bring the contents to a boil
   boiled = true;
  }
 }
 
  public boolean isEmpty(){
    return empty;
  }
  
  public boolean isBoiled(){
    return boiled;
  }
}