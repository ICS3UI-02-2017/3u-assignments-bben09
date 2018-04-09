/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A6Qn;

import java.util.Scanner;

/**
 *
 * @author daupb7975
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //scanner to read the users input
        Scanner input = new Scanner(System.in);

        //ask user to input 2 integers
        System.out.println("Enter two integers");

        //create a blank integer to store a value later
        int blank = 0;

        //create an integer array to store the users integer
        int[] nums = new int[2];

        //store the users integers in the integer array
        nums[0] = input.nextInt();
        nums[1] = input.nextInt();

        //ask if the first number is bigger than the second, if it is swap the values
        if (nums[0] > nums[1]) {

            //store the first number in blank
            blank = nums[0];

            //make the first number equal the second number
            nums[0] = nums[1];

            //make the second number equal the stored value of the first number
            nums[1] = blank;
        }

        //output the two integers in ascending order
        System.out.println("The integers in ascending order are " + nums[0] + ", " + nums[1] + ".");
    }
}
