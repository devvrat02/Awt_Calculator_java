
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devvrat
 */
public class calculator extends java.awt.Frame {
    String contain,s1,s2,s3,s4;
     String first,op,temp;
     int flag;
    /**
     *
     * Creates new form calculator
     */
    public calculator() {
        initComponents();
        flag =1;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        equation = new java.awt.TextField();
        b0 = new java.awt.Button();
        b1 = new java.awt.Button();
        b2 = new java.awt.Button();
        b3 = new java.awt.Button();
        b4 = new java.awt.Button();
        b5 = new java.awt.Button();
        b6 = new java.awt.Button();
        b7 = new java.awt.Button();
        b8 = new java.awt.Button();
        b9 = new java.awt.Button();
        b_div = new java.awt.Button();
        b_mul = new java.awt.Button();
        b_equal = new java.awt.Button();
        b_dot = new java.awt.Button();
        b_minus = new java.awt.Button();
        b_add1 = new java.awt.Button();
        back = new java.awt.Button();
        Clean = new java.awt.Button();
        t2 = new java.awt.TextField();

        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 300, 800));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(400, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        setLayout(null);

        equation.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        equation.setEditable(false);
        equation.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        equation.setName("eq"); // NOI18N
        equation.setText("calculate");
        equation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(equation);
        equation.setBounds(40, 80, 360, 40);

        b0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b0.setLabel("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        b0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b0);
        b0.setBounds(140, 370, 70, 40);

        b1.setLabel("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        b1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b1);
        b1.setBounds(40, 310, 70, 40);

        b2.setActionCommand("2");
        b2.setLabel("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        b2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b2);
        b2.setBounds(140, 310, 70, 40);

        b3.setLabel("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        b3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b3);
        b3.setBounds(230, 310, 70, 40);

        b4.setLabel("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        b4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b4);
        b4.setBounds(40, 260, 70, 40);

        b5.setLabel("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        b5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b5);
        b5.setBounds(140, 260, 70, 40);

        b6.setActionCommand("7");
        b6.setLabel("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        b6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b6);
        b6.setBounds(230, 260, 70, 40);

        b7.setActionCommand("7");
        b7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b7.setLabel("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        b7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b7);
        b7.setBounds(40, 200, 70, 40);

        b8.setLabel("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        b8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b8);
        b8.setBounds(140, 200, 70, 40);

        b9.setLabel("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        b9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b9);
        b9.setBounds(230, 200, 70, 40);

        b_div.setLabel("/");
        b_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_divActionPerformed(evt);
            }
        });
        b_div.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b_div);
        b_div.setBounds(330, 200, 70, 40);

        b_mul.setLabel("*");
        b_mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mulActionPerformed(evt);
            }
        });
        b_mul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b_mul);
        b_mul.setBounds(330, 260, 70, 40);

        b_equal.setLabel("=");
        b_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_equalActionPerformed(evt);
            }
        });
        b_equal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b_equal);
        b_equal.setBounds(330, 370, 70, 40);

        b_dot.setLabel(".");
        b_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_dotActionPerformed(evt);
            }
        });
        b_dot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b_dot);
        b_dot.setBounds(40, 370, 70, 40);

        b_minus.setLabel("-");
        b_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_minusActionPerformed(evt);
            }
        });
        b_minus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b_minus);
        b_minus.setBounds(230, 370, 70, 40);

        b_add1.setLabel("+");
        b_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_add1ActionPerformed(evt);
            }
        });
        b_add1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(b_add1);
        b_add1.setBounds(330, 310, 70, 40);

        back.setLabel("B");
        back.setName(""); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        back.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(back);
        back.setBounds(230, 140, 70, 40);

        Clean.setLabel("C");
        Clean.setName(""); // NOI18N
        Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanActionPerformed(evt);
            }
        });
        Clean.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(Clean);
        Clean.setBounds(330, 140, 70, 40);

        t2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t2.setEditable(false);
        t2.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        t2.setText("calculate");
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        add(t2);
        t2.setBounds(40, 140, 170, 40);

        pack();
    }// </editor-fold>

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {
        System.exit(0);
    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
            StringBuffer erase =new  StringBuffer(equation.getText());
            erase.reverse();
            erase.deleteCharAt(0);
            erase.reverse();
            String x = new String(erase);
            equation.setText(x);
            t2.setText(x);
    }

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(flag==1){
        equation.setText(" ");
        t2.setText(" ");
        flag=0;
        }
        equation.setText(equation.getText()+"7");
        t2.setText(t2.getText()+"7");
    }

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
                if(flag==1){
        equation.setText(" ");
        t2.setText(" ");
        flag=0;
        }
        equation.setText(equation.getText()+"8");
         t2.setText(t2.getText()+"8");
    }

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
                if(flag==1){
        equation.setText(" ");
        t2.setText(" ");
        flag=0;
        }
        equation.setText(equation.getText()+"9");
         t2.setText(t2.getText()+"9");
    }

    private void b_divActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
                if(flag==1){
        equation.setText(" ");
        t2.setText(" ");
        flag=0;
        }
        first=equation.getText();
   op="/";
   equation.setText("");
   t2.setText(t2.getText()+"/");
    }

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
                if(flag==1){
        equation.setText(" ");
        t2.setText(" ");
        flag=0;
        }
        equation.setText(equation.getText()+"4");
         t2.setText(t2.getText()+"4");
    }

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
                if(flag==1){
        equation.setText(" ");
        t2.setText(" ");
        flag=0;
        }
        equation.setText(equation.getText()+"5");
         t2.setText(t2.getText()+"5");
    }

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
                if(flag==1){
        equation.setText(" ");
        t2.setText(" ");
        flag=0;
        }
        equation.setText(equation.getText()+"6");
         t2.setText(t2.getText()+"6");
    }

    private void b_mulActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
                if(flag==1){
        equation.setText(" ");
        t2.setText(" ");
        flag=0;
        }
        first=equation.getText();
   op="*";
   equation.setText("");
   t2.setText(t2.getText()+"*");
    }

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
                if(flag==1){
        equation.setText(" ");
        t2.setText(" ");
        flag=0;
        }
        equation.setText(equation.getText()+"1");
         t2.setText(t2.getText()+"1");
    }

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
                if(flag==1){
        equation.setText(" ");
        t2.setText(" ");
        flag=0;
        }
        equation.setText(equation.getText()+"2");
         t2.setText(t2.getText()+"2");
    }

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
                if(flag==1){
        equation.setText(" ");
        t2.setText(" ");
        flag=0;
        }
         equation.setText(equation.getText()+"3");
         t2.setText(t2.getText()+"3");
    }

    private void b_equalActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
           float x=Float.parseFloat(first);
   float y=Float.parseFloat(equation.getText());
   float z=0.0f;
   if(op.equals("+"))
   {
   z=x+y;
   }
   if(op.equals("-"))
   {
   z=x-y;
   }
   if(op.equals("*"))
   {
   z=x*y;
   }
   if(op.equals("/"))
   {
   z=x/y;
   }
   equation.setText(""+z);
   t2.setText(""+z);
   flag=1;
    }

    private void b_dotActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
                if(flag==1){
        equation.setText(" ");
        t2.setText(" ");
        flag=0;
        }
         equation.setText(equation.getText()+".");
         t2.setText(t2.getText()+".");
    }

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
                if(flag==1){
        equation.setText("");
        t2.setText("");
        flag=0;
        }
        equation.setText(equation.getText()+"0");
        t2.setText(t2.getText()+"0");
    }

    private void b_minusActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
                if(flag==1){
        equation.setText("");
        t2.setText("");
        flag=0;
        }
        first=equation.getText();
   op="-";
   equation.setText("");
   t2.setText(t2.getText()+"-");
    }

    private void CleanActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
                if(flag==1){
        equation.setText("");
        t2.setText("");
        flag=0;
        }
        equation.setText(" ");
         t2.setText("");
    }

    private void b_add1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
           first=equation.getText();
   op="+";
   equation.setText("");
   t2.setText(t2.getText()+"+");
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_0||evt.getKeyCode()==KeyEvent.VK_NUMPAD0)
        {
        if(flag==1){
        equation.setText("");
        t2.setText("");
        flag=0;
        }
        equation.setText(equation.getText()+"0");
        t2.setText(t2.getText()+"0");
        }
         if(evt.getKeyCode()==KeyEvent.VK_1||evt.getKeyCode()==KeyEvent.VK_NUMPAD1)
        {
        if(flag==1){
        equation.setText("");
        t2.setText("");
        flag=0;
        }
        equation.setText(equation.getText()+"1");
        t2.setText(t2.getText()+"1");
        }
          if(evt.getKeyCode()==KeyEvent.VK_2||evt.getKeyCode()==KeyEvent.VK_NUMPAD2)
        {
        if(flag==1){
        equation.setText("");
        t2.setText("");
        flag=0;
        }
        equation.setText(equation.getText()+"2");
        t2.setText(t2.getText()+"2");
        }
           if(evt.getKeyCode()==KeyEvent.VK_3||evt.getKeyCode()==KeyEvent.VK_NUMPAD3)
        {
        if(flag==1){
        equation.setText("");
        t2.setText("");
        flag=0;
        }
        equation.setText(equation.getText()+"3");
        t2.setText(t2.getText()+"3");
        }
            if(evt.getKeyCode()==KeyEvent.VK_4||evt.getKeyCode()==KeyEvent.VK_NUMPAD4)
        {
        if(flag==1){
        equation.setText("");
        t2.setText("");
        flag=0;
        }
        equation.setText(equation.getText()+"4");
        t2.setText(t2.getText()+"4");
        }
             if(evt.getKeyCode()==KeyEvent.VK_5||evt.getKeyCode()==KeyEvent.VK_NUMPAD5)
        {
        if(flag==1){
        equation.setText("");
        t2.setText("");
        flag=0;
        }
        equation.setText(equation.getText()+"5");
        t2.setText(t2.getText()+"5");
       }
              if(evt.getKeyCode()==KeyEvent.VK_6||evt.getKeyCode()==KeyEvent.VK_NUMPAD6)
        {
        if(flag==1){
        equation.setText("");
        t2.setText("");
        flag=0;
        }
        equation.setText(equation.getText()+"6");
        t2.setText(t2.getText()+"6");
        }
               if(evt.getKeyCode()==KeyEvent.VK_7||evt.getKeyCode()==KeyEvent.VK_NUMPAD7)
        {
        if(flag==1){
        equation.setText("");
        t2.setText("");
        flag=0;
        }
        equation.setText(equation.getText()+"7");
        t2.setText(t2.getText()+"7");
        }
                if(evt.getKeyCode()==KeyEvent.VK_8||evt.getKeyCode()==KeyEvent.VK_NUMPAD8)
        {
        if(flag==1){
        equation.setText("");
        t2.setText("");
        flag=0;
        }
        equation.setText(equation.getText()+"8");
        t2.setText(t2.getText()+"8");
        }
                 if(evt.getKeyCode()==KeyEvent.VK_9||evt.getKeyCode()==KeyEvent.VK_NUMPAD9)
        {
        if(flag==1){
        equation.setText("");
        t2.setText("");
        flag=0;
        }
        equation.setText(equation.getText()+"9");
        t2.setText(t2.getText()+"9");
        }
                 if(evt.getKeyCode()==KeyEvent.VK_MULTIPLY)
        {
            first=equation.getText();
   op="*";
   equation.setText("");
   t2.setText(t2.getText()+"*");
        }
                 if(evt.getKeyCode()==KeyEvent.VK_ADD)
        {
                   first=equation.getText();
   op="+";
   equation.setText("");
   t2.setText(t2.getText()+"+");
        }
                 if(evt.getKeyCode()==KeyEvent.VK_MINUS)
        {
        first=equation.getText();
           op="-";
           equation.setText("");
           t2.setText(t2.getText()+"-");
        }
                 if(evt.getKeyCode()==KeyEvent.VK_DIVIDE)
        {
                   first=equation.getText();
   op="/";
   equation.setText("");
   t2.setText(t2.getText()+"/");
        }
                 if(evt.getKeyCode()==KeyEvent.VK_DECIMAL)
        {
              if(flag==1){
        equation.setText("");
        t2.setText("");
        flag=0;
        }
        equation.setText(equation.getText()+".");
        t2.setText(t2.getText()+".");
        }


                 if(evt.getKeyCode()==KeyEvent.VK_ENTER||evt.getKeyCode()==KeyEvent.VK_EQUALS)
        {
                    // TODO add your handling code here:
flag=1;
            float x=Float.parseFloat(first);
   float y=Float.parseFloat(equation.getText());
   float z=0.0f;
   if(op.equals("+"))
   {
   z=x+y;
   }
   if(op.equals("-"))
   {
   z=x-y;
   }
   if(op.equals("*"))
   {
   z=x*y;
   }
   if(op.equals("/"))
   {
   z=x/y;
   }
   equation.setText(""+z);
    t2.setText(""+z);
        }
   if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE)
   {
     StringBuffer  erase =new  StringBuffer(equation.getText());
            erase.reverse();
            erase.deleteCharAt(0);
            erase.reverse();
            String x = new String(erase);
            equation.setText(x);
            t2.setText(x);
   }
   if(evt.getKeyCode()==KeyEvent.VK_DELETE)
   {                if(flag==1){
        equation.setText("");
        t2.setText("");
        flag=0;
        }
        equation.setText(" ");
         t2.setText("");
   }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new calculator().setVisible(true);
        });
    }


    // Variables declaration - do not modify
    private java.awt.Button Clean;
    private java.awt.Button b0;
    private java.awt.Button b1;
    private java.awt.Button b2;
    private java.awt.Button b3;
    private java.awt.Button b4;
    private java.awt.Button b5;
    private java.awt.Button b6;
    private java.awt.Button b7;
    private java.awt.Button b8;
    private java.awt.Button b9;
    private java.awt.Button b_add1;
    private java.awt.Button b_div;
    private java.awt.Button b_dot;
    private java.awt.Button b_equal;
    private java.awt.Button b_minus;
    private java.awt.Button b_mul;
    private java.awt.Button back;
    private java.awt.TextField equation;
    private java.awt.TextField t2;
    // End of variables declaration
}
