/*
Дан линейный массив x1,x2, x3, ... xn. Получить действительную квадратную матрицу порядка n:
x1   x2   ... xn
x1^2 x2^2 ... xn^2
...
x1^n x2^n ... xn^n
 */

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        int n;
        double[] linearArray;
        double[][] doubleArray;
        n = getNumber();
        linearArray = new double[n];
        initLinearArray(linearArray);
        System.out.println("Initial linear array:");
        printLinearArray(linearArray);
        doubleArray = new double[n][n];
        initDoubleArray(doubleArray, linearArray);
        System.out.println("-----------");
        printDoubleArray(doubleArray);
    }

    public static void initDoubleArray(double[][] doubleArray, double[] linearArray) {
        for (int i = 0; i < doubleArray.length; i++) {

            for (int j = 0; j < doubleArray.length; j++) {
                doubleArray[i][j] = Math.pow(linearArray[j], i + 1);
            }
        }
    }

    public static void printDoubleArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                System.out.printf("%.2f", array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printLinearArray(double[] array) {
        DecimalFormat df;

        df = new DecimalFormat("0.00");
        for (int i = 0; i < array.length; i++) {
            System.out.print(df.format(array[i]) + " ");
        }
        System.out.println();
    }

    public static void initLinearArray(double[] linearArray) {
        Random random;
        double minRange;
        double maxRange;

        minRange = -10.0;
        maxRange = 10.0;
        random = new Random();
        for (int i = 0; i < linearArray.length; i++) {
            linearArray[i] = minRange + (maxRange - minRange) * random.nextDouble();
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
