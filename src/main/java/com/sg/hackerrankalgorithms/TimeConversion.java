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
public class TimeConversion {
    public static void main(String[] args) {
        String time1 = "12:01:00PM";
        String time2 = "12:01:00AM";
        String time3 = "07:05:45PM";
        System.out.println(timeConversion(time1));
        System.out.println(timeConversion(time2));
        System.out.println(timeConversion(time3));
    }
    
    public static String timeConversion(String s) {
        if(s.contains("PM")) {
            if(!s.substring(0, 2).equals("12")) {                           // If it is PM & not 12 -> set hour to hour + 12
                s = (Integer.parseInt(s.substring(0, 2)) + 12) + s.substring(2, 8);
            } else {                                                        // If it is PM & is 12 -> set s equal to s without AM or PM
                s = s.substring(0, 8);
            }
        } else if(s.contains("AM") && s.substring(0, 2).equals("12")) {     // If it is AM & is 12 -> set hour to 00
            s = "00" + s.substring(2, 8);
        } else {
            s = s.substring(0, 8);                                          // If it is AM -> set s equal to s without AM or PM
        }
        return s;  
    }
    
}



// Given a time in 12-hour AM/PM format, conver it to military (24 hour) time.
// Note: 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
// 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

// Example:
// s = '12:01:00PM'
// Return '12:01:00'.
// s = '12:01:00AM'
// Return '00:01:00'.

// Input: A single string s that represents a time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM).
// Output: string - the time in 24 hour format
// Sample Input & Output -> 07:05:45PM -> 19:05:45
