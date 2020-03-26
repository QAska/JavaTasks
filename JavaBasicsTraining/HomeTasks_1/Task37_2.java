/*
Составить линейную программу,
печатающую значение True, если указанное высказывание является истинным, и False — в противном случае:
b.	Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
 */

import java.util.Scanner;

public class Task37_2 {
    public static void main(String[] args) {
        int n;
        int a, b;
        int temp;
        int count;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 4-digits number:");
        n = in.nextInt();

        a = 0;
        b = 0;
        count = 0;
        temp = n;
        while (count < 2) {
            a += (temp % 10);
            temp = temp /10;
            count++;
        }
        while (count < 4) {
            b += (temp % 10);
            temp = temp /10;
            count++;
        }

        if (a == b) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
