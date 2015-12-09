
package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author chaod
 */
public class WelComePanel extends JPanel{
        private final JLabel greeting;

    public WelComePanel()
    {
       greeting = new JLabel("welcome to JavaMart") ;
       greeting.setFont(new Font("Arial",Font.BOLD,24));
       add(greeting);
       setBorder(BorderFactory.createRaisedBevelBorder()); 
    }
}
