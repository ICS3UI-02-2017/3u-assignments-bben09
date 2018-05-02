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
public class A7Q4 {
    public static double compoundInterest (double initial, double intRate, double numYears){
        
        //compound interest equation to calculate the balance
        double balance = (Math.pow(intRate + 1, numYears))*initial;
        
        //output the balance to the user
        System.out.println("The balance is " + balance);
        return 0;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner to read users input
        Scanner input = new Scanner(System.in);
        
        //ask user to enter the principal ammount
        System.out.println("Enter the principal ammount:");
        
        //store initial as a double 
        double initial = input.nextDouble();
        
        //ask user for the interest rate as a decimal percent
        System.out.println("Enter the decimal percent interest rate:");
        
        //store the interest rate as a double
        double intRate = input.nextDouble();
        
        //ask the user for the number of years
        System.out.println("Enter the number of years:");
        
        //store the number of years in a double
        double numYears = input.nextDouble();
        
        //use the users values in the compound interest method
        compoundInterest(initial, intRate, numYears);
    }
}
