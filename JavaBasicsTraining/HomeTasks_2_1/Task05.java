/*
Составить программу: определения наименьшего из двух чисел а и b.
 */

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        double a, b;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();

        if (a < b) {
            System.out.println("a is smallest number");
        }
        else if (b < a) {
            System.out.println("b is smallest number");
        }
        else {
            System.out.println("Numbers are equal");
        }
    }
}
