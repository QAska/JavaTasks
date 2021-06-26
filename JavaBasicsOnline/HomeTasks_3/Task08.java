/*
Составить программу, которая в массиве A[N] находит второе по величине число.
Т.е. вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов.
 */

import java.util.Random;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        int n;
        int max;

        n = getNumber();

        int[] array = new int[n];
        initArray(array);
        printArray(array);

        max = maxValue(array);

        System.out.println("Max value is " + max + ".");
    }

    public static int maxValue(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
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
        System.out.println();
    }

    public static int getNumber(){
        int z;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Only integers are available! Try again: ");
        }

        z = in.nextInt();

        return z;
    }
}
