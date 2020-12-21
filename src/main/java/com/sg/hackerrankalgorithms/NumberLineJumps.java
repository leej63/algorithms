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
public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
        System.out.println(kangaroo(0, 2, 5, 3));
    }
    
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String answer = null;
        boolean isSpeedValid = (v1 - v2) > 0;
        System.out.println("velocity difference:" + (v1 - v2));
        boolean isMeetPossible = (isSpeedValid && (x2 - x1) % (v1 - v2) == 0);
        
        if (isSpeedValid && isMeetPossible) {
            answer = "YES";
        } else {
            answer = "NO";
        }
        
        return answer;
    }
    
}


// https://www.hackerrank.com/challenges/kangaroo/problem?h_r=next-challenge&h_v=zen
