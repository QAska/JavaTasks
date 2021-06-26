/*
Найдите наибольшую цифру данного натурального числа.
 */

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        int n;
        int biggest;
        int tmp;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer n:");
        n = in.nextInt();

        biggest = 0;
        while (n != 0) {
            tmp = n % 10;
            if (tmp > biggest) {
                biggest = tmp;
            }
            n /= 10;
        }

        System.out.println("The biggest digit is " + biggest + ".");
    }
}
