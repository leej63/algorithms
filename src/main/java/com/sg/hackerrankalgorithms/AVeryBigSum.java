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
public class AVeryBigSum {
    public static void main(String[] args) {
        long[] arr = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        System.out.println(aVeryBigSum(arr));
    }
    
    public static long aVeryBigSum(long[] arr) {
        long sum = 0;
        for(long num : arr) {
            sum += num;
        }
        return sum;
    }
}

//In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
//
//Function Description
//
//Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
//
//aVeryBigSum has the following parameter(s):
//
//int ar[n]: an array of integers .
//Return
//
//long: the sum of all array elements
//Input Format
//
//The first line of the input consists of an integer .
//The next line contains  space-separated integers contained in the array.
//
//Output Format
//
//Return the integer sum of the elements in the array.
//
//Constraints
//1 <= n <= 10
//0 <= ar[i] <= 10^10
//
//Sample Input
//
//5
//1000000001 1000000002 1000000003 1000000004 1000000005
//Output
//
//5000000015