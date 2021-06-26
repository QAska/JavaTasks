/*
В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int size;
        int[] userArray;
        int zeroCount;
        int[] outArray;
        String message;

        message = "Enter size of array: ";
        size = getIntNumber(message);

        userArray = new int[size];

        initArray(userArray);
        zeroCount = zeroCount(userArray);
        outArray = buildArrayZero(userArray, zeroCount);

        printArray(outArray);
    }

    public static int zeroCount(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count += 1;
            }
        }

        return count;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] buildArrayZero(int[] array, int count) {
        int[] outArray;
        int index;

        outArray = new int[count];
        index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                outArray[index] = i;
                index++;
                }
            }

        return outArray;
    }

    public static void initArray(int[] array) {
        String message;

        for (int i = 0; i < array.length; i++) {
            message = "Enter " + i + " element of array: ";
            array[i] = getIntNumber(message);
        }
    }


    public static int getIntNumber(String message) {
        int z;

        Scanner in = new Scanner(System.in);
        System.out.print(message);
        while (!in.hasNextInt()) {
            System.out.print("Only integers are allowed! Try again: ");
            in.next();
        }

        z = in.nextInt();

        return z;
    }
}
