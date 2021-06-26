/*
Найдите сумму двух матриц.
 */

import java.util.Random;
import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        int m;
        int n;

        int[][] array1;
        int[][] array2;
        int[][] arraySum;
        String message;

        message = "Enter number of rows, m <= 2: ";
        m = getNumber(message);
        message = "Enter number of columns, n <= 2: ";
        n = getNumber(message);
        array1 = new int[m][n];
        initArray(array1);
        printArray(array1);
        System.out.println("-------------------");
        array2 = new int[m][n];
        initArray(array2);
        printArray(array2);
        System.out.println("-------------------");
        System.out.println("Sum of two arrays:");
        arraySum = new int[m][n];
        sumOfArrays(array1, array2, arraySum);
        printArray(arraySum);
    }

    public static void sumOfArrays(int[][] array1, int[][] array2, int[][] array3) {
        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array1[i].length; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }
    }

    public static void initArray(int[][] array) {
        Random rand;

        rand = new Random();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(200) - 100;
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

    public static int getNumber(String message){
        int z;
        Scanner in;

        in = new Scanner(System.in);
        do {
            System.out.print(message);
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 2);

        return z;
    }
}
