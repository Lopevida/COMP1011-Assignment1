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
public class PartTimeEmp extends Employee{
   private double hour,hourlySalary;
   public PartTimeEmp(){
       
   }
    public PartTimeEmp(String fName,String lName,int age,int year,int month,int day,double hour,double hourlySalary)
    { 
        super( fName, lName, age, year, month, day);
        this.hourlySalary = hourlySalary;
        this.hour = hour;
    }
    
     @Override
     public String toString(){
        return  super.toString()+ "\nSalary:\t\t$" + getSalary();
    }
    
     //accessor
    @Override
    public double getSalary(){
        return hour* hourlySalary;
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
}
