/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UbbiDubbi;

import java.util.Scanner;

/**
 *
 * @author daupb7975
 */
public class ajks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter word you would like to translate:");

            String Word = input.nextLine();

            Word = Word.toLowerCase();


            int length = Word.length();

            String newWord = "";

            int position = -1;
            //use a for loop to go through the characters
            for (int i = 0; i < length; i++) {

                if (Word.charAt(i) != 'a'
                        && Word.charAt(i) != 'e'
                        && Word.charAt(i) != 'i'
                        && Word.charAt(i) != 'o'
                        && Word.charAt(i) != 'u') {
                    newWord = newWord + Word.charAt(i);
                }
                if (Word.charAt(i) == 'a'
                        && Word.charAt(i) == 'e'
                        && Word.charAt(i) == 'i'
                        && Word.charAt(i) == 'o'
                        && Word.charAt(i) == 'u') {
                    position = i;
                }

                if ((position != 0) && (Word.charAt(i) == 'a'
                        || Word.charAt(i) == 'e'
                        || Word.charAt(i) == 'i'
                        || Word.charAt(i) == 'o'
                        || Word.charAt(i) == 'u')
                        && Word.charAt(i - 1) != 'a'
                        && Word.charAt(i - 1) != 'e'
                        && Word.charAt(i - 1) != 'i'
                        && Word.charAt(i - 1) != 'o'
                        && Word.charAt(i - 1) != 'u') {
                    newWord = newWord + "ub" + Word.charAt(i);
                }
                if ((position != 0) && (Word.charAt(i) == 'a'
                        || Word.charAt(i) == 'e'
                        || Word.charAt(i) == 'i'
                        || Word.charAt(i) == 'o'
                        || Word.charAt(i) == 'u')
                        && (Word.charAt(i - 1) == 'a'
                        || Word.charAt(i - 1) == 'e'
                        || Word.charAt(i - 1) == 'i'
                        || Word.charAt(i - 1) == 'o'
                        || Word.charAt(i - 1) == 'u')) {
                    newWord = newWord + Word.charAt(i);
                }


                if ((position == 0) && (Word.charAt(i) == 'a'
                        && Word.charAt(i) == 'e'
                        && Word.charAt(i) == 'i'
                        && Word.charAt(i) == 'o'
                        && Word.charAt(i) == 'u')) {
                    newWord = newWord + "ub" + Word.charAt(i);
                }
            }
            System.out.println(Word + " is " + newWord + " in Ubbi Dubbi.");
        }
