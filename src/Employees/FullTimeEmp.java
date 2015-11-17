/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees;

/**
 *
 * @author chaod
 */
public class FullTimeEmp extends Employee {
    private double bonus,hour,hourlySalary,allowance;
    public FullTimeEmp(){
        
    }
     public FullTimeEmp(String fName,String lName,int age,int year,int month,int day,double hour,double hourlySalary,double bonus,double allowance)
    { 
        super( fName, lName, age, year, month, day);
        this.hour = hour;
        this.hourlySalary = hourlySalary;
        this.bonus = bonus;
        this.allowance = allowance;
    }
 
    @Override
    public String toString(){
        return  super.toString()+"\nBonus:\t\t"+getBonus()+"\nAllowance:\t\t"+getAllowance()+"\nSalary:\t\t$" + getPaymentAmount();
    }
    
    
      //accessor
       @Override
    public double getPaymentAmount(){
        return hour*hourlySalary+bonus+allowance;
    }
    public double getBonus(){
        return bonus;
    }
    public double getAllowance(){
        return allowance;
    }
     public double getHour(){
         return hour;
     }
    public double getHourlySalary(){
        return hourlySalary;
    }
    
    
    //mutator
   public void setHour(double hour){
     this.hour = hour;   
    }
      public void setHourlySalaryr(double hourlySalary){
     this.hourlySalary = hourlySalary;   
    }
      public void setBonus(double bonus){
        this.bonus = bonus;
     }
      public void setAllowance(double allowance){
          this.allowance = allowance;
      }
}
