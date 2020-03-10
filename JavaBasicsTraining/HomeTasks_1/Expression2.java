/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(a/c) * (b/d) - (a*b-c)/(c*d)
 */

import java.util.Scanner;

public class Expression2 {
    public static void main(String args[]) {
        double a, b, c, d, res;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter c:");
        c = in.nextDouble();
        System.out.println("Enter d:");
        d = in.nextDouble();

        res = (a / c) * (b / d) - (a * b - c) / (c * d);
        System.out.println("Result = " + res);
    }
}
