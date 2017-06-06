package headfirst.address_v1.controller;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import headfirst.address_v1.dao.*;
import headfirst.address_v1.entity.*;

public class InitListener extends MyListener{
  private PeopleInfoDAO dao;
  
  public InitListener(JTable table){
    super(table);
    dao = PeopleInfoDAOImpl.getInstance();
  }
  
  public void actionPerformed(ActionEvent e){
    if(dao.getPeoples() != null){
      dao.getPeoples().clear();
    }
    dao.initPeople();
    
    String arr[] = new String[3];
    DefaultTableModel model = (DefaultTableModel)getTable().getModel();
    model.setNumRows(0);
 
    for(PeopleInfo people : dao.getPeoples()){
      arr[0] = people.getName();
      arr[1] = people.getPhone();
      arr[2] = people.getAddress();
      model.addRow(arr);
    }
  }
}