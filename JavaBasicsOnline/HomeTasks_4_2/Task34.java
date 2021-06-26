/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
причем в каждом столбце число единиц равно номеру столбца.
 */

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        int m;
        int n;
        int[][] array;
        String message;

        message = "Enter number of rows, m <= 2: ";
        m = getNumber(message);
        message = "Enter number of columns, n <= 2: ";
        n = getNumber(message);
        array = new int[m][n];
        initArray(array);
        printArray(array);
    }

    public static void initArray(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j > count)
                    array[i][j] = 1;
            }
            System.out.println(count);
            count++;
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

    public static int getNumber(String message){
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
