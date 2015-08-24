/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprogram;

/**
 *
 * @author Lab
 */
public class FirstProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        a=10; b=20;
        c=a+b;
        System.out.println("sum = "+c);
        Student std1 = new Student();
        
        //3 following statements can use 
        //if student.name and student.age in Student class is not private
        //std1.name = "Porntip";
        //std1.age = 25;
        //System.out.println("My name is "+std1.name);
        
        //Don't pass parameter
        //std1.setData();
        //std1.getData();
        
        //std1.setData("Porntip",25);
        //std1.getData();
        
        std1.inputData();
        std1.getData();
    }
    
}
