/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A7QN;

import static A7QN.A7Q7.firstDig;
import java.util.Scanner;

/**
 *
 * @author daupb7975
 */
public class A7Q6 {

    public static int lastDigit(int number) {

        //make number equal the the remainder when dividing by 10, which is the last digit
        number = number % 10;

        //if the number is negative multiply it by negative one so that the digit is positive
        if (number < 0) {
            number = number * -1;
        }
        //output the lasst digit
        System.out.println("The last digit is " + number);
        return number;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //scanner to read users input
        Scanner input = new Scanner(System.in);

        //ask the user for the number 
        System.out.println("Input the number here:");

        //make the number an integer
        int number = input.nextInt();

        //put number through first digit method
        lastDigit(number);

    }
}
