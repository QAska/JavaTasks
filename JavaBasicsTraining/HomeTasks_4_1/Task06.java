/*
Дана последовательность чисел а1 ,а2 ,..., аn.
Указать наименьшую длину числовой оси, содержащую все эти числа.
 */

import java.util.Random;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        int n;
        int[] array;
        int len;
        int min, max;

        n = getNumber();
        array = new int[n];
        initArray(array);
        System.out.println("Initial array: ");
        printArray(array);
        min = getMin(array);
        max = getMax(array);

        len = max - min;

        System.out.println("Length is " + len + ".");

    }

    public static int getMax(int[] arr) {
        int max;

        max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int getMin(int[] arr) {
        int min;

        min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void initArray(int[] arr) {
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(200) - 100;
        }
    }

    public static int getNumber() {
        int z;

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter integer number > 1: ");
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 2);

        return z;
    }
}
