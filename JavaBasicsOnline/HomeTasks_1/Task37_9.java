/*
Составить линейную программу,
печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
i.	График функции y = ax2 + bx + c проходит через заданную точку с координатами (m, n).
 */

import java.util.Scanner;

public class Task37_9 {
    public static void main(String[] args) {
        double a, b, c, x, y;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter c:");
        c = in.nextDouble();
        System.out.println("Enter x:");
        x = in.nextDouble();
        System.out.println("Enter y:");
        y = in.nextDouble();

        if (y == a * Math.pow(x, 2) + b * x + c) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
