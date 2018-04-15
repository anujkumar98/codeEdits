package book_1;

import javax.swing.JLabel;

class login_form extends javax.swing.JFrame implements java.awt.event.ActionListener
{
  static java.awt.Container c;
  JLabel userlabel = new JLabel("Username:");
  JLabel password = new JLabel("Password:");
  javax.swing.JTextField user_tf = new javax.swing.JTextField();
  javax.swing.JPasswordField pass_tf = new javax.swing.JPasswordField();
  javax.swing.JButton login_btn = new javax.swing.JButton("Login");
  JLabel wrn = new JLabel("Wrong User name or Password");
  JLabel log = new JLabel("Acess Granted");
  
  login_form() {
    password.setBounds(100, 200, 300, 40);
    userlabel.setBounds(100, 100, 300, 40);
    pass_tf.setBounds(300, 200, 300, 40);
    user_tf.setBounds(300, 100, 300, 40);
    login_btn.setBounds(200, 300, 200, 50);
    c = getContentPane();
    c.setLayout(null);
    java.awt.Font f = new java.awt.Font("Ariel", 1, 25);
    userlabel.setFont(f);
    password.setFont(f);
    user_tf.setFont(f);
    pass_tf.setFont(f);
    login_btn.setFont(f);
    userlabel.setForeground(java.awt.Color.CYAN);
    password.setForeground(java.awt.Color.CYAN);
    pass_tf.setForeground(java.awt.Color.BLACK);
    user_tf.setForeground(java.awt.Color.BLACK);
    login_btn.setForeground(java.awt.Color.BLACK);
    c.setBackground(java.awt.Color.BLACK);
    login_btn.addActionListener(this);
    c.add(password);
    c.add(userlabel);
    c.add(user_tf);
    c.add(login_btn);
    c.add(pass_tf);
  }
  
  public void actionPerformed(java.awt.event.ActionEvent e) { java.awt.Font ff = new java.awt.Font("Ariel", 1, 25);
    if (e.getSource() == login_btn) {
      String username = user_tf.getText();
      String password = pass_tf.getText();
      if ((username.equalsIgnoreCase("abc")) && (password.equalsIgnoreCase("123"))) {
        c.setBackground(java.awt.Color.GREEN);
        log.setBounds(150, 400, 500, 50);
        c.add(log);
        log.setFont(ff);
        log.setForeground(java.awt.Color.CYAN);
        c.remove(wrn);
      }
      else {
        c.setBackground(java.awt.Color.RED);
        wrn.setBounds(150, 400, 500, 50);
        c.add(wrn);
        wrn.setFont(ff);
        wrn.setForeground(java.awt.Color.CYAN);
      }
    }
  }
}
