/*
Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника.
 */

import java.util.Scanner;

public class RectangleSquare {
    public static void main(String[] args) {
        int a;
        double b;
        double sq;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextInt();

        b = a / 2.0;

        sq = a * b;
        System.out.println("Square = " + sq);
    }
}
