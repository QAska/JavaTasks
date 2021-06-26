/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        int[][] array;

        array = new int[5][10];
        initArray(array);
        System.out.println("Initial array:");
        printArray(array);
        System.out.println("--------------");
        printEvenColumnsWhereFirstBigger(array);
    }

    public static void printEvenColumnsWhereFirstBigger(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < array[i].length; j += 2) {
                if (array[0][j] > array[array.length - 1][j]) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
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

    public static void initArray(int[][] array) {
        Random rand;

        rand = new Random();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(100);
            }
        }
    }
}
