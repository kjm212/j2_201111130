package headfirst.iterator.dinermerger.after;
import headfirst.iterator.dinermerger.before.MenuItem;

public class DinerMenuIterator implements Iterator{
  private int position = 0;
  private MenuItem[] items;
  
  public DinerMenuIterator(MenuItem[] m){
    this.items = m;
  }
  
  public boolean hasNext(){
    if(position >= items.length){
      return false;
    }else{
      return true;
    }
  }
  
  public Object next(){
    MenuItem m = items[position]; // �ش� ������ 
    position++;  // ��ġ �ϳ�����
    return m;  // ��ȯ
  }
}