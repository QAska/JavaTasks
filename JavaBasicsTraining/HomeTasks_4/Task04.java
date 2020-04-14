/*
Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
 */

import java.util.Random;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int n;
        int[] array;

        n = getValue();
        array = new int[n];
        initArray(array);
        printArray(array);

        if (ifArrayIncreasing(array)) {
            System.out.println("The sequence is increasing.");
        } else {
            System.out.println("The sequence is NOT increasing.");
        }

    }

    public static int getValue() {
        int z;
        Scanner in;

        in = new Scanner(System.in);

        do {
            System.out.print("Enter integer number > 1: ");
            while (!in.hasNextInt()) {
                in.next();
                System.out.println("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 2);

        return z;
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
            arr[i] = rand.nextInt(100);
        }
    }

    public static boolean ifArrayIncreasing(int[] arr) {
        boolean increasing;

        increasing = true;
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i + 1] > arr[i]) {
                continue;
            } else {
                increasing = false;
                break;
            }
        return increasing;
    }
}
