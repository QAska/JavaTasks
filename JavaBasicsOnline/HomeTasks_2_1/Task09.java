/*
Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.
 */

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        double a, b, c;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter c:");
        c = in.nextDouble();

        if (a + b <= c | a + c <= b | b + c <= a) {
            System.out.println("Triangle is not possible");
        }
        else if (a == b && a == c) {
            System.out.println("The triangle is equilateral");
        }
        else {
            System.out.println("The triangle is NOT equilateral");
        }
    }
}
