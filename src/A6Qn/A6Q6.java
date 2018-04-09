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
        Scanner input = new Scanner(System.in);

        System.out.println("How many students are in the class?");

        int classsize = input.nextInt();

        double[] marks = new double[classsize];

        double blank = 0;

        double total = 0;

        System.out.println("Input the marks of the " + classsize + " students now.");

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

        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }
        double avg = total / marks.length;
        
        System.out.println("The lowest mark is " + marks[0] + ", the highest mark is " + marks[marks.length - 1] + ", the class average is " + avg + ".");
    }
}