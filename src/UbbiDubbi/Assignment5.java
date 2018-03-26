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
            
            
            //use a for loop to go through the characters
            for (int i = 0; i < length; i++) {

                //look at the character, at position i, is it a vowel?
                if (Word.charAt(i) == 'a'
                        || Word.charAt(i) == 'e'
                        || Word.charAt(i) == 'i'
                        || Word.charAt(i) == 'o'
                        || Word.charAt(i) == 'u'
) {
                    newWord = newWord + "ub" + Word.charAt(i);
                } else {
                    newWord = newWord + Word.charAt(i);
                }
                if(newWord.contains("ubaub") 
                        || newWord.contains("ubeub") 
                        || newWord.contains("ubiub") 
                        || newWord.contains("uboub") 
                        || newWord.contains("ubuub"));{
                newWord.replace("ubaub", "uba");
                newWord.replace("ubeub", "ube");
                newWord.replace("ubiub", "ubi");
                newWord.replace("uboub", "ubo");
                newWord.replace("ubuub", "ubu");
               
            }

            }
            System.out.println(Word + " is " + newWord + " in Ubbi Dubbi");
        }
    }
}
