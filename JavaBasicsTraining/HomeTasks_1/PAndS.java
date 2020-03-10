/*
Заданы координаты трех вершин треугольника (х1, у1),(х2, у2),(х3, у3).
Найти его периметр и площадь.
 */

import java.util.Scanner;

public class PAndS {
    public static void main(String args[]) {
        Double x1, y1, x2, y2, x3, y3, a, b, c, p, p2, s;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1:");
        x1 = in.nextDouble();
        System.out.println("Enter y1:");
        y1 = in.nextDouble();

        System.out.println("Enter x2:");
        x2 = in.nextDouble();
        System.out.println("Enter y2:");
        y2 = in.nextDouble();

        System.out.println("Enter x3:");
        x3 = in.nextDouble();
        System.out.println("Enter y3:");
        y3 = in.nextDouble();

        a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        p = a + b + c;

        p2 = p / 2;
        s = Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p2 -c));

        System.out.println("P = " + p);
        System.out.println("S = " + s);
    }
}
