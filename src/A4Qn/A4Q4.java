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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("How much does food for prom cost?");
        int food = input.nextInt();
        
        System.out.println("How much does the DJ cost?");
        int DJ = input.nextInt();
        
        System.out.println("How much does it cost to rent the hall?");
        int Hall = input.nextInt();
        
        System.out.println("How much do the decorations cost?");
        int Dec = input.nextInt();
        
        System.out.println("How much does it cost for staff?");
        int Staff = input.nextInt();
        
        System.out.println("How much do the miscellaneous charges cost?");
        int Misc = input.nextInt();
        
        double Total = (food + DJ + Hall + Dec + Staff + Misc)/35.0;
        double Total1 = Math.ceil(Total);
        
        System.out.println("The total cost is " + (food + DJ + Hall + Dec + Staff + Misc) + ". You will need to sell " + Total1 + " tickets to break even." );
                
                
        
        
        
        
    }
}
