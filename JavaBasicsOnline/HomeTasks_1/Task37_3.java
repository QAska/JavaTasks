/*
Составить линейную программу,
печатающую значение True, если указанное высказывание является истинным, и False — в противном случае:
c.	Сумма цифр данного трехзначного числа N является четным числом.
 */

import java.util.Scanner;

public class Task37_3 {
    public static void main(String[] args) {
        int n;
        int sum;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter N:");
        n = in.nextInt();

        sum = 0;
        while (n != 0) {
            sum += n;
            n = n / 10;
        }

        if ((sum % 2) == 0) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
