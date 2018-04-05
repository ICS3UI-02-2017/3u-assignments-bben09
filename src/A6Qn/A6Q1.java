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
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many students in the class?");
        
        int pop = input.nextInt();
        
        double[] marks = new double[pop];
        
        System.out.println("Input the marks of the " + pop + " students.");
        
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }
        
        double sum = 0;
        
        for (int i = 0; i < marks.length; i++) {
            double mark = marks[i];
            sum = sum + mark;
        }
        
        double avg = sum / pop;
        
        System.out.println("The average is " + avg);
    }
}
