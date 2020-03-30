/*
Даны две точки А(х1, у1) и В(х2, у2).
Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.
 */

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        double x1, y1;
        double x2, y2;
        double len1, len2;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1:");
        x1 = in.nextDouble();
        System.out.println("Enter y1:");
        y1 = in.nextDouble();

        System.out.println("Enter x2:");
        x2 = in.nextDouble();
        System.out.println("Enter y2:");
        y2 = in.nextDouble();

        len1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        len2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

        if (len1 < len2) {
            System.out.println("A is closer to the origin");
        }
        else if (len2 < len1) {
            System.out.println("B is closer to the origin");
        }
        else {
            System.out.println("A is on the same distance from the origin");
        }
    }
}
