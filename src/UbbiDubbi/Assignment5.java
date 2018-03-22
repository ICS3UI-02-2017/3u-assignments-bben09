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
        
        Scanner input = new Scanner (System.in);
        
        while(true){
        System.out.println("Enter word you would like to translate:");
        
        String Word = input.nextLine();
        
        Word = Word.toLowerCase();
        
                    if(Word.startsWith("a") || 
                    Word.startsWith("e") || 
                    Word.startsWith("i") || 
                    Word.startsWith("o") ||
                    Word.startsWith("u")){
        
                //stick ay on the end
            String transWord = Word + " is ub" + Word + " in Ubbi Dubbi";
            System.out.println(transWord);
            }else{
                        int length = origWord.length();
                    
                
                //use a for loop to go through the characters
                for(int i = 0; i < length; i++){
                    
                    //look at the character, at position i, is it a vowel?
                    if(Word.charAt(i) == 'a' || 
                            Word.charAt(i) == 'e' || 
                            Word.charAt(i) == 'i' ||
                            Word.charAt(i) == 'o' ||
                            Word.charAt(i) == 'u' ){
                        String start = Word.substring(i)
                    }
        
                    }
                }
    }
}
