package headfirst.address_v1.controller;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import headfirst.address_v1.dao.*;
import headfirst.address_v1.entity.*;

public class UpdateActionListener extends MyListener{
  private PeopleInfoDAO dao;
  private JTextField text1, text2, text3;
  
  public UpdateActionListener(JTable table, JTextField text1, JTextField text2, JTextField text3){
    super(table);
    dao = PeopleInfoDAOImpl.getInstance();
    this.text1 = text1;
    this.text2 = text2;
    this.text3 = text3;
  }
  
  public void actionPerformed(ActionEvent e){
    int row = getTable().getSelectedRow();
    if(row == -1) return;
    DefaultTableModel model = (DefaultTableModel)getTable().getModel();
    
    if(text1.getText().equals("") || text2.getText().equals("") || text3.getText().equals("") ){
    
    }else{
      model.setValueAt(text1.getText(),row,0);
      model.setValueAt(text2.getText(),row,1);
      model.setValueAt(text3.getText(),row,2);
      
      PeopleInfo people = new PeopleInfo(text1.getText(), text2.getText(), text3.getText());
      dao.delete(dao.getPeoples().get(row).getName());
      dao.insert(people);
    }
  }
}
