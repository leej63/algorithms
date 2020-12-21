/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.hackerrankalgorithms;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jonat
 */
public class BetweenTwoSets {
    public static void main(String[] args) {
        
    }
    
//    public static int getTotalX(int[] a, int[] b) {
//        Arrays.sort(a);
//        Arrays.sort(b);
//        
//        int lowerBound = a[n - 1];
//        int upperBound = b[0];
//        
//        int countX = 0;
//        for (int i = lowerBound; i < upperBound; i++) {
//            int sumMod = 0;
//            for(int j = 0; j < n; j++) {
//                sumMod += i % a[j];
//            }
//            for(int k = 0; k < m; k++) {
//                sumMod += b[k] % i;
//            }
//            
//            if (sumMod == 0) {
//                countX++;
//            }
//        }
//        
//        System.out.println(countX);
//    } 
    
}



// There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
// 1. The elements of the first array are all factors of the integer being considered
// 2. The integer being considered is a factor of all elements of the second array
// These numbers are referred to as being between the two arrays. Determine how many such numbers exist.

// Example:
// a = [2,6]
// b = [24,36]
// There are two numbers between the arrays: 6 and 12.

