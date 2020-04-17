/*
Дан двумерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива.
 */

import java.util.Random;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        int[][] array;
        int n;
        int m;
        int number;
        String message;
        int count;

        message = "Enter number of rows, n >= 2:";
        n = getNumber(message);
        message = "Enter number of columns, m >= 2:";
        m = getNumber(message);
        number = 7;
        array = new int[n][m];
        initArray(array);
        System.out.println("Initial array:");
        printArray(array);
        System.out.println("---------------");

        count = countNumber(array, number);
        System.out.println("Count of " + number + " = " + count + ".");
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
        Random random;

        random = new Random();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20) - 10;
            }
        }
    }

    public static int countNumber(int[][] array, int number) {
        int count;

        count = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == number) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int getNumber(String message) {
        int z;
        Scanner in;

        in = new Scanner(System.in);
        do {
            System.out.println(message);
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 2);

        return z;
    }
}
