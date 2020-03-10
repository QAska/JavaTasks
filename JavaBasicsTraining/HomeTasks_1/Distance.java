/*
Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
 */

import java.util.Scanner;

public class Distance {
    public static void main(String args[]) {
        Double x1, y1, x2, y2, d;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1:");
        x1 = in.nextDouble();
        System.out.println("Enter y1:");
        y1 = in.nextDouble();
        System.out.println("Enter x2:");
        x2 = in.nextDouble();
        System.out.println("Enter y2:");
        y2 = in.nextDouble();

        d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance = " + d);
    }
}
