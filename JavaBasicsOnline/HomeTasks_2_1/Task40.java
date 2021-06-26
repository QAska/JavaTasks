/*
Вычислить значение функции:
-x^3 + 9 если x <= 13;
-3 / (x + 1) если x > 13.
 */

import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        double x;
        double res;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();

        if (x <= 13) {
            res = -Math.pow(x, 3) + 9;
        }
        else {
            res = -3 / (x + 1);
        }

        System.out.println("Result = " + res);
    }


}
