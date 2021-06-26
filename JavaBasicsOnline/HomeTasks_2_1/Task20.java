/*
Определить, делителем каких чисел а, b, с является число k.
 */

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        int a, b, c;
        int k;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextInt();
        System.out.println("Enter b:");
        b = in.nextInt();
        System.out.println("Enter c:");
        c = in.nextInt();
        System.out.println("Enter k:");
        k = in.nextInt();

        if (a % k == 0) {
            System.out.println("The number " + k + " is a divisor of " + a + ".");
        }
        if (b % k == 0) {
            System.out.println("The number " + k + " is a divisor of " + b + ".");
        }
        if (c % k == 0) {
            System.out.println("The number " + k + " is a divisor of " + c + ".");
        }
        if ((a % k != 0) && (b % k != 0) && (c % k != 0)) {
            System.out.println("Its number is a divisor of none of the numbers.");
        }
    }
}
