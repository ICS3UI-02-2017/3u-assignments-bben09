/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A4Qn;

import java.util.Scanner;

/**
 *
 * @author daupb7975
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //text to tell user to input 4 numbers
        System.out.println("Please enter 4 numbers");
        
        //scanner to read numbers
        Scanner input = new Scanner (System.in);
        
        //floats to allow user to input the numbers, and read them later
        float number1 = input.nextFloat();
        
        float number2 = input.nextFloat();
        
        float number3 = input.nextFloat();
        
        float number4 = input.nextFloat();
        
        //text listing the users inputed numbers
        System.out.println("Your numbers were: " + number1 + ", " + number2 + ", " + number3 + ", and " + number4);
                
                
    }
}
