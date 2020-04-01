/*
Вычислить значение функции:
-x^2 + x - 9 если x >= 8;
1 / (x^4 - 6) если x < 8.
 */

import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {
        double x;
        double res;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();

        if (x >= 8) {
            res = -Math.pow(x, 2) + x - 9;
        }
        else {
            res = 1 / (Math.pow(x, 4) - 6);
        }

        System.out.println("Result = " + res);
    }
}
