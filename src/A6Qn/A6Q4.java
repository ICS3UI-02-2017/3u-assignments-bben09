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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //scanner to read the marks
        Scanner input = new Scanner(System.in);

        //tell user to input 10 marks
        System.out.println("Enter the 10 marks:");

        //make a double array with a size of 10
        double[] marks = new double[10];

        //make a blank double to store the value later
        double blank = 0;

        //for loop to read the marks and store them in the array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }
        //bubble sorting for loop that puts the array in order from smallest to largest
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = i + 1; j < marks.length; j++) {

                if (marks[i] > marks[j]) {
                    blank = marks[i];
                    marks[i] = marks[j];
                    marks[j] = blank;
                }
            }
        }
        //output the marks in order from lowest the highest
        System.out.println(marks[0] + ", " + marks[1] + ", " + marks[2] + ", " + marks[3] + ", " + marks[4] + ", " + marks[5] + ", " + marks[6] + ", " + marks[7] + ", " + marks[8] + ", " + marks[9]);
    }
}
