/*
Операция сглаживания матрицы дает новую матрицу того же размера,
каждый элемент которой получается как среднее арифметическое соседей соответствующего элемента исходной матрицы.
Построить результат сглаживания заданной матрицы.
 */

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        int m;
        int n;
        int[][] array;
        double[][] newArray;
        String message;

        message = "Enter number of rows, m <= 2: ";
        m = getNumber(message);
        message = "Enter number of columns, n <= 2: ";
        n = getNumber(message);

        array = new int[m][n];
        initArray(array);
        printIntArray(array);

        newArray = new double[m][n];
        initNewArray(array, newArray);
        System.out.println("-------------------");
        printDoubleArray(newArray);
    }

    public static void initNewArray(int[][] array, double[][] newArray) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 && j == 0) {
                    newArray[i][j] = (array[i][j + 1] + array[i + 1][j + 1] + array[i + 1][j]) / 3.0;
                } else if (i == 0 && j == array[i].length - 1) {
                    newArray[i][j] = (array[i + 1][j] + array[i + 1][j - 1] + array[i][j - 1]) / 3.0;
                } else if (i == array.length - 1 && j == array[i].length - 1) {
                    newArray[i][j] = (array[i - 1][j] + array[i - 1][j - 1] + array[i][j - 1]) / 3.0;
                } else if (i == array.length - 1 && j == 0) {
                    newArray[i][j] = (array[i - 1][j] + array[i - 1][j + 1] + array[i][j + 1]) / 3.0;
                } else if (i == 0) {
                    newArray[i][j] = (array[i][j + 1] + array[i + 1][j + 1] + array[i + 1][j] +
                            array[i + 1][j - 1] + array[i][j - 1]) / 5.0;
                } else if (j == array[i].length - 1) {
                    newArray[i][j] = (array[i + 1][j] + array[i + 1][j - 1] + array[i][j - 1] +
                            array[i - 1][j - 1] + array[i - 1][j]) / 5.0;
                } else if (i == array.length - 1) {
                    newArray[i][j] = (array[i][j + 1] + array[i - 1][j + 1] + array[i - 1][j] +
                            array[i - 1][j - 1] + array[i][j - 1]) / 5.0;
                } else if (j == 0) {
                    newArray[i][j] = (array[i - 1][j] + array[i - 1][j + 1] + array[i][j + 1] +
                            array[i + 1][j + 1] + array[i + 1][j]) / 5.0;
                } else {
                    newArray[i][j] = (array[i - 1][j - 1] + array[i - 1][j] + array[i - 1][j + 1] + array[i][j + 1] +
                            array[i + 1][j + 1] + array[i + 1][j] + array[i + 1][j - 1] + array[i][j - 1]) / 8.0;
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

    public static void printIntArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printDoubleArray(double[][] array) {
        DecimalFormat df;

        df = new DecimalFormat("0.00");
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(df.format(array[i][j]) + " ");
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
