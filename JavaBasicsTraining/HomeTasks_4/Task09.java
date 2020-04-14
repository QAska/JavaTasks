/*
Даны действительные числа а1 ,а2 ,..., аn. Поменять местами наибольший и наименьший элементы.
 */

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        int n;
        double min, max, tmp;
        double[] array;

        n = getSize();
        array = new double[n];

        initArray(array);
        System.out.println("Initial array:");
        printArray(array);

        min = findMinInArray(array);
        max = findMaxInArray(array);
        replaceMinAndMax(array, min, max);
        System.out.println("Array after replacement:");
        printArray(array);

    }

    public static void replaceMinAndMax(double[] array, double min, double max) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                array[i] = max;
            } else if (array[i] == max) {
                array[i] = min;
            }
        }
    }

    public static double findMinInArray(double[] array) {
        double min;

        min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
        return min;

    }

    public static double findMaxInArray(double[] array) {
        double max;

        max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
        return max;
    }

    public static void printArray(double[] array) {
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0; i < array.length; i++) {
            System.out.print(df.format(array[i]) + " ");
        }
        System.out.println();
    }

    public static void initArray(double[] array) {
        Random rand;
        double min, max;

        rand = new Random();
        min = -100;
        max = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (max - min) * rand.nextDouble();
        }
    }

    public static int getSize() {
        int z;
        Scanner in;

        in = new Scanner(System.in);
        do {
            System.out.print("Enter size of array, N > 1: ");
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 2);

        return z;
    }
}
