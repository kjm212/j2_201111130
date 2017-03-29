package com.sd.gui;
import java.awt.event.*;
import javax.swing.*;

// CalcListener can not access to JTextFields
public class CalcAreaListener implements ActionListener {
  private JTextField radius, area;
  private Double areaResult;
  private double rad;
  
  public CalcAreaListener(){
    this.areaResult = 1.0;
    rad = 0.0;
  }
  public CalcAreaListener(JTextField radius, JTextField area){
    this.areaResult = 1.0;
    this.radius=radius;
    this.area=area;
  }
  
  public double ParseDouble(String strNumber){
    if (strNumber != null && strNumber.length() > 0) {
       try {
          return Double.parseDouble(strNumber);
       } catch(Exception e) {
          return -1;   
       }
   }
   else return 0;
  }
  
    public void actionPerformed(ActionEvent e) {
      JButton b = (JButton)e.getSource();
      String cmd = e.getActionCommand();
      
      if(cmd.equals("계산")){
         rad = ParseDouble(radius.getText());
         this.areaResult = rad * rad * 3.14;
        this.area.setText(areaResult.toString());
         System.out.println("계산 버튼");
      }else if (cmd.equals("취소")){
        System.out.println("취소 버튼");
        this.area.setText(new String("0"));
        this.radius.setText(new String("0"));
      }
    }
}