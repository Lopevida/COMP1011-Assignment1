/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author chaod
 */
public class withButton extends JFrame implements ActionListener{
     private final JLabel label1;
    private final JLabel  label2;
    private final JLabel  label3;
    private final JTextField jf1;
     private final JTextField jf2;
      private final JPasswordField jf3;
      private final JButton jb1;

   
    public withButton()
    {
           super(" GUI!");
        setLayout(new FlowLayout());
        label1 = new JLabel("First Name");
        label2 = new JLabel("Use Name");
        label3 = new JLabel("Password");
        jf1  = new JTextField(10);
        jf2  = new JTextField("Enter a user name");
        jf3  = new JPasswordField(10);
        jb1 = new JButton("Submit");
        
        add(label1);
        add(jf1);
        add(label2);
        add(jf2);
        add(label3);
        add(jf3);
        add(jb1);
        jb1.addActionListener(this);
     }
    public void  actionPerformed(ActionEvent e)
    {
        String tv1 =  jf1.getText();
        label1.setText(tv1);
    }
}
