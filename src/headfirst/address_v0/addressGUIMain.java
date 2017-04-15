package headfirst.address_v0;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class addressGUIMain{
  public static void main(String[] args){
    JFrame frame = new JFrame("주소록 메인");
    frame.setPreferredSize(new Dimension(1000,400));
    frame.setLocation(500, 400);
    
    Container contentPane = frame.getContentPane();
    String colNames[] = {"이름", "번호", "주소"};
    DefaultTableModel model = new DefaultTableModel(colNames, 0);
    JTable table = new JTable(model);
    
    contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
    JPanel panel = new JPanel();
    JTextField text1 = new JTextField(6);
    JTextField text2 = new JTextField(20);
    JTextField text3 = new JTextField(30);
    JButton button1 = new JButton("추가");
    JButton button2 = new JButton("삭제");
    
    panel.add(new JLabel("이름"));
    panel.add(text1);
    panel.add(new JLabel("번호"));
    panel.add(text2);
    panel.add(new JLabel("주소"));
    panel.add(text3);
    
    panel.add(button1);
    panel.add(button2);
    contentPane.add(panel, BorderLayout.SOUTH);
    
    myListener l1 = new AddActionLIstener(table, text1, text2, text3);
    myListener l2 = new RemoveActionListener(table);
   
    button1.addActionListener(l1);  // 컴파일 전에는 객체 타입 모름
    button2.addActionListener(l2);  // 컴파일 전에는 객체 타입 모름
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  } 
}