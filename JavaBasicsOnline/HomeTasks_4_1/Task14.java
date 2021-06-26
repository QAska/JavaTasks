/*
Дан одномерный массив A[N]. Найти: max(a2,a4 ..., a(2k)) + min(a1,a3 ..., a(2k+1)).
 */

import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int size;
        int[] array;
        int k;
        int max;
        int min;
        int sum;
        String message;

        message = "Enter array size, n > 1: ";
        size = getArraySize(message);
        array = new int[size];
        initArray(array);
        System.out.println("Initial array:");
        printArray(array);
        message = "Enter k > 1 and k < " + size / 2 + ": ";
        k = getArraySize(message);
        min = findMin(array, k);
        max = findMax(array, k);

        sum = min + max;
        System.out.println("max(a2,a4 ..., a(2 * " + k + ")) + min(a1,a3 ..., a(2 * " + k + " + 1)) = " + sum);

    }

    public static int findMin(int[] array, int k) {
        int min;

        min = array[0];
        for (int i = 2; i < 2 * k + 1; i += 2) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array, int k) {
        int max;

        max = array[1];
        for (int i = 3; i < 2 * k; i += 2) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void initArray(int[] array) {
        Random random;

        random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
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
        } while (z < 2);

        return z;
    }
}
