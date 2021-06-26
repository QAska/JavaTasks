/*
Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        double a;
        double s;

        a = enterValue();
        s = triangleArea(a) * 6;

        System.out.println("Are is " + s + ".");
    }

    public static double triangleArea(double a) {

        return (Math.sqrt(3) / 4) * Math.pow(a, 2);
    }

    public static double enterValue() {
        double z;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        while (!in.hasNextDouble()) {
            in.next();
            System.out.println("Only numbers are allowed! Try again: ");
        }

        z = in.nextDouble();

        return z;
    }
}
