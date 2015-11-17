/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// 13200
package Employees;

import assignment1.Support;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import java.util.Date;
import java.util.GregorianCalendar;
import ap.*;


/**
 *
 * @author chaod
 */
public abstract class Employee implements Payable {
    private String fName,lName;
    private int age;
    private Date hireDate;
    public Employee(){
        
    }
    public Employee(String fName,String lName,int age,int year,int month,int day){
        GregorianCalendar cal = new GregorianCalendar(year,month-1,day);
        hireDate = cal.getTime();
        this.fName  = fName;
        this.lName = lName;
        this.age = age;
        Support.getEmpNum();       
    }
   
    @Override
 public  String toString(){
     String employeeInfo = "";

        employeeInfo += "\nName:\t\t" + getFullName();
        employeeInfo += "\nId:\t\t" + getEmpId();
        employeeInfo += "\nAge:\t\t" + getAge();
        employeeInfo += "\nHire-Date:\t" + getDateOfHire();
     
   
 
        return employeeInfo;
 }
    //mutator
    public void setfName(String fName){
        this.fName = fName;
    }
    public void setlName(String lName){
        this.lName = lName;
    }
    public void setAge(int age){
        this.age = age;
    }
    //accessor
   
    public String getfName(){
        return fName;
    } 
    public String getlName(){
        return lName;
    }
    public String getFullName(){
        return fName + " " + lName;
    }
     public int getAge(){
        return age;
    }
     public Date getDateOfHire(){
         return  hireDate;
     }
     public int getEmpId(){
         return Support.getEmpNum();
     }
   
}
