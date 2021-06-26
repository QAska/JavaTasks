/*
Найти положительные элементы главной диагонали квадратной матрицы.
 */

import java.util.Random;
import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        int n;
        int[][] array;
        n = getNumber();

        array = new int[n][n];
        initArray(array);
        System.out.println("Initial array:");
        printArray(array);
        System.out.print("Positive numbers in main diagonal: ");
        findPositiveInMainDiagonal(array);
    }

    public static void findPositiveInMainDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] > 0) {
                System.out.print(array[i][i] + " ");
            }
        }
    }

    public static void initArray(int[][] array) {
        Random random;

        random = new Random();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(20) - 10;
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getNumber() {
        int z;
        Scanner in;

        in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("Only integers are allowed! Try again: ");
        }

        z = in.nextInt();

        return z;
    }
}
