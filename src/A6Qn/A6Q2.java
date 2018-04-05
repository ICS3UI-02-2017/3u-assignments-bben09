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
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many heights are you inputing?");
        
        int num = input.nextInt();
        
        double[] heights = new double[num];
        
        System.out.println("Enter all the heights in cm");
        
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            double height = heights[i];
            if(height > 178){
                System.out.println(height + " is above average");
            }
        }
    }
}
