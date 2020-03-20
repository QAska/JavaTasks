/*
Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
 */

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        double a, b;
        double resA, resB;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();

        resA = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
        resB = Math.sqrt(Math.abs(a) * Math.abs(b));

        System.out.println("ResA = " + resA);
        System.out.println("ResB = " + resB);
    }
}
