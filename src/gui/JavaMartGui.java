/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author chaod
 */
public class JavaMartGui extends JFrame {
    private JPanel westPanel,northPanel,southPanel;
    private JButton exitButton;
    public JavaMartGui()
    {       
         super("JMart");  // set Frame Name
         setLayout(new BorderLayout()); // set layout
         
         //create tabe pane object to hold tab
          JTabbedPane tabPane = new JTabbedPane();   
          // create  panel objects and add to pane
          EmployeePanel empPanel = new EmployeePanel();
          ProductPanel prdctPane = new ProductPanel();
          SearchPanel sPane = new SearchPanel();
          tabPane.add("FullTime Employee Tab", empPanel);
          tabPane.add("Product Tab", prdctPane);
          tabPane.add("Search Tab",sPane);
          
          
         
        // set layout
        northPanel = new WelComePanel();
        southPanel = new ButtonPanel();
        add(tabPane, BorderLayout.CENTER);
        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);
         

          
    }
    public static void main(String[] args)
   {
              JavaMartGui run = new JavaMartGui();
             run.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            
             run.pack(); // create a size to fit all component 
             run.setVisible(true);
              
    }
}
