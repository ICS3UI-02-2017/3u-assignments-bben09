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
public class A7Q8 {

    public static boolean allDigitsOdd(int num) {

        //if the number is greater than 10 and theres no remainder dividing by 2 then return false cause its and even digit
        if (num > 10 && num % 2 == 0) {
            return false;
        }

        //if the number is greater than 10 and its odd  divide it by 10 to check the next digit
        if (num > 10 && num % 2 > 0) {
            num = num / 10;
        }

        //if the number is less than 10 and even return false
        if (num < 10 && num % 2 == 0) {
            return false;
        }

        //if the number is less than 10 and theres a remainder when dividing by 2 return true because all the digits are odd
        if (num < 10 && num % 2 > 0) {
            return true;
        }
        return true;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a = 13589;
        System.out.println(allDigitsOdd(a));
    }
}
