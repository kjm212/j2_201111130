package headfirst.singleton.dcl;

public class Singleton{
  private static Singleton uniqueInstance;
  private static int numCalled = 0; 

  private Singleton(){}
  
//  public static synchronized Singleton getInstance() {  // CPU간의 함수 공유
//  if (uniqueInstance == null) {
//   System.out.println("Creating unique instance of Chocolate Boiler");
//   uniqueInstance = new Singleton();
//  }
//  System.out.println("Returning instance of Chocolate Boiler");
//  System.out.println("jsl: numCalled "+numCalled++);
//  return uniqueInstance;
// }
  
  public static Singleton getInstance() {  // CPU간의 함수 공유
  if (uniqueInstance == null) {
     synchronized(Singleton.class){
       if(uniqueInstance == null){
          System.out.println("Creating unique instance of Chocolate Boiler");
          uniqueInstance = new Singleton();
      }
    }
  }
  System.out.println("Returning instance of Chocolate Boiler");
  System.out.println("jsl: numCalled "+numCalled++);
  return uniqueInstance;
 }
}