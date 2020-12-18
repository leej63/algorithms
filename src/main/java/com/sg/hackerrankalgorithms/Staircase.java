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
public class Staircase {
    public static void main(String[] args) {
        staircase(4);
    }
    
    public static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                System.out.print(" ");
            }
            for(int k = n - (i + 1); k < n; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}



// This is a staircase of size n = 4 
//       #
//     # #
//   # # #
// # # # #
// Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not precede by any spaces.
// Write a program that prints a staircase of size n.


// Constraints: 0 < n <= 100
// Input: A single integer, n, denoting the size of the staircase.
// Output: Print a staircase of size n using # symbols and spaces.