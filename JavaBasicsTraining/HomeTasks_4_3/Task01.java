/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один массив,
включив второй массив между k-м и (k+1)-м элементами первого, при этом не используя дополнительный массив.
 */

import java.util.Random;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int k;
        int limitForK;

        Random random = new Random();
        int n1 = random.nextInt(10) + 15; // random n2 between 15 and 24;
        int n2 = random.nextInt(10) + 5; // random n1 between 5 and 14;
        array1 = new int[n1];
        array2 = new int[n2];
        limitForK = array1.length - 1;

        initArray(array1);
        initArray(array2);
        System.out.println("First array:");
        printArray(array1);
        System.out.println();
        System.out.println("Second array:");
        printArray(array2);
        System.out.println();

        k = getNumber(limitForK);
        System.out.println("Array union (the second array is on the place of " + k + " element of the first array):");
        printSecondInFirst(array1, array2, k);
    }

    public static void printSecondInFirst(int[] array1, int[] array2, int k) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
            if (i == k) {
                printArray(array2);
            }
        }
    }

    public static void initArray(int[] array) {
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int getNumber(int limit) {
        int z;

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter integer number k >= 0 and k <= " + limit + ": ");
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers are allowed! Try again: ");
            }
            z = in.nextInt();
        } while (z < 0 || z > limit);

        return z;
    }
}
