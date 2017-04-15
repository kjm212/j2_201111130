package headfirst.address_v0;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;

public class RemoveActionListener extends myListener{
  //private JTable table;
 // public RemoveActionListener(JTable table){
 //   this.table = table;
 // }
  
  public RemoveActionListener(JTable table){
   super(table); 
  }
  
  public void actionPerformed(ActionEvent e){
   int row = getTable().getSelectedRow();
   if(row == -1) return;
   DefaultTableModel model = (DefaultTableModel)getTable().getModel();
   model.removeRow(row);
  }
}