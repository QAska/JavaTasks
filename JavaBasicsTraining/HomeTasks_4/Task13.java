/*
Определить количество элементов последовательности натуральных чисел,
кратных числу М и заключенных в промежутке от L до N.
 */

import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int size;
        int l, n;
        int m;
        int counter;
        int[] array;
        String message;

        message = "Enter size of the array, integer number: ";
        size = getNumber(message);
        array = new int[size];

        initArray(array);
        System.out.println("Initial array:");
        printArray(array);

        message = "Enter bottom border, l: ";
        l = getNumber(message);
        message = "Enter top border, n: ";
        n = getNumber(message);
        message = "Enter divider to check, m: ";
        m = getNumber(message);

        counter = 0;
        System.out.print("Elements that are multiples of " + m + " in the range from " + l + " to " + n + ": ");
        for (int i = 0; i < array.length; i++) {
            if (isInRange(array[i], l, n) && isMultipleOfM(array[i], m)) {
                System.out.print(array[i] + " ");
                counter++;
            }
        }
        System.out.println();
        System.out.println("Amount of elements that are multiples of " + m + " is equal " + counter + "." );

    }

    public static boolean isMultipleOfM(int a, int m) {
        boolean flag;

        flag = false;
        if (a != 0 && a % m == 0) {
            flag = true;
        }

        return flag;
    }


    public static boolean isInRange(int a, int b, int c) {
        boolean flag;

        flag = false;
        if (a >= b && a <= c) {
            flag = true;
        }

        return flag;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void initArray(int[] array) {
        Random random;

        random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
        }
    }

    public static int getNumber(String message) {
        int z;
        Scanner in;

        in = new Scanner(System.in);
        System.out.print(message);
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("Only integers are allowed! Try again: ");
        }
        z = in.nextInt();

        return z;
    }

}
