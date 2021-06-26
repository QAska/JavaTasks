/*
В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

import java.util.Random;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int[] array;
        int size;
        int k;
        String message;
        int sum;

        message = "Enter array size: ";
        size = getValue(message);
        message = "Enter number K > 0: ";
        k = getValue(message);

        if (k == 0) {
            System.out.println("Division by zero is not allowed!");
        } else {
            array = new int[size];

            initArray(array);
            printArray(array);

            sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (isMultiple(array[i], k)) {
                    sum += array[i];
                }
            }

            System.out.println("Sum of the elements that are multiple of " + k + " is " + sum + ".");
        }

    }

    public static boolean isMultiple(int a, int b) {
        if (a % b == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void initArray(int[] arr) {
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int getValue(String message) {
        int value;

        Scanner in = new Scanner(System.in);
        System.out.println(message);
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Only integers are allowed. Try again: ");
        }

        value = in.nextInt();

        return value;
    }

}
