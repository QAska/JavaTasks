/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)
1 1 1 ... 1 1 1
1 0 0 ... 0 0 1
1 0 0 ... 0 0 1
...
1 0 0 ... 0 0 1
1 1 1 ... 1 1 1
 */

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int n;
        int[][] array;
        String message;

        message = "Enter array dimension, even n >= 2: ";
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
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || i == array.length - 1) {
                    array[i][j] = 1;
                } else {
                    array[i][0] = 1;
                    array[i][array[i].length - 1] = 1;
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
        } while (z < 2 || z % 2 == 1);

        return z;
    }
}
