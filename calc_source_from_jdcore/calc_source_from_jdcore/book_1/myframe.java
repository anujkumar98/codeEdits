package book_1;

import javax.swing.JButton;

class myframe extends javax.swing.JFrame implements java.awt.event.ActionListener {
  JButton btn1 = new JButton("Black");
  JButton btn2 = new JButton("Red");
  JButton btn3 = new JButton("Green");
  JButton btn4 = new JButton("Pink");
  JButton btn5 = new JButton("Cray");
  JButton btn6 = new JButton("Ornage");
  java.awt.Container c;
  
  myframe() { c = getContentPane();
    btn1.setBounds(100, 50, 100, 50);
    btn2.setBounds(300, 50, 100, 50);
    btn3.setBounds(500, 50, 100, 50);
    btn4.setBounds(700, 50, 100, 50);
    btn5.setBounds(900, 50, 100, 50);
    btn6.setBounds(1100, 50, 100, 50);
    c.setLayout(null);
    c.add(btn1);
    c.add(btn2);
    c.add(btn3);
    c.add(btn4);
    c.add(btn5);
    c.add(btn6);
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    btn4.addActionListener(this);
    btn5.addActionListener(this);
    btn6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent event) {
        myframe.makeorange(event);
      }
    });
    java.awt.Cursor cur = new java.awt.Cursor(12);
    btn1.setCursor(cur);
    btn2.setCursor(cur);
    btn3.setCursor(cur);
    btn4.setCursor(cur);
    btn5.setCursor(cur);
    btn6.setCursor(cur);
  }
  
  public void actionPerformed(java.awt.event.ActionEvent e)
  {
    if (e.getSource() == btn1)
    {
      c.setBackground(java.awt.Color.BLACK);
    }
    if (e.getSource() == btn2) {
      c.setBackground(java.awt.Color.RED);
    }
    if (e.getSource() == btn3) {
      c.setBackground(java.awt.Color.GREEN);
    }
    if (e.getSource() == btn4) {
      c.setBackground(java.awt.Color.PINK);
    }
    if (e.getSource() == btn5)
      c.setBackground(java.awt.Color.CYAN);
  }
  
  static void makeorange(java.awt.event.ActionEvent paramActionEvent) {
    throw new Error("Unresolved compilation problem: \n\tCannot make a static reference to the non-static field btn6\n");
  }
}
