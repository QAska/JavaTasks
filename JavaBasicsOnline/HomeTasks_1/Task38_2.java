/*	Для данных областей составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
b.	x = [-4; 4], y = [-3; 0] or x = [-2; 2], y = [0; 4]
 */

import java.util.Scanner;

public class Task38_2 {
    public static void main(String[] args) {
        double x, y;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();
        System.out.println("Enter y:");
        y = in.nextDouble();

        if (((x >= -4) && (x <= 4 ) && (y >= -3) && (y <= 0)) || ((x >= -2) && (x <= 2) && (y >= 0) && (y <= 4))) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
