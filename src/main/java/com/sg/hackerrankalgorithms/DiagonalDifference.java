/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.hackerrankalgorithms;

import java.util.Arrays;
import java.util.Vector;

/**
 *
 * @author jonat
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Vector<Vector<Integer>> arr = new Vector<Vector<Integer>>();
        
        Integer[] a = {11, 2, 4};
        Integer[] b = {4, 5, 6};
        Integer[] c = {10, 8, -12};
        
        Vector<Integer> one = new Vector<Integer>(Arrays.asList(a));
        Vector<Integer> two = new Vector<Integer>(Arrays.asList(b));
        Vector<Integer> three = new Vector<Integer>(Arrays.asList(c));
        
        arr.add(one);
        arr.add(two);
        arr.add(three);
        
        System.out.println(diagonalDifference(arr));
    }
    
    public static int diagonalDifference(Vector<Vector<Integer>> arr) {
        int leftSum = 0;
        int rightSum = 0;
        
        for(int i = 0; i < arr.size(); i++) {
            leftSum += arr.get(i).get(i);
            rightSum += arr.get(i).get(arr.size() - (1 + i));
        }
        
        return Math.abs(leftSum - rightSum);
    }
    
}

// Given a square matrix, calcuate the absolute difference between the sums of its diagonals.

// For example, the square matrix arr is shown below:
// 1 2 3
// 4 5 6
// 9 8 9

// The left-to-right diagonal 1+5+9 = 15. The right-to-left diagonal 3+5+9 = 17, Their absolute difference is |15 - 17| = 2

// Input: square matrix
// Output: int: the absolute diagonal difference