/*
Составить программу, которая определит площадь какого треугольника больше.
 */

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        double a1, b1, c1;
        double a2, b2, c2;
        double p1, p2, p3;
        double s1, s2, s3;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a for the first triangle:");
        a1 = in.nextDouble();
        System.out.println("Enter b for the first triangle:");
        b1 = in.nextDouble();
        System.out.println("Enter c for the first triangle:");
        c1 = in.nextDouble();

        if (a1 + b1 <= c1 | a1 + c1 <= b1 | b1 + c1 <= a1) {
            System.out.println("Triangle is not possible");
            return;
        }

        System.out.println("Enter a for the second triangle:");
        a2 = in.nextDouble();
        System.out.println("Enter b for the second triangle:");
        b2 = in.nextDouble();
        System.out.println("Enter c for the second triangle:");
        c2 = in.nextDouble();

        if (a2 + b2 <= c2 | a2 + c2 <= b2 | b2 + c2 <= a2) {
            System.out.println("Triangle is not possible");
            return;
        }

        p1 = (a1 + b1 + c1) / 2;
        p2 = (a2 + b2 + c2) / 2;

        s1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
        s2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));

        if (s1 > s2) {
            System.out.println("Area of the first triangle is bigger");
        }
        else if (s2 > s1) {
            System.out.println("Area of the second triangle is bigger");
        }
        else {
            System.out.println("Areas are equal");
        }
    }
}
