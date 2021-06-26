/*
Даны числа X, Y, Z, Т — длины сторон четырехугольника.
Написать метод (методы) вычисления его площади, если угол между сторонами длиной X и Y — прямой.
 */

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        double x, y, z, t;
        double s1, s2, s;
        double hypotenuse;
        String message;

        message = "Enter 1st side: ";
        x = getSide(message);
        message = "Enter 2nd side: ";
        y = getSide(message);
        message = "Enter 3rd side: ";
        z= getSide(message);
        message = "Enter 4th side: ";
        t = getSide(message);


        s1 = getTriangleArea1(x, y);
        hypotenuse = getHypotenuse(x, y);
        s2 = getTriangleArea2(hypotenuse, z, t);
        s = s1 + s2;

        System.out.println("Quadrangle area = " + s);
    }

    public static double getHypotenuse(double a, double b) {
        double hypotenuse;
        hypotenuse = Math.sqrt(a * a + b * b);

        return hypotenuse;
    }

    public static double getTriangleArea1(double a, double b) {
        double s;
        s = a * b / 2;
        return s;
    }

    public static double getTriangleArea2(double a, double b, double c) {
        double p;
        double s;

        p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return s;
    }

    public static double getSide(String message) {
        double side;

        Scanner in = new Scanner(System.in);
        System.out.println(message);
        while (!in.hasNextDouble()) {
            in.next();
        }

        side = in.nextDouble();

        return side;
    }
}
