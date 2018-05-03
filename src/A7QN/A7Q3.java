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
public class A7Q3 {

    public static void factors(int factor) {

        //output "the factors are:" so they can be listed after it 
        System.out.println("The factors are:");

        //for loop which divides factor by every number below it and outputs the number if there is no remainder
        for (int i = 1; i <= factor; i++) {
            if (factor % i == 0) {
                System.out.print(i + ", ");
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //scanner to read users input
        Scanner input = new Scanner(System.in);

        //ask user what number they want to know the factors of
        System.out.println("Enter the number you wish to know the factors of:");

        //store the number in an integer
        int number = input.nextInt();

        //put the number through the method
        factors(number);
    }
}
