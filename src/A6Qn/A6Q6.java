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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner to read users input
        Scanner input = new Scanner(System.in);

        //ask user how many students are in the class
        System.out.println("How many students are in the class?");

        //store the class size in an integer
        int classsize = input.nextInt();

        //make a double array the size of the class
        double[] marks = new double[classsize];

        //create a blank double to use later
        double blank = 0;

        //create a blank double to use later
        double total = 0;

        //ask user to input the marks of their students
        System.out.println("Input the marks of the " + classsize + " students now.");

        //store the marks in the array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }

        //bubble sorting for loop to put the marks in order from smallest to biggest
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = i + 1; j < marks.length; j++) {

                if (marks[i] > marks[j]) {
                    blank = marks[i];
                    marks[i] = marks[j];
                    marks[j] = blank;
                }
            }
        }

        //for loop to total the marks in the class
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }
        //get the average mark by dividing the total by the length of the array (the number of marks in the class)
        double avg = total / marks.length;
        
        //output the lowest mark, the highest mark, and the average
        System.out.println("The lowest mark is " + marks[0] + ", the highest mark is " + marks[marks.length - 1] + ", the class average is " + avg + ".");
    }
}