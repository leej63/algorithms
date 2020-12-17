/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.hackerrankalgorithms;

/**
 *
 * @author jonat
 */
public class FindIndexOfFirstLetterOfFirstWord {
    public static void main(String[] args) {
        String para = "hi this is priyank";
        String word = "priyank";
        
        System.out.println("Index position: " + findIndexOfFirstLetterOfFirstWord(para, word));
    }
    
    public static int findIndexOfFirstLetterOfFirstWord(String paragraph, String word) {
        int index = -1;
        
        for (int i = 0; i < paragraph.length(); i++) {            
            if (paragraph.charAt(i) == word.charAt(0)) {
                index = i;
                for (int j = 0; j < word.length(); j++) {
                    if (paragraph.charAt(i + j) != word.charAt(j)) {
                        index = -1;
                        break;
                    }
                }
                if (index > -1) {
                    return index;
                }
            }            
        }
        return index;
    }
}

// Input: pass 2 strings - (paragraph, word)
// Output: return the index of the first letter of the first instance of the word - if word is not in paragraph -> return -1
