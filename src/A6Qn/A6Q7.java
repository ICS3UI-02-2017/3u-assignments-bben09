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

        //for loop which puts the numbers from 0 - 999 in the array in order
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }

        //for loop which multiplies every combination of number in the array together 
        for (int i = 2; i < 999; i++) {
            for (int j = 2; j < 999; j++) {
                int x = j * i;

                //if its greater than 999 then dont do anything
                if (x >= 999) {
                    break;
                }
                //sets the value to 0 so they can be excluded in the output
                list[x] = 0;
            }
        }
        //for loop which outputs all the numbers left over in the array which is all the prime number between 0 and 100 but also 
        for (int i = 0; i < list.length; i++) {
            if ((list[i] != 1) && (list[i] != 0)) {
                System.out.println(list[i] + ",");
            }

        }
    }
