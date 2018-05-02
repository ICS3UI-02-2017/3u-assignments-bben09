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
public class A7Q8 {
public static boolean allDigitsOdd (int num){
if(num > 10){
    if(num%2 == 0){
        return false;
    }
    num = num / 10;
}
    return true;

    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        
        int num = input.nextInt();
        
        allDigitsOdd(num);
    }
}
