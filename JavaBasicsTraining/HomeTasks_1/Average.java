/*
Составить алгоритм нахождения среднего арифметического двух чисел.
 */

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        double a;
        double b;
        double avg;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();

        avg = (a + b) / 2;
        System.out.println("Average is " + avg);
    }
}
