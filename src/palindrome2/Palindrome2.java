/*
 * @Henry Huang
 * Palindrome2.java
 * Feb 20,2019
 * This program is designed to count the number of palindrome in the sentence that 
 * the user has input.
 */
package palindrome2;

/**
 *
 * @author HenryHwang
 */

import javax.swing.*;
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String sentence = JOptionPane.showInputDialog("Words that are the same forwards and backwards"
                + "are called palindromes." + "\nThis program determines if the "
                + "are palindromes." + "\n\n Enter a sentence(do not include a puntuation mark):");
        System.out.println(sentence);
        
        if (sentence == null || sentence.isEmpty())
        { 
            System.out.println("0");
        } 
        

        
        String[] words = sentence.split(" ");
        
        int num = words.length;
        System.out.println(num);
        
        for (String w:words)
        {
             System.out.println(w);
        }
        
        for (int i = num; i >= 0; i --)
        {
            System.out.println(i);
        }
        
        String first = words[0];
        String second = words[1];
        
     
        String backward = "";
        
        for (int position = first.length() - 1; position >= 0; position --)
        {
            backward += first.charAt(position);
            
            //System.out.println(backward);
        }
        
        System.out.println(backward);
       
        System.out.println(first);
        System.out.println(second);
       
    }
    
    private static void backward()
    {
        
    }
    
    
    
}
