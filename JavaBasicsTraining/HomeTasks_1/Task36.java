/*
Найти частное произведений четных и нечетных цифр четырехзначного числа.
 */

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        int n;
        int tmp;
        int a, b;
        double res;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 4-digits number:");
        n = in.nextInt();

        a = 1;
        b = 1;
        while (n != 0) {
            tmp = n % 10;
            if ((tmp % 2) == 0) {
                a *= tmp;
            }
            else {
                b *= tmp;
            }
             n /= 10;
        }

        res = a / (double)b;

        System.out.println(res);
    }
}
