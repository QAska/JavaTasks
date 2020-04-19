/*
С клавиатуры вводится двумерный массив чисел размерностью n x m. Выполнить с массивом следующие действия:
а) вычислить сумму отрицательных элементов в каждой строке;
б) определить максимальный элемент в каждой строке;
в) переставить местами максимальный и минимальный элементы матрицы.
 */

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        int n;
        int m;
        int [][] array;
        String message;
        int min;
        int max;

        message = "Enter number of rows: ";
        n = getNumber(message);
        message = "Enter number of columns: ";
        m = getNumber(message);
        array = new int[n][m];

        initArray(array);
        System.out.println("Initial array:");
        printArray(array);
        System.out.println("------------");
        printSumOfNegativesInARow(array);
        System.out.println("------------");
        defineMaxInARow(array);

        min = findMin(array);
        max = findMax(array);
        System.out.println("Min = " + min + ". Max = " + max + ".");
        replaceMinAndMax(array, min, max);
        System.out.println("------------");
        printArray(array);
    }

    public static void replaceMinAndMax(int[][] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == min) {
                    array[i][j] = max;
                } else if (array[i][j] == max) {
                    array[i][j] = min;
                }
            }
        }
    }

    public static int findMin(int[][] array) {
        int min;

        min = array[0][0];
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] < min){
                    min = array[i][j];
                }
            }
        }

        return min;
    }

    public static int findMax(int[][] array) {
        int max;

        max = array[0][0];
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }

        return max;
    }

    public static void defineMaxInARow(int[][] array) {
        int max;

        max = array[0][0];
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
            System.out.println("Max element in the " + i + " row = "  + max + ".");
            max = array[i][0];
        }
    }

    public static void printSumOfNegativesInARow(int[][] array) {
        int sum;

        sum = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0){
                    sum += array[i][j];
                }
            }
            System.out.println("Sum of negatives in the " + i + " row = "  + sum + ".");
            sum = 0;
        }
    }

    public static void initArray(int[][] array) {
        String message;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                message = "Enter integer element [" + i + ";" + j + "]:";
                array[i][j] = getNumber(message);
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getNumber(String message) {
        int z;
        Scanner in;

        in = new Scanner(System.in);
        System.out.print(message);
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("Only integers are allowed! Try again: ");
        }

        z = in.nextInt();

        return z;
    }

}
