package headfirst.singleton.stat;

public class Singleton{ // eager init
  private static Singleton uniqueInstance = new Singleton();
  private static int numCalled = 0; 
//  private boolean empty;
//  private boolean boiled;
  
  private Singleton(){
//    empty = true;
//    boiled = false;
  }
  
  public static Singleton getInstance(){
//    if(uniqueInstance == null){
//      System.out.println("creating...");
//      uniqueInstance = new Singleton();
//    }
    System.out.println("number called" + numCalled++);
      return uniqueInstance;
  }
}