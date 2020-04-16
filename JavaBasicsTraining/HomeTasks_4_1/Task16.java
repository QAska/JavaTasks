/*
Даны действительные числа a1, a2, … , a2n. Найти max(a1+a(2n), a2+a(2n-1) ... an+a(n+1)).
 */

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int n;
        double[] array;
        double[] sumArray;
        double max;

        n = getNumber();
        array = new double[n * 2];
        initArray(array);
        System.out.println("Initial array:");
        printArray(array);
        sumArray = getSumArray(array);
        System.out.println("Array of sums:");
        printArray(sumArray);
        max = findMax(sumArray);

        System.out.printf("max(a1+a(2n), a2+a(2n-1) ... an+a(n+1)) = %.2f", max);
    }

    public static double findMax(double[] array) {
        double max;

        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static double[] getSumArray(double[] array) {
        double[] sumArray;

        sumArray = new double[array.length / 2];
        for (int i = 0; i < array.length / 2; i++) {
            sumArray[i] = array[i] + array[array.length - i - 1];
        }

        return sumArray;
    }

    public static void printArray(double[] array) {
        DecimalFormat df;

        df = new DecimalFormat("0.00");
        for (int i = 0; i < array.length; i++) {
            System.out.print(df.format(array[i]) + " ");
        }
        System.out.println();
    }

    public static void initArray(double[] array) {
        Random random;
        double minRange;
        double maxRange;

        minRange = -100;
        maxRange = 100;
        random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = minRange + (maxRange - minRange) * random.nextDouble();
        }
    }

    public static int getNumber() {
        int z;
        Scanner in;

        in = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("Only integers are allowed! Try again: ");
        }

        z = in.nextInt();

        return z;
    }
}
