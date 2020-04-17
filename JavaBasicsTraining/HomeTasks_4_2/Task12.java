/*
Получить квадратную матрицу порядка n
0 0 0 ... 0 0 0
0 1 0 ... 0 0 0
0 0 2 ... 0 0 0
      ...
0 0 0 ... 0 0 n-1
 */

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int n;
        int[][] array;
        String message;

        message = "Enter array dimension, n >= 2: ";
        n = getNumber(message);

        array = new int[n][n];
        initArray(array);
        printInitArray(array);
    }

    public static void printInitArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void initArray(int[][] array) {
        int count;

        count = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = count;
                    count++;
                } else {
                    array[i][j] = 0;
                }
            }
        }
    }

    public static int getNumber(String message) {
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
