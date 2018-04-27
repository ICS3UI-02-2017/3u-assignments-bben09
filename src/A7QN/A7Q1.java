/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A7QN;

import java.util.Scanner;

/* *
 * @author daupb7975
 */
public class A7Q1 {
    
public static double circleArea(double r){

    //square the radius and multiply by pi to calculate the area
double area = (Math.pow(r, 2))*Math.PI;
return area;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner to read users input
        Scanner input = new Scanner(System.in);
        
        //Ask the user to input the radius of the circle
        System.out.println("Input the radius of the circle in cm:");
        
        //make the radius a double so it can be used in the method
        double rad = input.nextDouble();
        
        //put the radius through the method
        double area = circleArea(rad);
        
        //output the area to the user
        System.out.println("The area of the circle is " + area + "cm squared.");
    }
}
