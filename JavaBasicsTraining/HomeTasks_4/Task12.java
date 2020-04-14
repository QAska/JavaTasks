/*
Задана последовательность N вещественных чисел.
Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int n;
        double[] array;
        double sum;

        n = getSize();
        array = new double[n];
        initArray(array);
        System.out.println("Initial array:");
        printArray(array);

        sum = 0;
        for (int i = 2; i < array.length; i++) {
            if (isPrimeNumber(i)) {
                sum += array[i];
            }
        }

        System.out.printf("Sum = %.2f", sum);
    }

    public static boolean isPrimeNumber(int a) {
        boolean flag = true;

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void printArray(double[] array) {
        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 0; i < array.length; i++) {
            System.out.print(df.format(array[i]) + " ");
        }
        System.out.println();
    }

    public static void initArray(double[] array) {
        Random random;
        double min, max;

        random = new Random();
        min = -10;
        max = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (max - min) * random.nextDouble();
        }
    }

    public static int getSize(){
        int z;
        Scanner in;

        in = new Scanner(System.in);
        do {
            System.out.print("Enter integer n > 1: ");
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 2);

        return z;
    }
}
