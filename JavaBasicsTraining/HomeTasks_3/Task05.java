/*
Написать метод (методы) для нахождения суммы большего и меньшего из трех чисел.
 */

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        double a, b, c;
        double tmp;
        double max;

        a = enterValue();
        b = enterValue();
        c = enterValue();

        tmp = findMax(a, b);
        max = findMax(tmp, c);

        System.out.println("Max is " + max + ".");
    }

    public static double findMax(double a, double b) {
        double max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        return max;
    }

    public static double enterValue() {
        double z;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        while (!in.hasNextDouble()) {
            in.next();
            System.out.println("Only numbers are allowed! Try again: ");
        }

        z = in.nextDouble();

        return z;
    }
}
