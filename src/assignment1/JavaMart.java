/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import Employees.*;
import Inventory.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
       int tempInt = 0;
       String tempString;

       // teller start
       do{
          flag2=true;
          flag3 =true;
        System.out.println("----------------------------");
        System.out.println("Hello, Welcome to JAVAMART");
        System.out.println("Enter 1: Manage employees ");
        System.out.println("Enter 2: Manage products");
        System.out.println("Enter 0: EXIT");     
       // tempInt =Integer.parseInt(myScan.nextLine()) ;
        
        try{
        tempString = myScan.nextLine();
           if (tempString.matches("?\\d+(\\.\\d+)?")) {
               tempInt = Integer.parseInt(tempString);
           }
           else{
               throw new NumberFormatException();
           }
           System.out.println("test");
           
        }
        catch(NumberFormatException|InputMismatchException error){
            System.err.println("Error"+error.toString());
        }
        catch(Exception error){
            System.err.println("Error"+error.toString());
        }
        finally{
            // this code will always run
        }
        switch(tempInt)
        {
          case 0:
           flag1=false; 
          break;
          case 1: 
            while(flag2) 
            {
                System.out.println("----------------------------");
                System.out.println("Hello, Welcome to Employee");
                System.out.println("Enter 1: Add a new employee");
                System.out.println("Enter 2: Search an existing employee");
                System.out.println("Enter 0: Go back to menu");
                // add try catch block
                
                try  
                {
              //     tempInt = Integer.parseInt(myScan.nextLine());
                    getInput();
      
                }
                catch(NumberFormatException error){
                    System.err.println("Error:" + error.getMessage());
                    error.printStackTrace();
                    StackTraceElement [] traceE = error.getStackTrace();
                    for (StackTraceElement element:traceE) 
                    {
                        System.out.printf("%s\t",element.getClassName());
                        System.out.printf("%s\t",element.getFileName());
                        System.out.printf("%s\t",element.getLineNumber());
                        System.out.printf("%s\t",element.getMethodName());
                        
                    }
                    
                }
                catch(Exception error)
                { 
                    System.err.println("Error"+error.toString());
                }
                if (tempInt == 1)
                    {
                        // define some variables for storing input values.
                         int age,year,day,month;
                         String fName,lName;
                         double hourlySalary,hour,allowance,bonus;
                         System.out.println("----------------------------");
                         System.out.println("Which kind you want to choose");
                         System.out.println("Enter 1: Part Time Employee");
                         System.out.println("Enter 2: Seasonal Employee");
                         System.out.println("Enter 3: Full Time Employee");
                         tempInt = Integer.parseInt(myScan.nextLine());
                         switch(tempInt)
                         {                          
                             case 1:                                         
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
                                 if(validator(age,year,month,day,hour,hourlySalary))
                                 {
                                    Employee ptEmp = new PartTimeEmp(fName,lName,age,year,month,day,hour,hourlySalary);                             
                                    empList.add(ptEmp);
                                 }else
                                 {
                                    System.out.println("process failed because of invalid input"); 
                                 }
                                 break;
                             case 2:                              
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
                                 if (validator(age,year,month,day,hour,hourlySalary,bonus)) 
                                 {
                                   Employee seasonEmp = new SeasonalEmp(fName,lName,age,year,month,day,hour,hourlySalary,bonus);
                                   empList.add(seasonEmp);  
                                 }
                                 else{
                                    System.out.println("process failed because of invalid input"); 
                                 }
                                 
                                 break;
                             case 3:                           
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
                                 if (validator(age,year,month,day,hour,hourlySalary,bonus,allowance)) 
                                 {
                                     Employee ftEmp = new FullTimeEmp(fName,lName,age,year,month,day,hour,hourlySalary,bonus,allowance);
                                     empList.add(ftEmp);
                                 }else
                                 {
                                      System.out.println("process failed because of invalid input"); 
                                 }
                                 
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
                System.out.println("----------------------------");
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
//   validator(age,year,month,day,hour,hourlySalary);
public static boolean validator(int age,int year,int month,int day,double hour,double hourlySalary){
    boolean validator =true;
    if(age<0||hour<0||hourlySalary<0)
    {
       validator = false;
       System.out.println("Age,hour,hourly Salary cannot be nagetive");
    }

    if(year>2100||year<1900)
    {
         validator = false;
         System.out.println("Must be a valid year");
    }
    if(month<0||month>12)
    {
        validator = false;
         System.out.println("Must be a valid month");
    }
    if(day<0||day>31)
    {
        validator = false;
         System.out.println("Must be a valid day");
    }
    return validator;
}

   public static boolean validator(int age,int year,int month,int day,double hour,double hourlySalary,double bonus){
       boolean validator = true;
        if(age<0||hour<0||hourlySalary<0||bonus<0)
    {
       validator = false;
       System.out.println("Age,hour,hourly Salary,bonus cannot be nagetive");
    }

    if(year>2100||year<1900)
    {
         validator = false;
         System.out.println("Must be a valid year");
    }
    if(month<0||month>12)
    {
        validator = false;
         System.out.println("Must be a valid month");
    }
    if(day<0||day>31)
    {
        validator = false;
         System.out.println("Must be a valid day");
    }
       return validator;
   }
   public static boolean validator(int age,int year,int month,int day,double hour,double hourlySalary,double bonus,double allowcance){
       boolean validator = true;
        if(age<0||hour<0||hourlySalary<0||bonus<0||allowcance<0)
    {
       validator = false;
       System.out.println("Age,hour,hourly Salary,bonus cannot be nagetive");
    }

    if(year>2100||year<1900)
    {
         validator = false;
         System.out.println("Must be a valid year");
    }
    if(month<0||month>12)
    {
        validator = false;
         System.out.println("Must be a valid month");
    }
    if(day<0||day>31)
    {
        validator = false;
         System.out.println("Must be a valid day");
    }
       return validator;
   }
   public static int getInput() throws InputMismatchException{
       String tempInput;
       Scanner read = new Scanner(System.in);
       int input;      
       tempInput = read.nextLine();
            if (tempInput.matches("?\\d+(\\.\\d+)?")) {
               input = Integer.parseInt(tempInput);
           }
           else{
               throw new NumberFormatException();
           }
       return input;
   }
}
