/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.hackerrankalgorithms;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jonat
 */
public class BirthdayCakeCandles {
    public static void main(String[] args) {
        int[] candles = {4, 4, 1, 3};
        System.out.println(birthdayCakeCandles(candles));
    }
    
    public static int birthdayCakeCandles(int[] candles) {
        Map<Integer, Integer> count = new HashMap<>();
        int max = 0;
        
        for (int i = 0; i < candles.length; i++) {
            if(candles[i] > max) {
                max = candles[i];
            }
            if(!count.containsKey(candles[i])) {
                count.put(candles[i], 1);
            } else {
                int candlesCount = count.get(candles[i]) + 1;
                count.put(candles[i], candlesCount);
            }
        }
        
        return count.get(max);
    }
    
}



// You are in charge of the cake for a child's birthday. You have decvided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

// Example:
// candles = [4,4,1,3]
// The maximum height candles are 4 units high. There are 2 of them, so return 2.

// Input: The first line contains a single integer, n, the size of trhe candles[]. The second line contains n space-separated integers, where each integer i describes the height of candles[i].
// Output: Returns an int: the number of candles that are the tallest
