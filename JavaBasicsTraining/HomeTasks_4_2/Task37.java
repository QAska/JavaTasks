/*
Переставить строки матрицы случайным образом.
 */

import java.util.Random;
import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        int m;
        int n;
        int p;
        int k;
        int[][] array;
        String message;
        Random rand;

        message = "Enter number of rows, m <= 2: ";
        m = getNumber(message);
        message = "Enter number of columns, n <= 2: ";
        n = getNumber(message);
        array = new int[m][n];
        initArray(array);
        printArray(array);
        System.out.println("-------------------");

        rand = new Random();
        p = rand.nextInt(m);
        k = rand.nextInt(m);
        while (k == p) {
            System.out.println("Random rows match, one more attempt.");
            k = rand.nextInt(m) + 1;
        }

        System.out.println("Array with mixed " + p + " and " + k + " rows:");
        replaceRows(array, p, k);
        printArray(array);
    }

    public static void replaceRows(int[][] array, int k, int p) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == k) {
                    int tmp = array[i][j];
                    array[i][j] = array[p][j];
                    array[p][j] = tmp;
                }
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
