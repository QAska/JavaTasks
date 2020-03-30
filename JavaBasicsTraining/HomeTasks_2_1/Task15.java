/*
Даны действительные числа х и у, не равные друг другу.
Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.
 */

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        double x, y;
        double newX, newY;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();
        System.out.println("Enter y:");
        y = in.nextDouble();

        if (x < y) {
            newX = (x + y) / 2;
            newY = x * y * 2;
        }
        else {
            newX = x * y * 2;
            newY = (x + y) / 2;
        }
        System.out.println(newX + ", " + newY);
    }
}
