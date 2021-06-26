/*
Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

import java.util.Random;
import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        int n;
        int[][] array;

        n = getNumber();
        array = new int[n][n];
        initArray(array);
        printArray(array);
        System.out.println("----------------");
        System.out.println("Elements in rows are increasing");
        sortRowsIncrease(array);
        printArray(array);
        System.out.println("----------------");
        System.out.println("Elements in rows are decreasing:");
        sortRowsDecrease(array);
        printArray(array);
    }

    public static void sortRowsIncrease(int[][] array) {
        int min;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length - 1; j++) {
                for (int k = j + 1; k < array[i].length; k++) {
                    min = array[i][j];
                    if (array[i][k] < min) {
                        array[i][j] = array[i][k];
                        array[i][k] = min;
                    }
                }
            }
        }
    }

    public static void sortRowsDecrease(int[][] array) {
        int max;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length - 1; j++) {
                for (int k = j + 1; k < array[i].length; k++) {
                    max = array[i][j];
                    if (array[i][k] > max) {
                        array[i][j] = array[i][k];
                        array[i][k] = max;
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

    public static int getNumber(){
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
