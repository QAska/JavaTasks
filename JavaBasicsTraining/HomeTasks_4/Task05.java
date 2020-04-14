/*
Дана последовательность натуральных чисел а1 , а2 ,..., аn.
Создать массив из четных чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте.
 */

import java.util.Random;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        int n;
        int[] initArray;
        int[] outArray;
        int countEven;

        n = getValue();
        initArray = new int[n];

        initArray(initArray);
        System.out.println("Initial array: ");
        printArray(initArray);

        countEven = countEven(initArray);
        outArray = new int[countEven];
        initArrayEvens(initArray, outArray);

        System.out.println("Array from evens: ");
        printArray(outArray);
    }

    public static void initArrayEvens(int[] initArr, int[] outArr) {
        int index;

        index = 0;
        for (int i = 0; i < initArr.length; i++) {
            if (initArr[i] % 2 == 0) {
                outArr[index] = initArr[i];
                index++;
            }
        }
    }

    public static int countEven(int[] arr) {
        int count;

        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        return count;
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

    public static int getValue() {
        int z;
        Scanner in;

        in = new Scanner(System.in);

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
