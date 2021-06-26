/*
Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].
 */

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int[][] array;

        array = new int[2][3];
        initArray(array);
        printArray(array);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void initArray(int[][] array){
        Random rand;

        rand = new Random();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(10);
            }
        }
    }
}
