/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import Employees.*;
import Inventory.*;
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
       ArrayList<Product> proList = new ArrayList<>();
       ArrayList<Manufacturer> manList = new ArrayList<>();

       
       //test data ********************************************************************************
       Employee test1 = new PartTimeEmp("Di","Zhou",23,2015,5,17,21,11.4);
       Employee test2 = new FullTimeEmp("Tony","Persson",50,2013,10,9,40.25,30,100,200);
       Employee test3 = new SeasonalEmp("Jaret","Wright",35,2010,4,5,35.75,30,200); 
       empList.add(test1);
       empList.add(test2);
       empList.add(test3);
       
       Product testp1 =new Product("0001","nexus6p","cellphone","Huawei","new generation",499.9);
       Product testp2 =new Product("0002","iphone6s","cellphone","Apple","new generation",599.9);
       proList.add(testp2);
       proList.add(testp1);
       
       Manufacturer man1 = new Manufacturer("01","Huawei","China","86-82413625");
       Manufacturer man2 = new Manufacturer("02","Apple","US","1-800-275-2273");
       manList.add(man1);
       manList.add(man2);
     //*********************************************************************************************  
       
       boolean flag1=true,flag2,flag3;
       int tempInt;
       String tempString;

       // teller start
       do{
          flag2=true;
          flag3 =true;
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
                        int counter=0;
                        System.out.println("please input employee's name(blank shows all)");
                        tempString = myScan.nextLine();
                       
                        for (int i = 0; i < empList.size(); i++) {
                            if(empList.get(i).getFullName().toLowerCase().contains(tempString.toLowerCase())==true)
                            {
                                System.out.println("#######"+empList.get(i).getFullName()+"#######");
                                System.out.println(empList.get(i).toString());
                                counter++;
                            }                              
                         
                        }
                        if(counter==0)
                        {
                           System.out.println("SORRY, we couldn't find what you are looking for");
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
                tempInt = Integer.parseInt(myScan.nextLine());
                if (tempInt == 0) 
                {
                    flag3=false;
                 }
                else if(tempInt ==1)
                {
                    String productId,productName,category,manufacturer,description,manufacturerAddress,manufacturerId,manufacturerTel;
                    double productPrice;
                    //String productId, String productName,String category, String manufacturer,String description,double productPrice
                     System.out.print("Please Input Product Id");
                     productId = myScan.nextLine();
                     System.out.println("Plesase Input Product Name");
                     productName =  myScan.nextLine();
                     System.out.println("Please input product category");
                     category = myScan.nextLine();
                     System.out.println("Please input manucaturer");
                     manufacturer = myScan.nextLine();
                     System.out.println("Please input product description");
                     description = myScan.nextLine();
                     System.out.println("Please input product price");
                     productPrice = Double.parseDouble(myScan.nextLine());
                     // manufacturer info
                     System.out.println("Please input Manufacturer Address");
                     manufacturerAddress = myScan.nextLine();
                     System.out.println("Please input Manufacturer ID");
                     manufacturerId = myScan.nextLine();
                     System.out.println("Please input Manufacturer Telephone Number ");
                     manufacturerTel = myScan.nextLine();
                     //add manufacturer
                     Manufacturer tempMan = new Manufacturer(manufacturerId,manufacturer,manufacturerAddress,manufacturerTel);
                     manList.add(tempMan);
                     //add product
                     Product tempPro = new Product();
                     proList.add(tempPro);
                 }
                else if(tempInt ==2)
                {
                    int counter=0;
                    System.out.println("Please Input a Product Name.");
                    tempString = myScan.nextLine();
                    for (Product p: proList) {
                        if (p.getProductName().equalsIgnoreCase(tempString))
                        {
                            //print product info
                            System.out.println("Product"+p.getProductName()+"found.");
                            System.out.println(p.toString());
                            //print manufacturer info
                            System.out.println("------------------------------------------");
                            for(Manufacturer m: manList){
                                if (m.getmName().equalsIgnoreCase(p.getManufacturer())) {
                                    System.out.println(m.toString());
                                }
                            }
                            counter++;
                        }

                    }
                    if(counter==0)
                    {
                            System.out.println("SORRY, we couldn't find what you are looking for");
                     }
      
                 }
                else
                {
                   System.out.println("You MUST input an valid number(0,1,2) ");
                }
               }
            break;
             
            default:
                System.out.println("You MUST input an valid number(0,1,2) ");
         }
       }while(flag1);
       
    }


}
