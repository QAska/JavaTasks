/*
Найти max{min(a, b), min(c, d)}.
 */

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        double a, b, c, d;
        double min1, min2;
        double max;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = in.nextDouble();
        System.out.print("Enter b: ");
        b = in.nextDouble();
        System.out.print("Enter c: ");
        c = in.nextDouble();
        System.out.print("Enter d: ");
        d = in.nextDouble();

        if (a < b) {
            min1 = a;
        }
        else {
            min1 = b;
        }

        if (c < d) {
            min2 = c;
        }
        else {
            min2 = d;
        }

        if (min1 > min2) {
            max = min1;
        }
        else {
            max = min2;
        }
        System.out.println("MAX(min(a, b), min(c, d)) = " + max);
    }
}
