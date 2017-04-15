package headfirst.address_v0;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;

public class AddActionLIstener extends myListener{
  //private JTable table;
  private JTextField text1, text2, text3;
  
  public AddActionLIstener(JTable table, JTextField text1, JTextField text2, JTextField text3){
    super(table);
    this.text1 = text1;
    this.text2 = text2;
    this.text3 = text3;
  }
  
  public void actionPerformed(ActionEvent e){
    String arr[] = new String[3];
    arr[0] = text1.getText();
    arr[1] = text2.getText();
    arr[2] = text3.getText();
    
    DefaultTableModel model = (DefaultTableModel)getTable().getModel();
    model.addRow(arr);
  }
}
  