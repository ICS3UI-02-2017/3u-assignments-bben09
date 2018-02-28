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
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello World");
        System.out.println("Another Line!");
        
        //sout + tab for shortcut
        //blank empty space
        System.out.println();
        
        //printing on the same line (add space, remove ln)
        System.out.print("I like ");
        System.out.println("cake!");
        
        //special character
        //quotation marks \"
        System.out.println("\"liam is cool!\"");
        
        //slash \\
        System.out.println("A Slash \\");
        
        // a tab \t
        System.out.println("\tburger\tpizza\tcoke");
        
        //new line \n
        System.out.println("one line\nSecond line");
        
        //make an integer storing 10 
        int number = 10;
        System.out.println(number);
        
        //add words together
        System.out.println("number = " + number);
        
        //add more words
        System.out.println("number = " + number + ". Yay!");
        
        //use a scanner to read information
        Scanner in = new Scanner(System.in);
        
        //tell system what to do
        System.out.println("Enter your name:");
        
        //make a string to store a name
        String name = in.nextLine();
        
        System.out.println("Hello " +name);
        
        System.out.println("What year were you born?");
        
        //make a variable to store the year
        int birthYear = in.nextInt ();
        int age = 2018 - birthYear;
        
        System.out.println("you are " +age +" years old");
        
        
        if(age < 0){
            System.out.println("Ah ah ahhhh");
        } else if (age > 30){
            System.out.println("You are old");
        }
        
        while(age < 0){
            System.out.println("Try Again");
        }
    }
}
