/*
Написать программу нахождения суммы большего и меньшего из трех чисел.
 */

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        double a, b, c;
        double min, max;
        double sum;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = in.nextDouble();
        System.out.print("Enter b: ");
        b = in.nextDouble();
        System.out.print("Enter c: ");
        c = in.nextDouble();

        if (a >= b && a >= c) {
            max = a;
        }
        else if (b >= a && b >= c) {
            max = b;
        }
        else {
            max = c;
        }

        if (a <= b && a <= c) {
            min = a;
        }
        else if (b <= a && b <= c) {
            min = b;
        }
        else {
            min = c;
        }
        sum = max + min;
        System.out.println(sum);
    }
}
