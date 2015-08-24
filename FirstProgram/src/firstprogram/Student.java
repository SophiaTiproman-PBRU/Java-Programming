/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprogram;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class Student {
    private String name;    //Data member
    private int age;        //Data Member
    
//  Create Method   
    
//    public void setData(){
//        name = "Porntip";
//        age = 25;
//    }
    
    public void setData(String n,int a){
        name = n;
        age = a;
    }
    
    public void getData(){
        System.out.println("My name is "+name);
        System.out.println("I am "+age+" years old");
    }
    
    public void inputData(){
        Scanner inkey = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = inkey.nextLine();    //for input string
        System.out.print("Entr your age : ");
        age = inkey.nextInt();      //for input integer
    }
            
}
