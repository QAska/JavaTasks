/*
Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.
 */

import java.util.Random;
import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        int n;
        int[][] array;
        int count;

        n = getNumber();
        array = new int[n][n];

        initArray(array);
        System.out.println("Initial array:");
        printArray(array);
        count = countTwoDigits(array);
        System.out.print("Number of two-digit elements in the array: " + count + ".");
    }

    public static int countTwoDigits(int[][] array) {
        int count;

        count = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= 10 && array[i][j] <=99) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void initArray(int[][] array) {
        Random rand;

        rand = new Random();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(1000);
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
