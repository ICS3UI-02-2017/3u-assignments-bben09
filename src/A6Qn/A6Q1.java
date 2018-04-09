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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //scanner to read the users input
        Scanner input = new Scanner(System.in);

        //ask the user how many students are in the class
        System.out.println("How many students in the class?");

        //store the ammount of students in an integer
        int pop = input.nextInt();

        //make a double array the size of the number of students in the class
        double[] marks = new double[pop];

        //ask the user to input the marks of the students
        System.out.println("Input the marks of the " + pop + " students.");

        //for loop to store the students marks in the double array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }

        //create a blank double to total the marks
        double sum = 0;

        //for loop to make the total to calculate average
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        //calculate class average by dividing the total of the marks by the population of the class
        double avg = sum / pop;

        //output the class average
        System.out.println("The average is " + avg);
    }
}
