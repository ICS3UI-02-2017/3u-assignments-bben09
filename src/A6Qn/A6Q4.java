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
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 10 marks:");

        double[] marks = new double[10];

        double blank = 0;
                
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = i + 1; j < marks.length; j++) {
                
                if(marks[i] > marks[j]){
                    blank = marks[i];
                    marks[i] = marks[j];
                    marks[j] = blank;
                }
            }
        }
        System.out.println(marks[0] + ", " + marks[1] + ", " + marks[2] + ", " + marks[3] + ", " + marks[4] + ", " + marks[5] + ", " + marks[6] + ", " + marks[7] + ", " + marks[8] + ", " + marks[9]);
    }
}
