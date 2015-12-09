/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author chaod
 */
public class TextFieldFrame extends JFrame implements ActionListener {
   
    private final JLabel label1;
    private final JLabel  label2;
    private final JLabel  label3;
    private final JTextField jf1;
    private final JTextField jf2;
    private final JPasswordField jf3;
    
    
    public TextFieldFrame(){
        super(" GUI!");
        setLayout(new FlowLayout());
        label1 = new JLabel("First Name");
        label2 = new JLabel("Use Name");
        label3 = new JLabel("Password");
        jf1  = new JTextField(10);
        jf2  = new JTextField("Enter a user name");
        jf3  = new JPasswordField(10);
       
        
        
        add(label1);
        add(jf1);
        add(label2);
        add(jf2);
        add(label3);
        add(jf3);
       // new TextFieldHandler();
      //  TextFieldHandler tf = new TextFieldHandler();
        jf1.addActionListener(this);
        jf2.addActionListener(this);
        jf3.addActionListener(this);        
    }
    
        @Override
        public void actionPerformed(ActionEvent e){
          String myString = "";
            if (e.getSource()==jf1) {
                myString = String.format("fname:%s",e.getActionCommand());
            }else if(e.getSource()==jf2) {
                myString = String.format("username:%s",e.getActionCommand());
            }else if(e.getSource()==jf3) {
                myString = String.format("password:%s",e.getActionCommand());
            }
            JOptionPane.showMessageDialog(null, myString);
        }    
}
