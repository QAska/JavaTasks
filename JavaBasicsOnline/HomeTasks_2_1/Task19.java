/*
Подсчитать количество положительных среди чисел а, b, с.
 */

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        double a, b, c;
        int count;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter c:");
        c = in.nextDouble();

        count = 0;
        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }

        System.out.println("Number of positive numbers: " + count);
    }
}
