/*
Даны три действительных числа.
Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
 */

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        double a, b, c;
        double res1, res2, res3;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter c:");
        c = in.nextDouble();

        if (a < 0) {
            res1 = Math.pow(a, 4);
        }
        else {
            res1 = Math.pow(a, 2);
        }

        if (b < 0) {
            res2 = Math.pow(b, 4);
        }
        else {
            res2 = Math.pow(b, 2);
        }

        if (c < 0) {
            res3 = Math.pow(c, 4);
        }
        else {
            res3 = Math.pow(c, 2);
        }

        System.out.println(res1 + ", " + res2 + ", " + res3);
    }
}
