/*
Вычислить значение функции:
x^2 - 3x + 9 если x <= 3;
1 / (x^3 + 6) если x > 3.
 */

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        double x;
        double res;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();

        if (x <= 3) {
            res = Math.pow(x, 2) - 3 * x + 9;
        }
        else {
            res = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("Result = " + res);
    }
}
