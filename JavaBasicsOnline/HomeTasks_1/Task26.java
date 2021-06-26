/*
Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.
 */

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        double a;
        double b;
        double y;
        double angle;
        double s;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter y:");
        y = in.nextDouble();

        // Угол alpha из градусной меры перевести в радианы: angle = y * pi / 180
        angle = y * Math.PI / 180;

        s = (a * b * Math.sin(angle)) / 2;
        System.out.println("S = " + s);
    }
}
