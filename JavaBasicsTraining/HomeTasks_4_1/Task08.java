/*
Дан массив действительных чисел, размерность которого N.
Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        int n;
        double[] array;
        int[] count;

        n = getNumber();
        array = new double[n];
        initArray(array);
        System.out.println("Initial array is: ");
        printArray(array);

        count = getNumOfElements(array);

        System.out.println("Number of positive elements: " + count[0] + ".");
        System.out.println("Number of negative elements: " + count[1] + ".");
        System.out.println("Number of zero: " + count[2] + ".");

    }

    public static int[] getNumOfElements(double[] array) {
        int[] num = new int[3];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                num[2]++; // counter of zero
            } else if (array[i] > 0) {
                num[0]++; // positive counter
            } else {
                num[1]++; // negative counter
            }
        }

        return num;
    }

    public static void printArray(double[] array) {
        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 0; i < array.length; i++) {
            System.out.print(df.format(array[i]) + " ");
        }
        System.out.println();
    }

    public static void initArray(double[] array) {
        double maxRange, minRange;
        Random rand;

        minRange = -100;
        maxRange = 100;
        rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = minRange + (maxRange - minRange) * rand.nextDouble();
        }
    }

    public static int getNumber() {
        int z;

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter size of the array, N > 0: ");
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 1);

        return z;
    }
}
