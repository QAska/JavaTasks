/*
Дана последовательность целых чисел a1, a2, … , an.
Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1, a2, … , an).
 */

import java.util.Random;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int n;
        int[] array;
        int[] newArray;
        int min;
        int newSize;

        n = getNumber();
        array = new int[n];
        initArray(array);
        System.out.println("Initial array:");
        printArray(array);

        min = findMin(array);
        newSize = getNewSize(array, min);
        newArray = initNewArray(array, newSize, min);

        System.out.println("New array without min element = " + min + ":");
        printArray(newArray);
    }

    public static int[] initNewArray(int[] array, int size, int min) {
        int[] newArray;
        int index;

        newArray = new int[size];
        index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                newArray[index] = array[i];
                index++;
            }
        }

        return newArray;
    }

    public static int getNewSize(int[] array, int num) {
        int count;
        int size;

        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count++;
            }
        }

        size = array.length - count;

        return size;
    }

    public static int findMin(int[] array) {
        int min;

        min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static void printArray(int[] array) {
        for (int i= 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void initArray(int[] array) {
        Random random;

        random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) - 100;
        }
    }

    public static int getNumber() {
        int z;
        Scanner in;

        in = new Scanner(System.in);
        do {
            System.out.print("Enter integer n >= 2: ");
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 2);

        return z;
    }
}
