/*
Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.
 */

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        double x, y;
        double z;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();
        System.out.println("Enter y:");
        y = in.nextDouble();

        if (x >= y) {
            System.out.println("X = " + x + ", Y = " + y);
        }
        else {
            z = x;
            x = y;
            y = z;
            System.out.println("X = " + x + ", Y = " + y);
        }
    }
}
