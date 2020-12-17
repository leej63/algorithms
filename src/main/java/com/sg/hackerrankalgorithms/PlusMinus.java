/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.hackerrankalgorithms;

import java.text.DecimalFormat;

/**
 *
 * @author jonat
 */
public class PlusMinus {
    public static void main(String[] args) {
        int[] array = {-4, 3, -9, 0, 4, 1};
        
        plusMinus(array);
    }
    
    public static void plusMinus(int[] arr) {
        double positives = 0;
        double zeroes = 0;
        double negatives = 0;
        
        for (int num : arr) {
            if (num == 0) {
                zeroes++;
            } else if(num > 0) {
                positives++;
            } else {
                negatives++;
            }
        }
        
        DecimalFormat df = new DecimalFormat("#.######");
        
        System.out.println(df.format(positives / arr.length));
        System.out.println(df.format(negatives / arr.length));
        System.out.println(df.format(zeroes / arr.length));
    }
}


// Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with 6 places after the decimal.

// Example:
// arr = [-4, 3, -9, 0, 4, 1]
// There are n = 6 elements, three positive, two negative and one zero. Their ratios are 3/6 = 0.500000, 2/6 = 0.333333 and 1/6 = 0.166667.
// Results are printed as:
// 0.500000
// 0.333333
// 0.166667