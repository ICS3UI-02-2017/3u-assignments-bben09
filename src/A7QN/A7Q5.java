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
public class A7Q5 {

    public static void chaotic(int line){
           for (int i = 0; i < line; i++) {
               System.out.println("");
               double random = (int)(Math.random()*5) + 1;
               for (int j = 0; j < random; j++) {
                   System.out.print("*");
               }
        }
 

    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        chaotic(10);
        
    }
}
