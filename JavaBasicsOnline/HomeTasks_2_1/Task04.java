/*
Составить программу: равны ли два числа а и b?
 */

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        double a, b;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();
        System.out.println("Enter b:");
        b = in.nextDouble();

        if (a == b) {
            System.out.println("a is equal b");
        }
        else {
            System.out.println("a is NOT equal b");
        }
    }
}
