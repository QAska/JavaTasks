/*
Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево,
вторая строка слева направо, третья строка справа налево и так далее.
 */

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int m;
        int n;
        int[][] array;
        String message;

        message = "Enter number of rows, m >= 2: ";
        m = getNumber(message);
        message = "Enter number of columns, n >= 2: ";
        n = getNumber(message);

        array = new int[m][n];
        initArray(array);
        System.out.println("Initial array:");
        printInitArray(array);
        System.out.println("------------");
        printArrayCondition(array);
    }

    public static void printArrayCondition(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    System.out.print(array[i][array[i].length - 1 - j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }

            }
            System.out.println();
        }
    }

    public static void printInitArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
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
