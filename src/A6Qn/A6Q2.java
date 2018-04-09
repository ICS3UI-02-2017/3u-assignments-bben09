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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //scanner to read users input
        Scanner input = new Scanner(System.in);

        //ask user how many heights theyre inputing
        System.out.println("How many heights are you inputing?");

        //store the ammount of heights being inputed in an integer
        int num = input.nextInt();

        //create a double array the size of whatever number they entered
        double[] heights = new double[num];

        //ask user to input the heights
        System.out.println("Enter all the heights in cm");

        //for loop to store each height in the array
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            double height = heights[i];
        }

        //for loop to see if the height is above average, if it is, output the height and say its above average
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] >= 177) {
                double height = heights[i];
                System.out.println(height + "cm is above average.");
            }
        }
    }
}
