/*
Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        int n;
        int sum;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer n:");
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Entered value is not Integer. Try again:");
        }
        n = in.nextInt();

        sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum is " + sum + ".");
    }
}
