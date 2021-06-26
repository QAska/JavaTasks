/*
Вычислить значения функции на отрезке [а,b] c шагом h:
y = (x + c) * 2, x = 15; y = (x - c) + 6, x != 15.
 */

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        double a, b, h, c;
        double y;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter c:");
        c = in.nextDouble();
        System.out.println("Enter h:");
        h = in.nextDouble();

        for (double x = a; x <= b; x += h) {
            if (x != 15) {
                y = (x + c) * 2;
            }
            else {
                y = (x - c) + 6;
            }

            System.out.println("x = " + x + ", y = " + y);
        }
    }
}
