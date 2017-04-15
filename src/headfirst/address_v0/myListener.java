package headfirst.address_v0;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;

public abstract class myListener implements ActionListener{ // 두 액션클래스의 부모클래스
  private JTable table;  // 액션리스너에서 모두 쓰는 변수
  
  public myListener(JTable table){
    this.table = table;
  }
  
  public JTable getTable(){
    return this.table;
  }
  
  public abstract void actionPerformed(ActionEvent e);   // 액션리스너의 공통기능
}