/*
Составить программу, которая определит площадь какого круга меньше.
 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        double r1, r2;
        double sq1, sq2;

        Scanner in= new Scanner(System.in);
        System.out.println("Enter r1:");
        r1 = in.nextDouble();
        System.out.println("Enter r2:");
        r2 = in.nextDouble();

        sq1 = Math.PI * Math.pow(r1, 2);
        sq2 = Math.PI * Math.pow(r2, 2);

        if (sq1 < sq2) {
            System.out.println("The area of the first circle is less");
        }
        else if (sq2 < sq1) {
            System.out.println("The area of the second circle is less");
        }
        else {
            System.out.println("The areas of the circles are equal");
        }

    }
}
