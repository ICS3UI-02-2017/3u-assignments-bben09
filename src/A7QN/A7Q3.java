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
public class A7Q3 {
    
public static void factors(int factor){

    System.out.println("The factors are:");
    for (int i = 1; i <= factor; i++) {
        if(factor % i == 0){
            System.out.println("" + i);
        }
    }
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number you wish to know the factors of:");
        
        int number = input.nextInt();
        
        factors(number);
    }
}
