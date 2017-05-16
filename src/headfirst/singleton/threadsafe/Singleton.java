package headfirst.singleton.threadsafe;

public class Singleton{
  private static Singleton uniqueInstance;
  private static int numCalled = 0; 

  private Singleton(){}
  
  public static synchronized Singleton getInstance() {  // CPU간의 함수 공유
  if (uniqueInstance == null) {
   System.out.println("Creating unique instance of Chocolate Boiler");
   uniqueInstance = new Singleton(); // threadsafe의 문제는 메소드 단위로 보안하기 때문에 객체에 대해
                                     //   안전하지 않을 수 있다.
  }
  System.out.println("Returning instance of Chocolate Boiler");
  System.out.println("jsl: numCalled "+numCalled++);
  return uniqueInstance;
 }
}