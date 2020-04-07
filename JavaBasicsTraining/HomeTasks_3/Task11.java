/*
Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3] или D[3] + D[4] + D[5] или D[4] + D[5] + D[6].
Т.е. написать метод (методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
 */

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int n, k, m;
        int sum;
        String message;

        message = "Enter array size: ";
        n = getNumber(message);
        message = "Enter bottom line (lower element): ";
        k = getNumber(message);
        message = "Enter upper bound (top element) that less or equal " + (n - 1) + ": ";
        m = getNumber(message);

        int[] array = new int[n];
        initArray(array);
        printArray(array);
        sum = getSum(array, k, m);

        System.out.println("Sum of elements from " + k + " to " + m + " is " + sum + ".");
    }

    public static int getSum(int[] z, int k, int m) {
        int sum;

        sum = 0;
        for (int i = k; i <= m; i++) {
            sum += z[i];
        }

        return sum;
    }

    public static void initArray(int[] z) {
        Random rand = new Random();

        for (int i = 0; i < z.length; i++) {
            z[i] = rand.nextInt(100);
        }

    }

    public static void printArray(int[] z) {

        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }
        System.out.println();
    }

    public static int getNumber(String message) {
        int z;

        Scanner in = new Scanner(System.in);
        System.out.print(message);
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("Only integers are allowed! Try again:");
        }
        z = in.nextInt();

        return z;
    }
}
