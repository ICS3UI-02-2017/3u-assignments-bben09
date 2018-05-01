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
    while(number < -10 || number > 10){
        number = number/10;
    }
    System.out.println("" + number);
    return 0;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input the number here:");
        
        int number = input.nextInt();
        
        firstDig(number);
    }
}
