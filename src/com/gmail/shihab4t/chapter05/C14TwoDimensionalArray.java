package com.gmail.shihab4t.chapter05;

public class C14TwoDimensionalArray {
    public static void main(String[] args) {
//        int[][] matrix = new int[5][5];
//
//        matrix[2][2] = 15;
//        matrix[2][3] = 35;
//
//        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        int[][] array2 = new int[3][3];
//        array2[0][0] = 1;
//        array2[0][1] = 2;
//        array2[0][3] = 3;
//        array2[1][0] = 4;
//        array2[1][1] = 5;
//        array2[1][2] = 6;
//        array2[2][0] = 7;
//        array2[2][1] = 8;
//        array2[2][2] = 9;

        // A 12x* grid, in [row][col]
        int[][] array = new int[12][8];

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = row * column + 1;
            }
        }

        // Print Array
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%3d", array[row][column]);
            }
            System.out.println();
        }
    }
}
