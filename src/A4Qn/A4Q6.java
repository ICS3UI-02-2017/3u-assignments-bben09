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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //Tell user to input speed and speed limit and make them integers
        System.out.println("Please enter the speed limit:");
        int limit = input.nextInt();
        System.out.println("Please enter your speed:");
        int speed = input.nextInt();
        
        //make an integer to see how much over the limit they are
        int fine = (speed - limit);

       
           //if loops to register the speed over the limit and tell them what the fine is
            if(fine < 0) {
                System.out.println("Congradulations you are within the speed limit.");
            }
              if(fine > 0 && fine <21){
                System.out.println("You are speeding your fine is $100.");
            }

             if (fine >= 21 && fine < 31) {
                System.out.println("You are speeding and your fine is $270.");

            }
             if (fine >= 31) {
                System.out.println("You are speeding and your fine is $500.");
            }
           
              


        

    
}
