/*
Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
Преобразовать его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным числом.
 */

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        int n;
        int last;
        int sum;
        int inverse;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer N:");
        n = in.nextInt();

        inverse = 0;
        sum = 0;
        while (n != 0) {
            last = n % 10;
            n = n / 10;
            inverse = inverse * 10 + last;
            if (last % 2 == 0) {
                sum += last;
            }
        }
        System.out.println("Sum of odds = " + sum + ", N vice versa = " + inverse);
    }
}
