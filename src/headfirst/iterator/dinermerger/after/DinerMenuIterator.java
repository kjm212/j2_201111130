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
    MenuItem m = items[position]; // 해당 아이템 
    position++;  // 위치 하나증가
    return m;  // 반환
  }
}