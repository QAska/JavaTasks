/*
Дана последовательность целых чисел а1 а2,..., аn.
Выяснить, какое число встречается раньше - положительное или отрицательное.
 */

import java.util.Random;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args){
        int[] array;
        int n;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("Only positive number is allowed! Try again: ");
        }
        n = in.nextInt();

        array = new int[n];
        initArray(array);

        printArray(array);

        for (int i = 0; i < array.length;) {
            if (array[i] > 0) {
                System.out.println("Positive number is first.");
                break;
            } else if (array[i] < 0) {
                System.out.println("Negative number is first.");
                break;
            } else {
                System.out.println("First is zero.");
                break;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static void initArray(int[] array) {
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20) - 10;
        }
    }
}
