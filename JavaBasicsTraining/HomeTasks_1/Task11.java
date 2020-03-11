/*
Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
 */

import java.util.Scanner;

public class Task11 {
    public static void main(String args[]) {
        Double a, b, c, p, s;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();

        c = Math.sqrt(a * a + b * b);
        p = a + b + c;
        s = a * b / 2;

        System.out.println("P = " + p);
        System.out.println("S = " + s);
    }
}
