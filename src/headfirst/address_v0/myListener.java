package headfirst.address_v0;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;

public abstract class myListener implements ActionListener{ // �� �׼�Ŭ������ �θ�Ŭ����
  private JTable table;  // �׼Ǹ����ʿ��� ��� ���� ����
  
  public myListener(JTable table){
    this.table = table;
  }
  
  public JTable getTable(){
    return this.table;
  }
  
  public abstract void actionPerformed(ActionEvent e);   // �׼Ǹ������� ������
}