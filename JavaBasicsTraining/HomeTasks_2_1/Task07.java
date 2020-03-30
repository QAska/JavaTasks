/*
Составить программу нахождения модуля выражения a * x * x + b * x + c при заданных значениях a, b, c и х.
 */

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        double a, b, c, x;
        double res;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a");
        a = in.nextDouble();
        System.out.println("Enter b");
        b = in.nextDouble();
        System.out.println("Enter c");
        c = in.nextDouble();
        System.out.println("Enter x");
        x = in.nextDouble();

        res = a * x * x + b * x + c;

        if (res < 0) {
            res = - res;
        }
        System.out.println(res);
    }
}
