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
        
        //scanner to scan the word to translate
        Scanner input = new Scanner(System.in);

        //while loop to constantly repeat
        while (true) {
            
            
            //ask user to input word they want to translate
            System.out.println("Enter word you would like to translate:");

            //make their word a string
            String Word = input.nextLine();

            //sanitize word
            Word = Word.toLowerCase();

            //create an integer that is the length of the word
            int length = Word.length();

            //create the new word as a blank string 
            String newWord = "";

            //use a for loop to go through the characters
            for (int i = 0; i < length; i++) {

                //if the character isnt a vowel add it to newWord
                if (Word.charAt(i) != 'a'
                        && Word.charAt(i) != 'e'
                        && Word.charAt(i) != 'i'
                        && Word.charAt(i) != 'o'
                        && Word.charAt(i) != 'u') {
                    newWord = newWord + Word.charAt(i);
                }
                
                //if the position is 0 and the character is a vowel add ub and the vowel to newWord
                if ((i == 0) && (Word.charAt(i) == 'a'
                        || Word.charAt(i) == 'e'
                        || Word.charAt(i) == 'i'
                        || Word.charAt(i) == 'o'
                        || Word.charAt(i) == 'u')) {
                    newWord = newWord + "ub" + Word.charAt(i);
                }

                //if the position is not 0 and the character is a vowel and there isnt a vowel before it add ub and the character to newWord
                if ((i != 0) && (Word.charAt(i) == 'a'
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
                
                //if the position is not zero and the character is a vowel and the one before it is a vowel add the character to newWord
                if ((i != 0) && (Word.charAt(i) == 'a'
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
            }
            
            //output the users original word and tell them the translated word in Ubbi Dubbi
            System.out.println(Word + " is " + newWord + " in Ubbi Dubbi.");
        }
