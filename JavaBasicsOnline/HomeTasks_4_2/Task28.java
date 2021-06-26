/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
Определить, какой столбец содержит максимальную сумму.
 */

import java.util.Random;
import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        int n;
        int[][] array;
        int indexRow;

        n = getNumber();
        array = new int[n][n];
        initArray(array);
        System.out.println("Initial array:");
        printArray(array);
        indexRow = maxInRow(array);
        System.out.println("Max sum is in the " + indexRow + " row.");
    }

    public static int maxInRow(int[][] array) {
        int sum;
        int max;
        int index;

        sum = 0;
        max = 0;
        index = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                if (sum > max) {
                    max = sum;
                    index = i;
                }
            }
            System.out.println("Sum of elements in the " + i + " row: " + sum + ".");
        }

        return index;
    }

    public static void initArray(int[][] array) {
        Random random;

        random = new Random();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
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

    public static int getNumber() {
        int z;
        Scanner in;

        in = new Scanner(System.in);
        do {
            System.out.print("Enter integer number >= 2: ");
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 2);

        return z;
    }
}
