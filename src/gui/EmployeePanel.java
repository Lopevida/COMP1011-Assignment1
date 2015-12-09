
package gui;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author chaod
 */
public class EmployeePanel extends JPanel {
    //String fName,String lName,int age,int year,int month,int day,double hour,double hourlySalary,double bonus,double allowance
    //label
    private final JLabel lFName,lLName,lAge,lHireYear,lHireMonth,lHireday,lHourlySalary,lBonus,lAllowance;
    //textbox
    private final JTextField txtFName,txtLName,txtAge,txtSalaryRate,txtBonus,txtAllowance;
    //radiobutton and button group
    private final  ButtonGroup bg;
    private final JRadioButton rdbGenderMale,rdbGenderFemale;
    //combo box
     private final JComboBox<String> cbYear,cbMonth,cbDay ;
     
    private static final String[] year ={"2014","2015"};
    private static final String[] month = {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
    private static final String[] day= new String[31];
    public EmployeePanel()
    {
         setLayout(new GridLayout(5,2));
        this.lFName = new JLabel("First Name :");
        this.lLName = new JLabel("Last Name :");
        this.lAge = new JLabel("Age :");
        this.lHireYear = new JLabel("Year :");
        this.lHireMonth = new JLabel("Month :");
        this.lHireday = new JLabel("Day :");
        this.lHourlySalary = new JLabel("Salary Rate :");
        this.lBonus = new JLabel("Bonus :");
        this.lAllowance = new JLabel("Allowance :");
           // text boxes
        this.txtFName = new JTextField(15);
        this.txtLName = new JTextField(15);
        this.txtAge = new JTextField(2);
        this.txtSalaryRate = new JTextField(5);
        this.txtBonus = new JTextField(5);
        this.txtAllowance = new JTextField(5);
        // radio buttons
        bg = new ButtonGroup();
        rdbGenderMale = new JRadioButton("Male");
        rdbGenderFemale = new JRadioButton("Female");   
        bg.add(rdbGenderMale);
        bg.add(rdbGenderFemale);
       // combo boxes
        this.cbYear = new JComboBox(year);
        this.cbMonth = new JComboBox(month);   
        this.cbDay = new JComboBox(getDays());
      //add label to panel
        add(lFName);
        add(txtFName);
        add(lLName);
        add(txtLName);
        add(rdbGenderMale);
        add(rdbGenderFemale);
        add(lAge);
        add(txtAge);
        add(lHireYear);
        add(cbYear);
        add(lHireMonth);
        add(cbMonth);
        add(lHireday);
        add(cbDay);
        add(lHourlySalary);
        add(txtSalaryRate);
        add(lBonus);
        add(txtBonus);
        add(lAllowance);
        add(txtAllowance);
    
    }
    
  private String[] getDays()
  {          
      for (int i = 1; i <= 31; i++) {     
          day[i-1] = ""+i;
      }
      return day;
  }
    
    
 
}
