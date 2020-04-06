/*
На плоскости заданы своими координатами n точек.
Написать метод (методы), определяющие, между какими из пар точек самое большое расстояние.
Координаты точек занести в массив.
 */

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        int n;
        double maxDist;
        double xDot1, xDot2;
        double yDot1, yDot2;

        n = getNumber();

        double[] dots = new double[n * 2];
        for (int i = 0; i < dots.length; i++) {
            if (i % 2 == 0) {
                dots[i] = getDot("Enter x: ");
            } else {
                dots[i] = getDot("Enter y: ");
            }
        }

        maxDist = 0;
        xDot1 = 0;
        yDot1 = 0;
        xDot2 = 0;
        yDot2 = 0;
        for (int i = 0; i < dots.length - 1; i += 2) {
            for (int j = i + 2; j < dots.length - 1; j += 2) {
                double dist = distance(dots[i], dots[i + 1], dots[j], dots[j + 1]);
                if (dist > maxDist) {
                    maxDist = dist;
                    xDot1 = dots[i];
                    yDot1 = dots[i + 1];
                    xDot2 = dots[j];
                    yDot2 = dots[j + 1];
                }
            }
        }

        System.out.print("Max distance is " + maxDist);
        System.out.print(" between dots " + "(" + xDot1 + ";" + yDot1 + ") and " + "(" + xDot2 + ";" + yDot2 + ").");
    }

    public static double distance(double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

    }

    public static double getDot(String message) {
        double z;

        Scanner in = new Scanner(System.in);
        System.out.println(message);
        while (!in.hasNextDouble()) {
            in.next();
            System.out.println("Only numbers are allowed! Try again: ");
        }

        z = in.nextDouble();

        return z;
    }

    public static int getNumber() {
        int z;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of dots: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Only integer number is allowed! Try again: ");
        }

        z = in.nextInt();

        return z;
    }
}
