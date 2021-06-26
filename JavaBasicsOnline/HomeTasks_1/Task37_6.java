/*
Составить линейную программу,
печатающую значение True, если указанное высказывание является истинным, и False — в противном случае:
f.	Треугольник со сторонами а,b,с является равнобедренным.
 */

import java.util.Scanner;

public class Task37_6 {
    public static void main(String[] args) {
        double a, b, c;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter c:");
        c = in.nextDouble();

        if ((a == b) || (b == c) || (c == a)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
