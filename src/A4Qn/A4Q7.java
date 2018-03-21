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

        int posi = 1;

        while (posi != 100) {

            System.out.println("Enter your dice number:");
            int roll = input.nextInt();

            if (roll < 2) {
                System.out.println("Not valid roll.");
            }
            if (roll > 12) {
                roll = 0;
                System.out.println("Not valid roll.");
            }
            if (posi > 100) {
                roll = 0;
            }
            posi = (posi + roll);

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
            System.out.println("Your position is " + posi);

        }
        if (posi == 100) {
            System.out.println("Congradulation, you won!");
        }
    }
}
