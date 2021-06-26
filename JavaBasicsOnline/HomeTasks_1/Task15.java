/*
Написать программу, которая выводит на экран первые четыре степени числа π.
 */

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter power:");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(Math.pow(Math.PI, i));
        }

    }
}
