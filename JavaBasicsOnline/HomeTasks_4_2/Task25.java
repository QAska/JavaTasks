/*
Получить квадратную матрицу порядка n:
1         2       ... n-1   n
n+1       n+2     ... 2n-1  2n
...
(n-1)n+1 (n-1)n+2 ... n^2+1 n^2
 */

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        int n;
        int[][] array;
        String message;

        message = "Enter array size: ";
        n = getNumber(message);
        array = new int[n][n];

        initArray(array);

        printArray(array);
    }

    public static void initArray(int[][] array) {
        int count = 1;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count;
                count++;
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

    public static int getNumber(String message) {
        int z;
        Scanner in;

        in = new Scanner(System.in);
        System.out.print(message);
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("Only integers are allowed! Try again: ");
        }

        z = in.nextInt();

        return z;
    }
}
