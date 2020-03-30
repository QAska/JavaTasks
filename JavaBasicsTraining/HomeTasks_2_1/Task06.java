/*
Составить программу: определения наибольшего из двух чисел а и b.
 */

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        double a, b;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();

        if (a > b) {
            System.out.println("a is biggest number");
        }
        else if (b > a) {
            System.out.println("b is biggest number");
        }
        else {
            System.out.println("Numbers are equal");
        }
    }
}
