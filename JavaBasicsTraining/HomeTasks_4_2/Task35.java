/*
Найдите наибольший элемент матрицы и замените все нечетные элементы на него.
 */

import java.util.Random;
import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        int m;
        int n;
        int max;
        int[][] array;
        String message;

        message = "Enter number of rows, m <= 2: ";
        m = getNumber(message);
        message = "Enter number of columns, n <= 2: ";
        n = getNumber(message);
        array = new int[m][n];
        initArray(array);
        printArray(array);
        System.out.println("-------------------");
        max = findMax(array);
        System.out.println("Max element = " + max + ".");
        replaceOdds(array, max);
        System.out.println("Odd numbers replaced with max:");
        printArray(array);
    }

    public static void replaceOdds(int[][] array, int max) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }
            }
        }
    }

    public static int findMax(int[][] array) {
        int max;

        max = array[0][0];
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        return max;
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
