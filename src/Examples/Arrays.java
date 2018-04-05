/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author daupb7975
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner for input
        Scanner input = new Scanner(System.in);
        
        //make array to store expenses
        double[] expenses = new double[6];
        
        //array to store expense names
        String[] names = {"food", "DJ", "hall rental", "decorations", "Staff", "misc."};
        
        //use a for loop for input
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("How much did " + names[i] +  " cost?");
            expenses[i] = input.nextDouble();
        }

        //adding all expenses
        int sum = 0;
        
        for (int i = 0; i < expenses.length; i++) {
            //get the expense
            double expense = expenses[i];
            
            //add it to the sum
            sum = sum + expense;
        
            System.out.println("Prom costs " + sum);
            
            //take the sum, divide by 35, always round up
            double Tickets = Math.ceil(sum/35);
            
            System.out.println("Need to sell " + Tickets + " to break even");
            
        }
        
        
    }
}
