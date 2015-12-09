
package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author chaod
 */
public class ButtonPanel extends JPanel
{
    private final JButton buttonExit;
    ButtonPanel()
    {
        this.buttonExit = new JButton("EXIT");
        buttonExit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
      
        add(buttonExit);       
    }
}
