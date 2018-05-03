/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A7QN;

import java.util.Scanner;

/**
 *
 * @author daupb7975
 */
public class A7Q7 {
public static int firstDig(int number){
    
    //while loop that divides the number by ten until there is only the first digit left
    while(number < -10 || number > 10){
        number = number/10;
    }
    
    //make sure the digit is positive by multiplying by negative one if it is negative
    if(number < 0){
        number = number * -1;
    }
    
    //output the number
    System.out.println("" + number);
    return 0;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner to read users input
        Scanner input = new Scanner(System.in);
        
        //ask the user for the number 
        System.out.println("Input the number here:");
        
        //make the number an integer
        int number = input.nextInt();
        
        //put number through first digit method
        firstDig(number);
    }
}
