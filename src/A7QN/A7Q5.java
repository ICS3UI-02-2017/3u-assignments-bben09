/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A7QN;

/**
 *
 * @author daupb7975
 */
public class A7Q5 {

    public static void chaotic(int line){
            
        for (int i = 0; i < line; i++) {
            
        int stars = (int)(Math.random()*(5)) + 1;
        for (int n = 0; n < stars; n++) {
            String starLine = starLine + "*";
        }
            System.out.println("" + starLine);
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
}
