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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner to read the users input
        Scanner input = new Scanner(System.in);

        //ask user to input the number of marks they are inputing
        System.out.println("How many marks would you like to input?");

        //store the number of marks in an integer
        int numMarks = input.nextInt();

        //make a double array the size of the number of marks being inputed
        double[] marks = new double[numMarks];

        //make a blank double to use later
        double blank = 0;

        //ask user to input the marks
        System.out.println("Input the " + numMarks + " marks.");
        
        //for loop to store the marks in the array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }
        
        //bubble sorting for loop to put the array in order from smallest to biggest
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = i + 1; j < marks.length; j++) {

                if (marks[i] > marks[j]) {
                    blank = marks[i];
                    marks[i] = marks[j];
                    marks[j] = blank;
                }
            }
        }
        //output the marks in order
        System.out.println("The marks in order are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + ",");
        }

        //if there is an even number of marks output the average of the two middle positions
        if ((numMarks % 2) == 0) {
            int posi = numMarks/2;
            double media = ((marks[posi] + marks[posi-1])/2);
            System.out.println("The media is " + media);
            
            //if there is an odd number of marks, output the middle position
        }else{
            double middle1 = numMarks / 2;
            double middle2 = Math.ceil(middle1);
            int middle3 = (int) middle2;
            System.out.println("The median is " + marks[middle3]);
        }
    }
}
