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
public class A7Q5 {

    public static void chaotic(int line) {

        //for loop which reapeats the number of times as the integer
        for (int i = 0; i < line; i++) {

            //create a new line after the line of stars is done
            System.out.println("");

            //create a random integer
            double random = (int) (Math.random() * 5) + 1;

            //for loop which the random number of stars on the line
            for (int j = 0; j < random; j++) {
                System.out.print("*");
            }
        }



    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);


        chaotic(10);

    }
}
