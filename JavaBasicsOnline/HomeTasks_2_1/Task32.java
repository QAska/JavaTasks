/*
Написать программу, которая по заданным трем числам определяет,
является ли сумма каких-либо двух из них положительной.
 */

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        double a, b, c;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter c:");
        c = in.nextDouble();

        if (a + b > 0 || a + c > 0 || b + c > 0) {
            System.out.println("The sum of some two numbers is positive.");
        }
        else {
            System.out.println("The sum of any two numbers is NOT positive.");
        }
    }
}
