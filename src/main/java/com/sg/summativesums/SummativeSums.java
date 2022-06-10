/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sg.summativesums;

import java.util.stream.IntStream;

/**
 *
 * @author stwal
 */
public class SummativeSums {

    public static void main(String[] args) {
        int[] a = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] b = { 999, -60, -77, 14, 160, 301 };
        int[] c = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
        
        int aSum = adder(a);
        int bSum = adder(b);
        int cSum = adder(c);
        
        System.out.println("#1 Array Sum: " + aSum);
        System.out.println("#2 Array Sum: " + bSum);
        System.out.println("#3 Array Sum: " + cSum);
    }
    
    public static int adder(int [] array) { 
        int sum = IntStream.of(array).sum();
        
        return sum;
    }
};
