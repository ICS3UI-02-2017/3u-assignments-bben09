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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("What was your first test out of?");
        double test1 = input.nextDouble();
        
        System.out.println("What did you get on your first test?");
        double score1 = input.nextDouble();
        
        System.out.println("What was your second test out of?");
        double test2 = input.nextDouble();
        
        System.out.println("What did you get on your first test?");
        double score2 = input.nextDouble();
        
        System.out.println("What was your third test out of?");
        double test3 = input.nextDouble();
        
        System.out.println("What did you get on your third test?");
        double score3 = input.nextDouble();
        
        System.out.println("What was your fourth test out of?");
        double test4 = input.nextDouble();
        
        System.out.println("What did you get on your fourth test?");
        double score4 = input.nextDouble();
        
        System.out.println("What was your fifth test out of?");
        double test5 = input.nextDouble();
        
        System.out.println("What did you get on your fifth test?");
        double score5 = input.nextDouble();
        
        double mark1 = (score1/test1);
        
        double mark2 = (score2/test2);
        
        double mark3 = (score3/test3);
        
        double mark4 = (score4/test4);
        
        double mark5 = (score5/test5);
        
        double average = ((score1 + score2 + score3 +score4 + score5)/(test1 + test2 + test3 +test4 + test5));
                
        System.out.println("On the first test you got " + (mark1*100) + "%");
        System.out.println("On the second test you got " + (mark2*100) + "%");
        System.out.println("On the third test you got " + (mark3*100) + "%");
        System.out.println("On the fourth test you got " + (mark4*100) + "%");
        System.out.println("On the fifth test you got " + (mark5*100) + "%");
        System.out.println("Your average was" + (average*100) + "%");
    }
}
