/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int[][] array;
        int k;
        int p;
        int m;
        int n;
        String message;

        m = 5;
        n = 10;
        array = new int[m][n];
        System.out.println("Initial array:");
        initArray(array);
        printArray(array);
        System.out.println("-------------");

        message = "Enter number of row to display, 0 < k <= " + (m - 1) + ": ";
        k = getNumber(message, m);
        message = "Enter number of column to display, 0 < p <= " + (n - 1) + ": ";
        p = getNumber(message, n);

        printRow(array, k);
        printColumn(array, p);
    }

    public static void printColumn(int[][] array, int p) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][p]);
        }
    }

    public static void printRow(int[][] array, int k) {
        for (int j = 0; j < array[k].length; j++) {

            System.out.print(array[k][j] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void initArray(int[][] array) {
        Random random;

        random = new Random();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(200) - 100;
            }
        }
    }

    public static int getNumber(String message, int num) {
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

        } while (z < 0 || z > num - 1);

        return z;
    }
}
