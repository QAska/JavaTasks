/*
Найдите произведение двух матриц.
 */

import java.util.Random;
import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {
        int m;

        int[][] array1;
        int[][] array2;
        int[][] arrayMult;
        String message;

        message = "Enter size of the array, m <= 2: ";
        m = getNumber(message);

        array1 = new int[][]{{4, 2}, {9, 0}};
//        initArray(array1);
        printArray(array1);
        System.out.println("-------------------");
        array2 = new int[][]{{3, 1}, {-3, 4}};
//        initArray(array2);
        printArray(array2);
        System.out.println("-------------------");
        System.out.println("Multiplication of two arrays:");
        arrayMult = new int[m][m];
        multOfArrays(array1, array2, arrayMult);
        printArray(arrayMult);
    }

    public static void multOfArrays(int[][] array1, int[][] array2, int[][] array3) {
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                int sum = 0;
                for (int k = 0; k < array3.length; k++) {
                    sum += array1[i][k] * array2[k][j];
                }
                array3[i][j] = sum;
            }

        }
    }

    public static void initArray(int[][] array) {
        Random rand;

        rand = new Random();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(20) - 10;
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
