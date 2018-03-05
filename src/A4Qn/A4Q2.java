/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A4Qn;

import java.util.Scanner;

/**
 *
 * @author daupb7975
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //text to tell user to input inches
        System.out.println("Enter Measurement in Inches:");
        
        //create scanner to input inch ammount
        Scanner input = new Scanner(System.in);
       
        //integer to read input text
        int inches = input.nextInt();
        
        //text to tell user how many cm there are in there inch value
        System.out.println(inches + " inches is " + inches*2.54 + "cm");
                
    }
}
