/*
Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
Определить, будут ли они расположены на одной прямой.
 */

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        double x1, x2, x3;
        double y1, y2, y3;
        double difX1, difX2;
        double difY1, difY2;

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

        difX1 = x2 - x1;
        difX2 = x3 - x1;
        difY1 = y2 - y1;
        difY2 = y3 - y1;

        if ((difX1 * difY2) - (difX2 * difY1) == 0) {
            System.out.println("Points belong to one line.");
        }
        else {
            System.out.println("Points do NOT belong to one line.");
        }
    }
}
