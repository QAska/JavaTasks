/*	Для данных областей составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
c.	x = [0; 4]; y = [0; 4]; x^2 + y^2 <= 16;  or  x = [0; 5]; y = [-5; 0]; x^2 + y^2 <= 25;
 */

import java.util.Scanner;

public class Task38_3 {
    public static void main(String[] args) {
        double x, y;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();
        System.out.println("Enter y:");
        y = in.nextDouble();

        if (((x >= 0) && (x <= 4) && (y >= 0) && (y <= 4) && ((Math.pow(x, 2) + Math.pow(y, 2)) <= 16)) ||
        ((x >= 0) && (x <= 5) && (y >= -5) && (y <= 0) && ((Math.pow(x, 2) + Math.pow(y, 2)) <= 25))) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
