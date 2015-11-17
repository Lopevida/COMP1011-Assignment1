/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.*;
import ap.*;
import Employees.*;


/**
 *
 * @author chaod
 */
public class PayableDemo {
    public static void main(String[] a){
        ArrayList<Payable> myArray = new ArrayList();
        myArray.add(new Invoice("","",1,1.1));
        myArray.add(new FullTimeEmp("Tony","Persson",50,2013,10,9,40.25,30,100,200));
        
        for (Payable i : myArray) {
            System.out.println(i.toString());
            System.out.println(i.getPaymentAmount());
        }
        
    }
}
