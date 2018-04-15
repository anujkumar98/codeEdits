package book_1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Calculator
{
  static javax.swing.JFrame frame;
  static Container c;
  static JButton btn1;
  static JButton btn2;
  static JButton btn3;
  static JButton btn4;
  static JButton btn5;
  static JButton btn6;
  static JButton btn7;
  static JButton btn8;
  static JButton btn9;
  static JButton btn0;
  static JButton btn_add;
  static JButton btn_sub;
  static JButton btn_mul;
  static JButton btn_div;
  static JButton btn_dec;
  static JButton btn_equal;
  static JButton btn_ans;
  static JButton btn_mod;
  static JButton btn_per;
  static JLabel display;
  static String str = "";
  static double res;
  static double temp;
  static char ch;
  static int counter = 1;
  static double ans = 0.0D;
  

  public Calculator() {}
  
  public static void main(String[] args)
  {
    frame = new javax.swing.JFrame();
    frame.setTitle("Calculator");
    frame.setDefaultCloseOperation(3);
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setLocation(500, 300);
    c = frame.getContentPane();
    frame.setLayout(null);
    btn1 = new JButton("1");
    btn2 = new JButton("2");
    btn3 = new JButton("3");
    btn4 = new JButton("4");
    btn5 = new JButton("5");
    btn6 = new JButton("6");
    btn7 = new JButton("7");
    btn8 = new JButton("8");
    btn9 = new JButton("9");
    btn0 = new JButton("0");
    btn_add = new JButton("+");
    btn_sub = new JButton("-");
    btn_mul = new JButton("*");
    btn_div = new JButton("/");
    btn_dec = new JButton(".");
    btn_equal = new JButton("=");
    btn_ans = new JButton("Ans");
    btn_mod = new JButton("Mod");
    btn_per = new JButton("%");
    display = new JLabel("");
    


    java.awt.Dimension screensize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    frame.setSize(width / 3, height / 2);
    



    btn7.setBounds(25, 140, 100, 70);
    btn8.setBounds(145, 140, 100, 70);
    btn9.setBounds(265, 140, 100, 70);
    btn_div.setBounds(385, 140, 100, 70);
    btn_ans.setBounds(505, 140, 100, 70);
    btn4.setBounds(25, 230, 100, 70);
    btn5.setBounds(145, 230, 100, 70);
    btn6.setBounds(265, 230, 100, 70);
    btn_mul.setBounds(385, 230, 100, 70);
    btn_mod.setBounds(505, 230, 100, 70);
    btn1.setBounds(25, 320, 100, 70);
    btn2.setBounds(145, 320, 100, 70);
    btn3.setBounds(265, 320, 100, 70);
    btn_sub.setBounds(385, 320, 100, 70);
    btn_per.setBounds(505, 320, 100, 70);
    btn_dec.setBounds(25, 410, 100, 70);
    btn0.setBounds(145, 410, 100, 70);
    btn_equal.setBounds(265, 410, 100, 70);
    btn_add.setBounds(385, 410, 220, 70);
    display.setBounds(20, 20, 590, 100);
    


    java.awt.Font f = new java.awt.Font("Century", 1, 30);
    java.awt.Font ff = new java.awt.Font("Century", 1, 80);
    btn0.setFont(f);
    btn1.setFont(f);
    btn2.setFont(f);
    btn3.setFont(f);
    btn4.setFont(f);
    btn5.setFont(f);
    btn6.setFont(f);
    btn7.setFont(f);
    btn8.setFont(f);
    btn9.setFont(f);
    btn_add.setFont(f);
    btn_sub.setFont(f);
    btn_mul.setFont(f);
    btn_div.setFont(f);
    btn_equal.setFont(f);
    btn_dec.setFont(f);
    btn_ans.setFont(f);
    btn_mod.setFont(f);
    btn_per.setFont(f);
    display.setFont(ff);
    

    int R = (int)(Math.random() * 256.0D);
    int B = (int)(Math.random() * 256.0D);
    int G = (int)(Math.random() * 256.0D);
    java.awt.Color col = new java.awt.Color(R, B, G);
    btn0.setBackground(col);
    btn1.setBackground(col);
    btn2.setBackground(col);
    btn3.setBackground(col);
    btn4.setBackground(col);
    btn5.setBackground(col);
    btn6.setBackground(col);
    btn7.setBackground(col);
    btn8.setBackground(col);
    btn9.setBackground(col);
    btn_add.setBackground(col);
    btn_sub.setBackground(col);
    btn_div.setBackground(col);
    btn_mul.setBackground(col);
    btn_dec.setBackground(col);
    btn_equal.setBackground(col);
    btn_ans.setBackground(col);
    btn_mod.setBackground(col);
    btn_per.setBackground(col);
    javax.swing.border.Border border = javax.swing.BorderFactory.createLineBorder(col, 5);
    display.setBorder(border);
    


    c.add(btn0);
    c.add(btn1);
    c.add(btn2);
    c.add(btn3);
    c.add(btn4);
    c.add(btn5);
    c.add(btn6);
    c.add(btn7);
    c.add(btn8);
    c.add(btn9);
    c.add(btn_add);
    c.add(btn_sub);
    c.add(btn_mul);
    c.add(btn_div);
    c.add(btn_dec);
    c.add(btn_equal);
    c.add(btn_ans);
    c.add(btn_mod);
    c.add(btn_per);
    c.add(display);
    


    btn0.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.num0(event);
      }
    });
    btn1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.num1(event);
      }
    });
    btn2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.num2(event);
      }
    });
    btn3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.num3(event);
      }
    });
    btn4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.num4(event);
      }
    });
    btn5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.num5(event);
      }
    });
    btn6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.num6(event);
      }
    });
    btn7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.num7(event);
      }
    });
    btn8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.num8(event);
      }
    });
    btn9.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.num9(event);
      }
    });
    btn_add.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.op_add(event);
      }
    });
    btn_sub.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.op_sub(event);
      }
    });
    btn_mul.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.op_mul(event);
      }
    });
    btn_div.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.op_div(event);
      }
    });
    btn_equal.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.op_equal(event);
      }
    });
    btn_dec.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.op_dec(event);
      }
    });
    btn_ans.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.op_ans(event);
      }
    });
    btn_mod.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.op_mod(event);
      }
    });
    btn_per.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent event) {
        Calculator.op_per(event);
      }
    });
  }
  
  static void num0(ActionEvent event)
  {
    str += 0;
    display.setText(str); }
  
  static void num1(ActionEvent event) { str += 1;
    display.setText(str);
  }
  
  static void num2(ActionEvent event) { str += 2;
    display.setText(str);
  }
  
  static void num3(ActionEvent event) { str += 3;
    display.setText(str);
  }
  
  static void num4(ActionEvent event) { str += 4;
    display.setText(str);
  }
  
  static void num5(ActionEvent event) { str += 5;
    display.setText(str);
  }
  
  static void num6(ActionEvent event) { str += 6;
    display.setText(str);
  }
  
  static void num7(ActionEvent event) { str += 7;
    display.setText(str);
  }
  
  static void num8(ActionEvent event) { str += 8;
    display.setText(str);
  }
  
  static void num9(ActionEvent event) { str += 9;
    display.setText(str);
  }
  
  static void op_add(ActionEvent event) { display.setText(null);
    temp = Double.parseDouble(str);
    if (counter == 1) {
      res = temp;
      str = "";
      ch = '+';
      counter += 1;
    }
    else if (counter == 2) {
      res += temp;
      str = "";
      ch = '+';
      counter = 1;
      ans = res;
    }
  }
  
  static void op_sub(ActionEvent event) { display.setText(null);
    temp = Double.parseDouble(str);
    if (counter == 1) {
      res = temp;
      str = "";
      ch = '-';
      counter += 1;
    }
    else if (counter == 2) {
      res -= temp;
      str = "";
      ch = '-';
      counter = 1;
      ans = res;
    }
  }
  
  static void op_mul(ActionEvent event) { display.setText(null);
    temp = Double.parseDouble(str);
    if (counter == 1) {
      res = temp;
      str = "";
      ch = '*';
      counter += 1;
    }
    else if (counter == 2) {
      res *= temp;
      str = "";
      ch = '*';
      counter = 1;
      ans = res;
    }
  }
  
  static void op_div(ActionEvent event) { display.setText(null);
    temp = Double.parseDouble(str);
    if (counter == 1) {
      res = temp;
      str = "";
      ch = '/';
      counter += 1;
    }
    else if (counter == 2) {
      res /= temp;
      str = "";
      ch = '/';
      counter = 1;
      ans = res;
    }
  }
  
  static void op_per(ActionEvent event) { display.setText(null);
    temp = Double.parseDouble(str);
    if (counter == 1) {
      res = temp;
      str = "";
      ch = '%';
      counter += 1;
    }
    else if (counter == 2) {
      res = res / temp * 100.0D;
      str = "";
      ch = '$';
      counter = 1;
      ans = res;
    }
  }
  
  static void op_mod(ActionEvent event) { display.setText(null);
    temp = Double.parseDouble(str);
    if (counter == 1) {
      res = temp;
      str = "";
      ch = '%';
      counter += 1;
    }
    else if (counter == 2) {
      res %= temp;
      str = "";
      ch = '%';
      counter = 1;
      ans = res;
    }
  }
  
  static void op_equal(ActionEvent event) { switch (ch) {
    case '+': 
      op_add(event);
      if (res % 1.0D == 0.0D)
      {
        display.setText(Integer.toString((int)res));
        res = 0.0D;
      }
      else {
        display.setText(Double.toString(res));
        res = 0.0D;
      }
      break;
    case '-': 
      op_sub(event);
      if (res % 1.0D == 0.0D) {
        display.setText(Integer.toString((int)res));
        res = 0.0D;
      }
      else {
        display.setText(Double.toString(res));
        res = 0.0D;
      }
      break;
    case '*': 
      op_mul(event);
      if (res % 1.0D == 0.0D) {
        display.setText(Integer.toString((int)res));
        res = 0.0D;
      }
      else {
        display.setText(Double.toString(res));
        res = 0.0D;
      }
      break;
    case '/': 
      op_div(event);
      if (res % 1.0D == 0.0D) {
        display.setText(Integer.toString((int)res));
        res = 0.0D;
      }
      else {
        display.setText(Double.toString(res));
        res = 0.0D;
      }
      break;
    case '%': 
      op_mod(event);
      if (res % 1.0D == 0.0D) {
        display.setText(Integer.toString((int)res));
        res = 0.0D;
      }
      else {
        display.setText(Double.toString(res));
        res = 0.0D;
      }
      break;
    case '$': 
      op_per(event);
      if (res % 1.0D == 0.0D) {
        display.setText(Integer.toString((int)res) + "%");
        res = 0.0D;
      }
      else {
        display.setText(Double.toString(res) + "%");
        res = 0.0D;
      }
      break;
    }
  }
  
  static void op_dec(ActionEvent event) {
    str += ".";
    display.setText(str);
  }
  
  static void op_ans(ActionEvent event) {
    if (ans % 1.0D == 0.0D) {
      str = Integer.toString((int)ans);
      display.setText(str);
    }
    else {
      str = Double.toString(ans);
      display.setText(str);
    }
  }
}
