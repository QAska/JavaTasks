/*
Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        double x1, y1;
        double x2, y2;
        double x3, y3;
        double a, b, c;
        double p;
        double s;
        String message;

        message = "Enter x1: ";
        x1 = enterDouble(message);
        message = "Enter y1: ";
        y1 = enterDouble(message);
        message = "Enter x2: ";
        x2 = enterDouble(message);
        message = "Enter y2: ";
        y2 = enterDouble(message);
        message = "Enter x3: ";
        x3 = enterDouble(message);
        message = "Enter y3: ";
        y3 = enterDouble(message);

        a = getSide(x1, y1, x2, y2);
        b = getSide(x2, y2, x3, y3);
        c = getSide(x3, y3, x1, y1);

        if (ifTriangleExists(a, b, c)) {
            p = halfPerimeter(a, b, c);

            s = triangleArea(a, b, c, p);

            System.out.println("Area of a triangle is " + s + ".");
        } else {
            System.out.println("Triangle is NOT possible.");
        }
    }

    public static double enterDouble(String message) {
        double z;
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        while (!in.hasNextDouble()) {
            in.next();
            System.out.println("Double only is possible! Try again: ");
        }

        z = in.nextDouble();

        return z;
    }

    public static double getSide(double x1, double y1, double x2, double y2) {
        double side;
        side = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        return side;
    }

    public static double halfPerimeter(double a, double b, double c) {

        return (a + b + c) / 2;
    }

    public static double triangleArea(double a, double b, double c, double p) {

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static boolean ifTriangleExists(double a, double b, double c) {
        boolean flag;

        flag = a + b > c || b + c > a || c + a > b;

        return flag;
    }
}
