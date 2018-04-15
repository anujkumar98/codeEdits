package book_1;

import javax.swing.JLabel;

public class Gui_1 {
  static javax.swing.JComboBox cb1;
  
  public Gui_1() {}
  
  public static void main(String[] args) { javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(3);
    frame.setSize(1920, 1000);
    frame.setLocation(0, 0);
    
    frame.setTitle("test");
    



    frame.setResizable(true);
    



    java.awt.Container c = frame.getContentPane();
    c.setLayout(null);
    javax.swing.ImageIcon icon = new javax.swing.ImageIcon("ab.jpg");
    JLabel label = new JLabel("User Name:", icon, 2);
    c.add(label);
    label.setBounds(100, 50, 200, 30);
    
    JLabel label1 = new JLabel("Password:");
    c.add(label1);
    label1.setBounds(100, 100, 200, 30);
    java.awt.Font f = new java.awt.Font("Arial", 0, 30);
    label.setFont(f);
    label1.setFont(f);
    






    javax.swing.JTextField mytext = new javax.swing.JTextField();
    
    mytext.setBounds(300, 50, 200, 40);
    java.awt.Font ff = new java.awt.Font("Arial", 1, 30);
    mytext.setFont(ff);
    mytext.setBackground(java.awt.Color.BLUE);
    mytext.setForeground(java.awt.Color.RED);
    

    c.add(mytext);
    

    javax.swing.JPasswordField pass = new javax.swing.JPasswordField();
    pass.setBounds(300, 100, 200, 40);
    c.add(pass);
    pass.setBackground(java.awt.Color.RED);
    pass.setForeground(java.awt.Color.BLUE);
    


    javax.swing.ImageIcon icon1 = new javax.swing.ImageIcon("a.png");
    javax.swing.JButton btn = new javax.swing.JButton(icon1);
    btn.setBounds(200, 200, 200, 40);
    java.awt.Cursor cur = new java.awt.Cursor(3);
    btn.setCursor(cur);
    
    c.add(btn);
    

    javax.swing.JRadioButton radio_male = new javax.swing.JRadioButton("Male");
    javax.swing.JRadioButton radio_fmale = new javax.swing.JRadioButton("Female");
    radio_male.setBounds(100, 400, 300, 50);
    radio_fmale.setBounds(100, 500, 300, 50);
    c.add(radio_male);
    c.add(radio_fmale);
    radio_male.setFont(f);
    radio_fmale.setFont(f);
    javax.swing.ButtonGroup gender = new javax.swing.ButtonGroup();
    gender.add(radio_male);
    gender.add(radio_fmale);
    radio_male.setSelected(true);
    radio_fmale.setEnabled(false);
    




    javax.swing.JCheckBox cb = new javax.swing.JCheckBox("I Agree the terms and conditions.");
    cb.setBounds(100, 700, 3000, 40);
    c.add(cb);
    cb.setFont(f);
    cb.setSelected(true);
    cb.setEnabled(true);
    


    String[] str = { "A", "B", "D", "R" };
    cb1 = new javax.swing.JComboBox(str);
    cb1.setBounds(100, 800, 100, 40);
    c.add(cb1);
    c.revalidate();
    cb1.setEditable(true);
    cb1.setSelectedItem("R");
    
    javax.swing.JButton btn_jcom = new javax.swing.JButton("Select");
    btn_jcom.setBounds(300, 800, 100, 40);
    c.add(btn_jcom);
    lab_jcom = new JLabel("MSG");
    lab_jcom1 = new JLabel("MSG");
    lab_jcom.setBounds(100, 900, 100, 40);
    lab_jcom1.setBounds(300, 900, 100, 40);
    c.add(lab_jcom);
    lab_jcom.setFont(f);
    c.add(lab_jcom1);
    lab_jcom1.setFont(f);
    btn_jcom.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent event) {
        Gui_1.btnEvent(event);
      }
    });
    cb1.addItem("E");
    cb1.addItem("F");
    cb1.removeItem("R");
    



    javax.swing.JTextArea textarea = new javax.swing.JTextArea();
    textarea.setBounds(700, 100, 1000, 500);
    c.add(textarea);
    textarea.setFont(f);
    textarea.setBackground(java.awt.Color.RED);
    textarea.setForeground(java.awt.Color.BLACK);
  }
  
  static void btnEvent(java.awt.event.ActionEvent event) { lab_jcom.setText(Integer.toString(cb1.getSelectedIndex()));
    lab_jcom1.setText((String)cb1.getSelectedItem());
  }
  
  static JLabel lab_jcom;
  static JLabel lab_jcom1;
}
