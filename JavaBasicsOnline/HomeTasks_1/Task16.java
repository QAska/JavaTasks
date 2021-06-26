/*
Найти произведение цифр заданного четырехзначного числа.
 */

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int n;
        int res;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        n = in.nextInt();

        res = 0;
        while (n != 0) {
            res = res + n % 10;
            n = n / 10;
        }
        System.out.println("Sum of digits is " + res);
    }
}