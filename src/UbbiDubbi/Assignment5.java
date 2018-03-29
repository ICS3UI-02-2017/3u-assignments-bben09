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
public class Assignment5 {

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
                        || Word.charAt(i) == 'e'
                        || Word.charAt(i) == 'i'
                        || Word.charAt(i) == 'o'
                        || Word.charAt(i) == 'u') {

                    position = i;
                }

                
                //look at the character, at position i, is it a vowel?
                if ((position != length - 1) && (position != 0) && (Word.charAt(i) == 'a'
                        || Word.charAt(i) == 'e'
                        || Word.charAt(i) == 'i'
                        || Word.charAt(i) == 'o'
                        || Word.charAt(i) == 'u')
                        && Word.charAt(position + 1) != 'a'
                        && Word.charAt(position + 1) != 'e'
                        && Word.charAt(position + 1) != 'i'
                        && Word.charAt(position + 1) != 'o'
                        && Word.charAt(position + 1) != 'u'
                        && Word.charAt(position - 1) != 'a'
                        && Word.charAt(position - 1) != 'e'
                        && Word.charAt(position - 1) != 'i'
                        && Word.charAt(position - 1) != 'o'
                        && Word.charAt(position - 1) != 'u') {
                    newWord = newWord + "ub" + Word.charAt(i);
                }

                if ((position != length - 1) && (Word.charAt(i) == 'a'
                        || Word.charAt(i) == 'e'
                        || Word.charAt(i) == 'i'
                        || Word.charAt(i) == 'o'
                        || Word.charAt(i) == 'u')
                        && (Word.charAt(position + 1) == 'a'
                        || Word.charAt(position + 1) == 'e'
                        || Word.charAt(position + 1) == 'i'
                        || Word.charAt(position + 1) == 'o'
                        || Word.charAt(position + 1) == 'u')) {
                    newWord = newWord + "ub" + Word.charAt(i) + Word.charAt(position + 1);
                }
                




            }
            System.out.println(Word + " is " + newWord + " in Ubbi Dubbi");
        }
    }
}
