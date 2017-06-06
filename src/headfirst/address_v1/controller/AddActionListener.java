package headfirst.address_v1.controller;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import headfirst.address_v1.dao.*;
import headfirst.address_v1.entity.*;

public class AddActionListener extends MyListener{
  private JTextField text1, text2, text3;
  private PeopleInfoDAO dao;
  
  public AddActionListener(JTable table, JTextField text1, JTextField text2, JTextField text3){
    super(table);
    dao = PeopleInfoDAOImpl.getInstance();
    this.text1 = text1;
    this.text2 = text2;
    this.text3 = text3;
  }
  
  public void actionPerformed(ActionEvent e){
    String arr[] = new String[3];
    arr[0] = text1.getText();
    arr[1] = text2.getText();
    arr[2] = text3.getText();
    if(arr[0].equals("") || arr[1].equals("") || arr[2].equals("")){
    
    }else{
       PeopleInfo info = new PeopleInfo(arr[0],arr[1],arr[2]);
      
      DefaultTableModel model = (DefaultTableModel)getTable().getModel();
      model.addRow(arr);
      dao.insert(info); 
    }
  }
}
