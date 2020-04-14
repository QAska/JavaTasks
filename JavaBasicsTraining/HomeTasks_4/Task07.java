/*
Дана последовательность действительных чисел а1 ,а2 ,..., аn.
Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        int n;
        double[] array;
        double z;
        int count;
        String message;

        message = "Enter the array size: ";
        n = getNumber(message);
        array = new double[n];
        message = "Enter Z: ";
        z = getNumber(message);

        initArray(array);
        System.out.println("Initial array:");
        printArray(array);
        count = replaceArray(array, z);

        System.out.println("Array after replacements:");
        printArray(array);
        System.out.println("Number of replacements: " + count + ".");

    }

    public static int replaceArray(double[] arr, double z) {
        int numReplacement;

        numReplacement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                numReplacement++;
            }
        }

        return numReplacement;
    }

    public static void printArray(double[] arr) {
        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(df.format(arr[i]) + " ");
        }
        System.out.println();
    }

    public static void initArray(double[] arr) {
        Random rand = new Random();
        double minRange, maxRange;

        minRange = -100;
        maxRange = 100;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = minRange + (maxRange - minRange) * rand.nextDouble();
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
