package headfirst.address_v1.view;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

import headfirst.address_v1.controller.*;

public class AddressGUIMain{
  public static void main(String[] args){
    JFrame frame = new JFrame("My Address Book");
    frame.setPreferredSize(new Dimension(1100,400));
    frame.setLocation(500, 400);
    
    Container contentPane = frame.getContentPane();
    String colNames[] = {"Name", "Phone", "Address"};
    DefaultTableModel model = new DefaultTableModel(colNames, 0);
    JTable table = new JTable(model);
    
    contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
    JPanel panel = new JPanel();
    JTextField text1 = new JTextField(6);
    JTextField text2 = new JTextField(20);
    JTextField text3 = new JTextField(30);
    JButton button1 = new JButton("ADD");
    JButton button2 = new JButton("DELETE");
    JButton button3 = new JButton("LOAD");
    JButton button4 = new JButton("UPDATE");
    
    panel.add(new JLabel("Name"));
    panel.add(text1);
    panel.add(new JLabel("Phone"));
    panel.add(text2);
    panel.add(new JLabel("Address"));
    panel.add(text3);
    
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    panel.add(button4);
    contentPane.add(panel, BorderLayout.SOUTH);
    
    MyListener l1 = new AddActionListener(table, text1, text2, text3);
    MyListener l2 = new RemoveActionListener(table, text1);
    MyListener l3 = new InitListener(table);
    MyListener l4 = new UpdateActionListener(table, text1, text2, text3); 
    
    button1.addActionListener(l1); 
    button2.addActionListener(l2);  
    button3.addActionListener(l3);
    button4.addActionListener(l4);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  } 
}