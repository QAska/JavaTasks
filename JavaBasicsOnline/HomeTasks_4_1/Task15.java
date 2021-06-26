/*
Дана последовательность действительных чисел n a1,a2, ... ,an.
Указать те ее элементы, которые принадлежат отрезку [с, d].
 */

import com.sun.corba.se.impl.encoding.CDROutputObject;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int size;
        int c, d;
        double[] array;
        String message;

        message = "Enter array size: ";
        size = getNumber(message);
        array = new double[size];
        initArray(array);
        System.out.println("Initial array:");
        printArray(array);

        message = "Enter bottom border, c: ";
        c = getNumber(message);
        message = "Enter bottom border, d: ";
        d = getNumber(message);

        System.out.println("Elements belong [" + c + "," + d + "]: ");
        printElements(array, c, d);


    }

    public static void printElements(double[] array, double c, double d) {
        DecimalFormat df;

        df = new DecimalFormat("#.##");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= c && array[i] <= d) {
                System.out.print(df.format(array[i]) + " ");
            }
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        DecimalFormat df;

        df = new DecimalFormat("#.##");
        for (int i = 0; i < array.length; i++) {
            System.out.print(df.format(array[i]) + " ");
        }
        System.out.println();
    }

    public static void initArray(double[] array) {
        double minRange, maxRange;
        Random random;

        minRange = -100;
        maxRange = 100;
        random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = minRange + (maxRange - minRange) * random.nextDouble();
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
