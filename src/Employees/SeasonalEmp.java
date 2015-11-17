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
public class SeasonalEmp extends Employee {
   private  double bonus,hourlySalary,hour;
     public SeasonalEmp(){
         
     }
     public SeasonalEmp(String fName,String lName,int age,int year,int month,int day,double hour,double hourlySalary,double bonus)
    { 
        super( fName, lName, age, year, month, day);
        this.hour = hour;
        this.hourlySalary = hourlySalary;
        this.bonus = bonus;
    }
     
         @Override
     public String toString(){
        return  super.toString()+"\nBonus:\t\t"+getBonus()+"\nSalary:\t\t$" + getPaymentAmount();
    }
     
     
          //accessor
    public double getBonus(){
        return bonus;
    }
    
    public double getHour(){
         return hour;
     }
    public double getHourlySalary(){
        return hourlySalary;
    }
    @Override
    public double getPaymentAmount(){
        return hourlySalary*hour+bonus;
    }

       //mutator
     
     public void setBonus(double bonus){
        this.bonus = bonus;
     }

    public void setHour(double hour){
     this.hour = hour;   
    }
      public void setHourlySalaryr(double hourlySalary){
     this.hourlySalary = hourlySalary;   
    }
}
