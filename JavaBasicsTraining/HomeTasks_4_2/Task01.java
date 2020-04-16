/*
Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и вывести на экран.
 */

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        int[][] array;

        array = new int[3][4];

        initArray(array);
        printArray(array);

    }

    public static void initArray(int[][] array) {
        Random rand;

        rand = new Random();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (j == i) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) { // 0, 1, 2

            for (int j = 0; j < array[i].length; j++) { // 0, 1, 2, 3
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
