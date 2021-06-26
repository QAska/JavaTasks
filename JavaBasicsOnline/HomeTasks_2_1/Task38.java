/*
Вычислить значение функции:
x^2, если 0 <= x <= 3;
4 если x > 3 или x < 0.
 */

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        double x;
        double res;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();

        if (x >= 0 && x <= 3) {
            res = Math.pow(x, 2);
        }
        else {
            res = 4;
        }

        System.out.println("Result = " + res);
    }
}
