/*
Даны два угла треугольника (в градусах).
Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int angle1, angle2;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter angle1:");
        angle1 = in.nextInt();
        System.out.println("Enter angle2:");
        angle2 = in.nextInt();

        if ((angle1 + angle2) < 180) {
            System.out.println("Triangle exists,");
            if ((angle1 == 90) || (angle2 == 90) || ((180 - angle1 - angle2) == 90)) {
                System.out.println("and triangle is right triangle.");
            }
            else {
                System.out.println("but triangle is NOT right triangle.");
            }
        }
        else {
            System.out.println("Triangle does NOT exist.");
        }
    }
}
