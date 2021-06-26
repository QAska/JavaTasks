/*
Дан двумерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.
 */

import java.util.Random;

public class Task07 {
    public static void main(String[] args) {
        int[][] array;
        int sum;

        array = new int[5][5];
        initArray(array);
        System.out.println("Initial array:");
        printArray(array);
        System.out.println("------------");

        sum = findSumNegativeEven(array);
        System.out.println("Sum of absolute values of even negative numbers is " + sum + ".");
    }

    public static int findSumNegativeEven(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if (array[i][j] < 0 && array[i][j] % 2 != 0) {
                    sum += Math.abs(array[i][j]);
                }
            }
        }

        return sum;
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
                array[i][j] = rand.nextInt(200) - 100;
            }
        }
    }
}
