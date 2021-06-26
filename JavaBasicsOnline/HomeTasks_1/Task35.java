/*
Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.
 */

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        int m, n;
        double res;
        int resL, resR;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter M:");
        m = in.nextInt();
        System.out.println("Enter N:");
        n = in.nextInt();

        res = m / (double)n;
        resL = (int)res % 10;
        resR = (int)((res - (int)res) * 10 % 10);
        System.out.println("Your result: " + res);
        System.out.println(resR +", " + resL);
    }
}
