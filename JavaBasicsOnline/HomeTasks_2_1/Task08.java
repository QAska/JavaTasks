/*
Составить программу нахождения наименьшего из квадратов двух чисел а и b.
 */

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        double a, b;
        double sqA, sqB;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();

        sqA = Math.pow(a, 2);
        sqB = Math.pow(b, 2);

        if (sqA < sqB) {
            System.out.println("squared a is less");
        }
        else if (sqB < sqA) {
            System.out.println("squared b is less");
        }
        else {
            System.out.println("Numbers are equal");
        }
    }
}
