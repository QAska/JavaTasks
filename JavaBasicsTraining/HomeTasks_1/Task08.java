/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(b + √(b^2 + 4*a*c) / 2*a) - a^3*c + b^(-2)
 */

import java.util.Scanner;

public class Task08 {
    public static void main (String args[]) {

        double a, b, c, res;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter c:");
        c = in.nextDouble();

        res = (b + Math.sqrt(b * b + 4 * a * c) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println("Result = " + res);
    }
}
