package headfirst.singleton.threadsafe;

public class Singleton{
  private static Singleton uniqueInstance;
  private static int numCalled = 0; 

  private Singleton(){}
  
  public static synchronized Singleton getInstance() {  // CPU���� �Լ� ����
  if (uniqueInstance == null) {
   System.out.println("Creating unique instance of Chocolate Boiler");
   uniqueInstance = new Singleton(); // threadsafe�� ������ �޼ҵ� ������ �����ϱ� ������ ��ü�� ����
                                     //   �������� ���� �� �ִ�.
  }
  System.out.println("Returning instance of Chocolate Boiler");
  System.out.println("jsl: numCalled "+numCalled++);
  return uniqueInstance;
 }
}