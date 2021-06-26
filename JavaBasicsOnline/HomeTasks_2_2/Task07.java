/*
Вычислить значения функции на отрезке [а,b] c шагом h:
y = x, x > 2; y = -x, x <=2.
 */

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        double a, b, h;
        double y;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter h:");
        h = in.nextDouble();

        for (double x = a; x <= b; x += h) {
            if (x <= 2) {
                y = -x;
            }
            else {
                y = x;
            }

            System.out.println("x = " + x + ", y = " + y);
        }
    }
}
