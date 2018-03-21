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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //scanner
        Scanner input = new Scanner(System.in);

        //integer to set the starting point on the playboard
        int posi = 1;

        //While loop that repeats until the position is exactly 100
        while (posi != 100) {

            //output text to tell user to input their dice roll
            System.out.println("Enter your dice number:");
            
            //int thats the dice roll
            int roll = input.nextInt();
            
            //if loops to make sure the roll is between 2 and 12
            if (roll < 2) {
                roll = 0;
                System.out.println("Not valid roll.");
            }
            if (roll > 12) {
                roll = 0;
                System.out.println("Not valid roll.");
            }
            
            //update position after roll
            posi = (posi + roll);
            
            //if loop to keep the position the same if the roll put it over 100
            if (posi > 100) {
                roll = 0;
            }

            //all the snakes and ladders
            if (posi == 54) {
                posi = 19;
            }
            if (posi == 90) {
                posi = 48;
            }
            if (posi == 99) {
                posi = 77;
            }
            if (posi == 9) {
                posi = 34;
            }
            if (posi == 40) {
                posi = 64;
            }
            if (posi == 67) {
                posi = 86;
            }
            
            //output to tell the user their position
            System.out.println("Your position is " + posi);

        }
        
        //if loop to tell user they won if they get to 100
        if (posi == 100) {
            System.out.println("Congradulation, you won!");
        }
    }
}
