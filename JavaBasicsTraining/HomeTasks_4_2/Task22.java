/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
1   2  3  ... n-2 n-1 n
2   3  4  ... n-1 n   0
3   4  5  ... n   0   0
...
n-1 n  0  ... 0   0   0
n   0  0  ... 0   0   0
 */

import java.util.Scanner;

public class Task22 {
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
            int count = i + 1;
            for (int j = 0; j < array[i].length - i; j++) {
                array[i][j] = count;
                count++;
            }
            count = i + 1;
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
