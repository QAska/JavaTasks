/*	Для данных областей составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
a.	x = [-4; 4], y = [0; 4], y <= x + 4, y <= 4 – x
 */

import java.util.Scanner;

public class Task38_1 {
    public static void main(String[] args) {
        double x, y;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();
        System.out.println("Enter y:");
        y = in.nextDouble();

        if ((x <= 4) && (x >= -4) && (y >= 0) && (y <= 4) && (y <= x + 4) && (y >= 4 - x)) {
                System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
