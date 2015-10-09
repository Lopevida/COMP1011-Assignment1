/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import Employees.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chaod
 */
public class JavaMart {
    
    public static void main(String[] args) {
       Scanner myScan = new Scanner(System.in); 
       ArrayList<Employee> empList = new ArrayList<>();
       //test code 
       Employee test1 = new PartTimeEmp("Di","Zhou",23,2015,5,17,21,11.4);
       Employee test2 = new FullTimeEmp("Tony","Persson",50,2013,10,9,40.25,30,100,200);
       Employee test3 = new SeasonalEmp("Jaret","Wright",35,2010,4,5,35.75,30,200); 
       empList.add(test1);
        empList.add(test2);
         empList.add(test3);
  //     ArrayList<Product> proList = new ArrayList<>();
       boolean flag1=true,flag2=true,flag3=true;
       int tempInt;
       String tempString;

       // teller start
       do{
        System.out.println("Hello, Welcome to JAVAMART");
        System.out.println("Enter 1: Manage employees ");
        System.out.println("Enter 2: Manage products");
        System.out.println("Enter 0: EXIT");     
        tempInt =Integer.parseInt(myScan.nextLine()) ;
        switch(tempInt)
        {
          case 0:
           flag1=false; 
          break;
          case 1: 
            while(flag2) 
            {
                System.out.println("Hello, Welcome to Employee");
                System.out.println("Enter 1: Add a new employee");
                System.out.println("Enter 2: Search an existing employee");
                System.out.println("Enter 0: Go back to menu");
                 tempInt = Integer.parseInt(myScan.nextLine());
                if (tempInt == 1)
                    {
                        // define some variables for storing input values.
                         int age,year,day,month;
                         String fName,lName;
                         double hourlySalary,hour,allowance,bonus;
                         System.out.println("Which kind you want to choose");
                         System.out.println("Enter 1: Part Time Employee");
                         System.out.println("Enter 2: Seasonal Employee");
                         System.out.println("Enter 3: Full Time Employee");
                         tempInt = Integer.parseInt(myScan.nextLine());
                         switch(tempInt)
                         {                          
                             case 1:          
                                 // should add if >0 to check the user input 
                                 System.out.println("Please input First Name");
                                 fName = myScan.nextLine();
                                 System.out.println("Please input Last Name");
                                 lName = myScan.nextLine();
                                 System.out.println("Please input Age");
                                 age = Integer.parseInt(myScan.nextLine());
                                 System.out.println("Please input year month day separated by SPACE");                                 
                                 String[] arry = myScan.nextLine().split(" ");
                                 year = Integer.parseInt(arry[0]);
                                 month = Integer.parseInt(arry[1]);
                                 day = Integer.parseInt(arry[2]);
                                 System.out.println("Please input total working hours");
                                 hour = Double.parseDouble(myScan.nextLine());
                                 System.out.println("Please input hourly salary");
                                 hourlySalary = Double.parseDouble(myScan.nextLine());
                                 Employee ptEmp = new PartTimeEmp(fName,lName,age,year,month,day,hour,hourlySalary);                             
                                 empList.add(ptEmp);
                                 
                                 break;
                             case 2:
                                  // should add if >0 to check the user input 
                                 System.out.println("Please input First Name");
                                 fName = myScan.nextLine();
                                 System.out.println("Please input Last Name");
                                 lName = myScan.nextLine();
                                 System.out.println("Please input Age");
                                 age = Integer.parseInt(myScan.nextLine());
                                 System.out.println("Please input year month day separated by SPACE");                                 
                                 arry = myScan.nextLine().split(" ");
                                 year = Integer.parseInt(arry[0]);
                                 month = Integer.parseInt(arry[1]);
                                 day = Integer.parseInt(arry[2]);
                                 System.out.println("Please input total working hours");
                                 hour = Double.parseDouble(myScan.nextLine());
                                 System.out.println("Please input hourly salary");
                                 hourlySalary = Double.parseDouble(myScan.nextLine());
                                 System.out.println("Please input bonus");
                                 bonus = Double.parseDouble(myScan.nextLine());
                                 Employee seasonEmp = new SeasonalEmp(fName,lName,age,year,month,day,hour,hourlySalary,bonus);
                                 empList.add(seasonEmp);
                                 break;
                             case 3:
                                 // should add if >0 to check the user input 
                                 System.out.println("Please input First Name");
                                 fName = myScan.nextLine();
                                 System.out.println("Please input Last Name");
                                 lName = myScan.nextLine();
                                 System.out.println("Please input Age");
                                 age = Integer.parseInt(myScan.nextLine());
                                 System.out.println("Please input year month day separated by SPACE");                                 
                                 arry = myScan.nextLine().split(" ");
                                 year = Integer.parseInt(arry[0]);
                                 month = Integer.parseInt(arry[1]);
                                 day = Integer.parseInt(arry[2]);
                                 System.out.println("Please input total working hours");
                                 hour = Double.parseDouble(myScan.nextLine());
                                 System.out.println("Please input hourly salary");
                                 hourlySalary = Double.parseDouble(myScan.nextLine());
                                 System.out.println("Please input bonus");
                                 bonus = Double.parseDouble(myScan.nextLine());
                                 System.out.println("Please input allowance");
                                 allowance = Double.parseDouble(myScan.nextLine());
                                 Employee ftEmp = new FullTimeEmp(fName,lName,age,year,month,day,hour,hourlySalary,bonus,allowance);
                                 empList.add(ftEmp);
                                 break;
                             default:
                                 System.out.println("You MUST input an valid number(1,2,3)");
                                 break;
                          }
                    }
                else if  (tempInt ==2)
                    {
                        // start search 
                        System.out.println("please input employee's name(blank shows all)");
                        tempString = myScan.nextLine();
                       
                        for (int i = 0; i < empList.size(); i++) {
                            if(empList.get(i).getFullName().toLowerCase().contains(tempString.toLowerCase())==true)
                            {
                                System.out.println("#######"+empList.get(i).getFullName()+"#######");
                               System.out.println(empList.get(i).toString());
                            }
                        }
                     }
                else if(tempInt == 0)
                    {
                        flag2 =false;
                      } 
                else
                    {
                        System.out.println("You MUST input an valid number(0,1,2) ");
                    }
                }
            break;
            case 2:
              while(flag3)
              {
                System.out.println("Hello, Welcome to Products");
                System.out.println("Enter 1: Add a new Product");
                System.out.println("Enter 2: Search an existing product");
                System.out.println("Enter 0: Go back to menu");
               }
            break;
             
            default:
                System.out.println("You MUST input an valid number(0,1,2) ");
         }
       }while(flag1);
       
    }


}
