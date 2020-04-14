/*
Даны целые числа а1 ,а2 ,..., аn. Вывести на печать только те числа, для которых аi > i.
 */

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int n;
        int[] array;

        n = getSize();
        array = new int[n];

        initArray(array);
        System.out.println("Initial array:");
        printArray(array);
        System.out.println("Array with condition а[i] > i:");
        printRestrictedArray(array);
    }

    public static void printRestrictedArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > i) {
                System.out.print(ar[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void initArray(int[] ar) {
        Random rand = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = rand.nextInt(20) - 10;
        }
    }

    public static int getSize() {
        int z;
        Scanner in;

        in = new Scanner(System.in);
        do {
            System.out.print("Enter integer number, size of the array, n > 1: ");
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 2);

        return z;
    }
}
