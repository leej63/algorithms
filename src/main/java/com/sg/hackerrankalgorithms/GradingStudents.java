/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.hackerrankalgorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonat
 */
public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        

        System.out.println(gradingStudents(grades));
    }
    
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<Integer>();
        for (Integer grade : grades) {
            if (grade <  38 || grade % 5 <= 2) {
                roundedGrades.add(grade);
            } else if (grade % 5 > 2) {
                int add = 5 - (grade % 5);
                roundedGrades.add(grade + add);
            }
        }
        return roundedGrades;
    }
    
}



// HackerLand University has the following grading policy:
// Every student receives a grade in the inclusive range from 0 to 100.
// Any grade less than 40 is a failing grade.

// Sam is a professor at the university and likes to round each student's grade according to these rules:
// If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
// If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.

// Examples
// grade = 84 round to 85 (85 - 84 is less than 3)
// grade = 29 do not round (result is less than 40)
// grade = 57 do not round (60 - 57 is 3 or higher)
// Given the initial value of grade for each of Sam's n students, write code to automate the rounding process

// Input: Each line i of the n subsequent lines contains a single integer, grades[i]
// Output: int[n]: the grades after rounding as appropriate

// Sample Input:
// [73, 67, 38, 33]
// Sample Output:
// [75, 67, 40, 33]
