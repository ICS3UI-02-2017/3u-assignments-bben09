/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A7QN;

import java.util.Scanner;

/**
 *
 * @author daupb7975
 */
public class A7Q2 {
    
public static void ExamGrade(double r){
    //if loops which output the corresponding letter grade whether the percent grade is in their margain
    if(r<50){
        System.out.println("F");
    }
    if(r>=50 && r<60){
        System.out.println("D");
    }
    if(r>=60 && r<70){
        System.out.println("C");
    }
    if(r>=70 && r<80){
        System.out.println("B");
    }
    if(r>=80){
        System.out.println("A");
    }
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner to read users input
        Scanner input = new Scanner(System.in);
        
        //ask user for the percent grade
        System.out.println("What was the percentage grade?");
        
        //store the percent grade
        double grade = input.nextDouble();
       
        //put the grade through the method
        ExamGrade(grade);
     
    }
}
