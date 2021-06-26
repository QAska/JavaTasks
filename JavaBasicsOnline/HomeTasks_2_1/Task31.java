/*
Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
Определить, пройдет ли кирпич через отверстие.
 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        double a, b;
        double c;
        double x, y, z;
        double minXbrick, minYbrick;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter x:");
        x = in.nextDouble();
        System.out.println("Enter y:");
        y = in.nextDouble();
        System.out.println("Enter z:");
        z = in.nextDouble();

        if (x <= y && x <= z) {
            minXbrick = x;
            if (y < z) {
                minYbrick = y;
            }
            else {
                minYbrick = z;
            }
        }
        else if (y <= x && y <= z) {
            minXbrick = y;
            if (x < z) {
                minYbrick = x;
            }
            else {
                minYbrick = z;
            }
        }
        else {
            minXbrick = z;
            if (x < y) {
                minYbrick = x;
            }
            else {
                minYbrick = y;
            }
        }

        if (b > a) {
            c = b;
            a = b;
            b = c;
        }

        if (minXbrick < a && minYbrick < b) {
            System.out.println("The brick goes into the hole.");
        }
        else {
            System.out.println("The brick does NOT go into the hole.");
        }
    }
}
