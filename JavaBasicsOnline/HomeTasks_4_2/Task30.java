/*
Матрицу 10x20 заполнить случайными числами от 0 до 15.
Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 */

import java.util.Random;

public class Task30 {
    public static void main(String[] args) {
        int[][] array;

        array = new int[10][20];

        initArray(array);
        System.out.println("Initial array:");
        printArray(array);

        System.out.print("Numbers of lines that contain 5 more than 3 times: ");
        if (!printLineWithThreeFives(array)) {
            System.out.println("there are no such lines.");
        }
    }

    public static boolean printLineWithThreeFives(int[][] array) {
        boolean flag;
        int count;

        count = 0;
        flag = false;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.print(i + ", ");
                flag = true;
            }
            count = 0;
        }

        return flag;
    }

    public static void initArray(int[][] array) {
        Random rand;

        rand = new Random();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(16);
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
