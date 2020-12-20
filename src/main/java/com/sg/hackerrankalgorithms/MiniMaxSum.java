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
public class MiniMaxSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        miniMaxSum(arr);
    }
    
    public static void miniMaxSum(int[] arr) {
        long min = arr[0];
        long max = min;
        long sum = min;
        
        for(int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}


// Given 5 positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

// Example:
// arr = [1,3,5,7,9]
// The minimum sum is 1 + 3 + 5 + 7 = 16 and the maximum sum is 3+ 5 + 7 + 9 = 24
// The function prints -> 16 24

// Input: A single line of five space-separated integers.
// Output: Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly 4 of the 5 integers.
