/*
Отсотрировать стобцы матрицы по возрастанию и убыванию значений элементов.
 */

import java.util.Random;
import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        int n;
        int[][] array;

        n = getNumber();
        array = new int[n][n];
        initArray(array);
        printArray(array);
        System.out.println("--------------");
        System.out.println("Elements in columns are increasing:");
        sortColumnsIncrease(array);
        printArray(array);
        System.out.println("--------------");
        System.out.println("Elements in columns are decreasing:");
        sortColumnsDecrease(array);
        printArray(array);
    }

    public static void sortColumnsIncrease(int[][] array) {
        int min;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                for (int k = j + 1; k < array.length; k++) {
                    min = array[j][i];
                    if (array[k][i] < min) {
                        array[j][i] = array[k][i];
                        array[k][i] = min;
                    }
                }
            }
        }
    }

    public static void sortColumnsDecrease(int[][] array) {
        int max;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length - 1; j++) {

                for (int k = j + 1; k < array.length; k++) {
                    max = array[j][i];
                    if (array[k][i] > max) {
                        array[j][i] = array[k][i];
                        array[k][i] = max;
                    }
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

    public static int getNumber() {
        int z;
        Scanner in;

        in = new Scanner(System.in);
        do {
            System.out.print("Enter size of array, integer number >= 2: ");
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 2);

        return z;
    }
}
