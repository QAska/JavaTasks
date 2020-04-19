/*
В числовой матрице поменять местами два любых столбца,
т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
 */

import java.util.Random;
import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        int n;
        int a;
        int b;
        int[][] array;
        String message;

        message = "Enter array size: ";
        n = getNumber(message);
        array = new int[n][n];
        initArray(array);
        System.out.println("Initial array:");
        printArray(array);
        message = "Enter 1st column to replace, a <= " + (n - 1) + ": ";
        a = getColumn(message, n);
        message = "Enter 2nd column to replace, b <= " + (n - 1) + ": ";
        b = getColumn(message, n);
        replaceColumns(array, a, b);
        System.out.println("---------------");
        printArray(array);
    }

    public static void replaceColumns(int[][] array, int a, int b) {
        int[] c;

        c = new int[array.length];
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                c[j] = array[i][a];
                array[i][a] = array[i][b];
                array[i][b] = c[j];
            }
        }
    }

    public static void initArray(int[][] array) {
        Random random;

        random = new Random();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(200) - 100;
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

    public static int getColumn(String message, int n) {
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
        } while (z < 0 || z > n - 1);


        return z;
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
