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
        double balance = (Math.pow(intRate + 1, numYears))*initial;
        System.out.println("The balance is " + balance);
        return 0;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the principal ammount:");
        
        double initial = input.nextDouble();
        
        System.out.println("Enter the decimal percent interest rate:");
        
        double intRate = input.nextDouble();
        
        System.out.println("Enter the number of years:");
        
        double numYears = input.nextDouble();
        
        compoundInterest(initial, intRate, numYears);
    }
}
