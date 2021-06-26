/*
Даны действительные числа а, b, с.
Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.
 */

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        double a, b, c;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();
        System.out.println("Enter c:");
        c = in.nextDouble();

        if (a > b && b > c) {
            a = a * 2;
            b = b * 2;
            c = c * 2;
        }
        else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
