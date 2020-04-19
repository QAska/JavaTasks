/*
Сформировать квадратную матрицу порядка N по правилу:
a[i][j] = sin((i^2 - j^2) / N)
и подсчитать количество положительных элементов в ней.
 */

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        int n;
        double[][] array;
        String message;
        int count;

        message = "Enter array size, n >= 2: ";
        n = getNumber(message);
        array = new double[n][n];
        initArray(array, n);
        System.out.println("Initial array:");
        printArray(array);
        count = getAmountOfPositive(array);
        System.out.print("Amount of positive elements in array: " + count + ".");
    }

    public static int getAmountOfPositive(double[][] array) {
        int count;

        count = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void initArray(double[][] array, int n) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
            }
        }
    }

    public static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                System.out.printf("%.2f", array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int getNumber(String message) {
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
