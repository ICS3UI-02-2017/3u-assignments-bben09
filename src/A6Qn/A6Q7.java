/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A6Qn;

/**
 *
 * @author daupb7975
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make an integer array that is size 999 to put all the numbers between 1000 in
        int[] list = new int[999];

        //for loop which makes the integer array 
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }

        for (int i = 2; i < 999; i++) {
            for (int j = 2; j < 999; j++) {
                int x = j * i;

                if (x >= 999) {
                    break;
                }
                
                list[x] = 0;
            }
        }
        
        for (int i = 0; i < list.length; i++) {
            int j = list[i];
            if((list[i] != 1) && (list[i] != 0)){
                System.out.println(list[i] + ",");
            }
            
        }
    }
