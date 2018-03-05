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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Text asking user to input name
        System.out.println("Enter your name:");
        
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        //make string for name input
        String userName = input.nextLine();
        
        //output text to greet user
        System.out.println("Hello " + userName);
    }
}
