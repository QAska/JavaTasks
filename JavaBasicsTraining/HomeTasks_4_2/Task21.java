/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
n   0   0  ... 0   0   0
n-1 n   0  ... 0   0   0
n-2 n-1 n  ... 0   0   0
...
1   2   3  ... n-2 n-1 n
 */

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        int n;
        int[][] array;
        String message;

        message = "Enter array size, EVEN n >= 2: ";
        n = getArraySize(message);
        array = new int[n][n];

        initArray(array);
        printArray(array);
    }

    public static void initArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (j <= i) {
                    array[i][j] = array.length - i + j;
                }
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

    public static int getArraySize(String message) {
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
        } while (z < 2 || z % 2 != 0);

        return z;
    }
}
