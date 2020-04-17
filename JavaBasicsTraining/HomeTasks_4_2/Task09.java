/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

import java.util.Random;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        int[][] array;
        int n;
        String message;
        int count;

        message = "Enter dimension of a square array, n >= 2:";
        n = getNumber(message);
        array = new int[n][n];
        initArray(array);
        System.out.println("Initial array:");
        printArray(array);
        System.out.println("---------------");
        System.out.println("Diagonal elements are:");
        printDiagonalElements(array);
    }

    public static void printDiagonalElements(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
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
                array[i][j] = random.nextInt(20) - 10;
            }
        }
    }

    public static int getNumber(String message) {
        int z;
        Scanner in;

        in = new Scanner(System.in);
        do {
            System.out.println(message);
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 2);

        return z;
    }
}
