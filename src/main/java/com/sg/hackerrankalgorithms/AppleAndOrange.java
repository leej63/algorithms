/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.hackerrankalgorithms;

import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class AppleAndOrange {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
    
    public static void countApplesAndOranges(int s, int t, int a, int b, int []apples, int[] oranges) {
        int appleCount = 0;
        int orangeCount = 0;
        
        for (int i = 0; i < apples.length; i++) {
            apples[i] = a + apples[i];
            if (apples[i] >= s && apples[i] <= t) appleCount++;
        }
        
        for (int i = 0; i < oranges.length; i++) {
            oranges[i] = b + oranges[i];
            if (oranges[i] >= s && oranges[i] <= t) orangeCount++;
        }
        
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}



// Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below, determine the number of apples and oranges that land on Sam's house.

// https://www.hackerrank.com/challenges/apple-and-orange/problem
