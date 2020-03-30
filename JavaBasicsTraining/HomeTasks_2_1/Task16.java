/*
На плоскости ХОY задана своими координатами точка А.
Указать, где она расположена (на какой оси или в каком координатном угле).
 */

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        double x, y;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();
        System.out.println("Enter y:");
        y = in.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("The point is located at the origin.");
        }
        else if (x > 0 && y > 0) {
            System.out.println("The point is located in the I quarter.");
        }
        else if (x > 0 && y < 0) {
            System.out.println("The point is located in the II quarter.");
        }
        else if (x < 0 && y < 0) {
            System.out.println("The point is located in the III quarter.");
        }
        else if (x < 0 && y > 0) {
            System.out.println("The point is located in the IV quarter.");
        }
        else if (x == 0 && y != 0) {
            System.out.println("The point is located on the X axis.");
        }
        else if (x != 0 && y == 0) {
            System.out.println("The point is located on the Y axis.");
        }
    }
}
