/*
Дана сторона равностороннего треугольника.
Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
 */

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        double a;
        double s, h, rIn, rOut;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();

        h = (Math.sqrt(3)/2) * a;
        s = a * h /2;
        rIn = a / (2 * Math.sqrt(3));
        rOut = a / Math.sqrt(3);

        System.out.println("s = " + s);
        System.out.println("h = " + h);
        System.out.println("rIn = " + rIn);
        System.out.println("rOut = " + rOut);
    }
}
