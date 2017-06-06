package headfirst.address_v1.controller;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import headfirst.address_v1.dao.*;
import headfirst.address_v1.entity.*;

public class RemoveActionListener extends MyListener{
  private PeopleInfoDAO dao;
  private JTextField text1;
  
  public RemoveActionListener(JTable table, JTextField text1){
    super(table); 
    this.text1 = text1;
    dao = PeopleInfoDAOImpl.getInstance();
  }
  
  public void actionPerformed(ActionEvent e){ // row에 있는거 따와야댐
    String name = (String)(getTable().getValueAt(getTable().getSelectedRow(),getTable().getSelectedColumn()));
    int row = getTable().getSelectedRow();
    if(row == -1) return;
    DefaultTableModel model = (DefaultTableModel)getTable().getModel();
    model.removeRow(row);
    System.out.println(name);
    dao.delete(name);
  }
}