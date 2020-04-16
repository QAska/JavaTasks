/*
Дана матрица. Вывести на экран первый и последний столбцы.
 */

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        int[][] array;

        array = new int[6][5];

        initArray(array);
        System.out.println("Initial array:");
        printArray(array);
        System.out.println("--------------");
        printFirstAndLast(array);
    }

    public static void printFirstAndLast(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (j == 0 || j == array[i].length - 1) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void initArray(int[][] array) {
        Random rand;

        rand = new Random();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(100);
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
}
