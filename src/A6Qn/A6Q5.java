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
        Scanner input = new Scanner(System.in);

        System.out.println("How many marks would you like to input?");

        int numMarks = input.nextInt();

        double[] marks = new double[numMarks];

        double blank = 0;

        System.out.println("Input the " + numMarks + " marks.");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = i + 1; j < marks.length; j++) {

                if (marks[i] > marks[j]) {
                    blank = marks[i];
                    marks[i] = marks[j];
                    marks[j] = blank;
                }
            }
        }
        System.out.println("The marks in order are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + ",");
        }

        if ((numMarks % 2) == 0) {
            int posi = numMarks / 2;
            
        }else{
            double middle1 = numMarks / 2;
            double middle2 = Math.ciel
            System.out.println("");
        }
    }
}
