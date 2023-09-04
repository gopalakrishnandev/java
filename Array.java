package com.example;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // Double[] score = { 2.23, 33.4, 5.0 };
        // System.out.println(score[2]);
        // score[2] = 3.5;
        // System.out.println(score[2]);
        // System.out.println(score[0]);
        // System.out.println(score.length);
        // System.out.println(Arrays.toString(score));

        // // Multi-dimensional array
        // int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 6, 7 } };
        // System.out.println(myNumbers[0][1]);

        // // change particular value in multi-dimensional array
        // int[][] myRuns = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        // myRuns[1][2] = 9;
        // System.out.println(myRuns[1][2]);

        // // for loop
        // String[] runs = { "0", "1", "2", "3" };
        // for (int i = 0; i < runs.length; i++) {
        // System.out.println(i);
        // }

        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
